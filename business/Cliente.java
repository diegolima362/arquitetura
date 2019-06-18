package business;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codigo;
    private String nome;
    private Endereco endereco;
    private int telefone;
    
    public Cliente() {}
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
    
    public static void escrever(ArrayList<Cliente> clientes) {
		FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/clientes.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\clientes.obj");
			}
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(clientes);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
	}
    public static void escrever(Cliente cliente, ArrayList<Cliente> clientes) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/clientes.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\clientes.obj");
			}
			
			oos = new ObjectOutputStream(fos);
			clientes.add(cliente);
			oos.writeObject(clientes);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Cliente> ler() {
    	ArrayList<Cliente> clientes = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fis = new FileInputStream("./bin/clientes.obj");
			} else {
				fis = new FileInputStream(".\\bin\\clientes.obj");
			}
			ois = new ObjectInputStream(fis);
			clientes = (ArrayList<Cliente>)ois.readObject();
			fis.close();
			ois.close();
		} catch (EOFException e) {
			e.printStackTrace();
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return clientes;
    }
    public static void remover (int index, ArrayList<Cliente> clientes) {
    	clientes.remove(index);
    	Cliente.escrever(clientes);
    }
} 