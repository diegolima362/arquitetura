
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import java.io.Serializable;

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

    public static void escrever(Cliente cliente) {
        try {
        	File arquivo = new File("./bin/clientes.obj") ;
            if (arquivo.exists()) {
            	FileOutputStream fos = new FileOutputStream(arquivo, true);
            	AppendingObjectOutputStream obj = new AppendingObjectOutputStream(fos);
				obj.writeStreamHeader();
				obj.writeObject(cliente);
				obj.close();
            } else {
            	FileOutputStream fos = new FileOutputStream(arquivo);
            	ObjectOutputStream obj = new ObjectOutputStream(fos);
				obj.writeObject(cliente);
				obj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> ler() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Cliente obj = null;
        boolean isExist = true;
		try {
			fis = new FileInputStream("./bin/clientes.obj");
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
        while(isExist){
            try {
				if(fis.available() != 0) {
				 obj = (Cliente)ois.readObject();    
				 clientes.add(obj);
				}
				else{
					isExist =false;
				}
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
        }
        return clientes;     
    }
}

class AppendingObjectOutputStream extends ObjectOutputStream {

  public AppendingObjectOutputStream(OutputStream out) throws IOException {
    super(out);
  }

  @Override
  protected void writeStreamHeader() throws IOException {
    reset();
  }
}