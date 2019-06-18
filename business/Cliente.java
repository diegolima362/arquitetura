package business;

import static business.Funcionario.getFuncFileStatusAtivo;
import java.io.EOFException;
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

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/clientes.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\clientes.obj");
    
    private int codigo;
    private String nome;
    private Endereco endereco;
    private int telefone;

    public Cliente() {
    }

    public Cliente(String nome, int codigo, Endereco endereco, int telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

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
    public static boolean getClientFileStatusAtivo() {
        return Files.exists(getOSPath());
    }

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

    public static void remover(int index, ArrayList<Cliente> clientes) {
        clientes.remove(index);
        Cliente.escrever(clientes);
    }
}
