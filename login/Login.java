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

public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATH = Paths.get("./Data/login.dat");
    private String nome;
    private String senha;
    private long CPF;

    public Login(String nome, String senha, long cpf) {
        this.nome = nome;
        this.senha = senha;
        this.CPF = cpf;
    }

    public Login() {

    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public long getCPF() {
        return this.CPF;
    }

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
            fos = new FileOutputStream(PATH.toFile());
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

    public static Login lerLogin() {

        Login login = null;
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getUserStatusAtivo()) {
            JOptionPane.showMessageDialog(null, "O sistema não possui administrador cadastrado!", "Falha",
                    JOptionPane.INFORMATION_MESSAGE);
        } 

        try {
            fis = new FileInputStream(PATH.toFile());
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
        PATH.toFile().delete();
    }

    public static void restaurar(long cpf, TelaLogin tle) {

        if (getUserStatusAtivo()) {
            removeLogin();
            TelaCadastroUser tlc = new TelaCadastroUser(cpf, tle);
            tlc.setVisible(true);
        }
    }

    public static boolean getUserStatusAtivo() {
        return Files.exists(PATH);
    }
}
