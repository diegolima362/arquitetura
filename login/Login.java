package login;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/.login.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\.login.obj");
    private String nome;
    private String senha;
    private long CPF;

    /**
     *
     * @param nome
     * @param senha
     * @param cpf
     */
    public Login(String nome, String senha, long cpf) {
        this.nome = nome;
        this.senha = senha;
        this.CPF = cpf;
    }

    /**
     *
     */
    public Login() {

    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @return
     */
    public long getCPF() {
        return this.CPF;
    }

    /**
     *
     * @return
     */
    public static boolean getUserStatusAtivo() {
        return Files.exists(getOSPath());
    }

    /**
     *
     * @return
     */
    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    /**
     *
     * @param login
     * @return
     */
    public static boolean gravarLogin(Login login) {
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (getUserStatusAtivo() == true) {
                JOptionPane.showMessageDialog(null, "O sistema já possui administrador!", "Falha",
                        JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            new File("./Data").mkdir();
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);

            oos.writeObject(login);
            fos.flush();
            fos.close();
            oos.flush();
            oos.close();
            return true;
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return false;
    }

    /**
     *
     * @return
     */
    public static Login lerLogin() {

        Login login = null;
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getUserStatusAtivo()) {
            JOptionPane.showMessageDialog(null, "O sistema não possui administrador cadastrado!", "Falha",
                    JOptionPane.INFORMATION_MESSAGE);
            new File("./Data").mkdir();
        }

        try {
            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            login = (Login) ois.readObject();

            fis.close();
            ois.close();
        } catch (EOFException e) {
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login;
    }

    private static void removeLogin() {
        getOSPath().toFile().delete();
    }

    /**
     *
     * @param cpf
     * @param tle
     */
    public static void restaurar(long cpf, TelaLogin tle) {

        if (getUserStatusAtivo()) {
            removeLogin();
            TelaCadastroUser tlc = new TelaCadastroUser(cpf, tle);
            tlc.setVisible(true);
        }
    }

}
