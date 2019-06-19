package business;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author thebell
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/clientes.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\clientes.obj");

    private int codigo;
    private String nome;
    private Endereco endereco;
    private int telefone;

    /**
     *
     */
    public Cliente() {
    }

    /**
     *
     * @param nome
     * @param codigo
     * @param endereco
     * @param telefone
     */
    public Cliente(String nome, int codigo, Endereco endereco, int telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     *
     * @return
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(int telefone) {
        if (telefone > 0) {
            this.telefone = telefone;
        }
    }

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    /**
     *
     * @return
     */
    public static boolean getClientFileStatusAtivo() {
        return Files.exists(getOSPath());
    }

    /**
     *
     * @param clientes
     */
    public static void escrever(ArrayList<Cliente> clientes) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    /**
     *
     * @param cliente
     * @param clientes
     */
    public static void escrever(Cliente cliente, ArrayList<Cliente> clientes) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            clientes.add(cliente);
            oos.writeObject(clientes);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static ArrayList<Cliente> ler() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getClientFileStatusAtivo()) {
            new File("./Data").mkdir();
        }

        try {
            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return clientes;
    }

    /**
     *
     * @param index
     * @param clientes
     */
    public static void remover(int index, ArrayList<Cliente> clientes) {
        clientes.remove(index);
        Cliente.escrever(clientes);
    }
}
