
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private Endereco endereco;
	private int telefone;
	
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
	
	public static void escrever(Cliente cliente){
		File arquivo = null;
		ObjectOutputStream obj = null;
		try {
			arquivo = new File("./bin/clientes.txt");
			obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
			obj.writeObject(cliente);
			obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Cliente> ler() {
		FileInputStream arquivo = null;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = null;
		ObjectInputStream obj = null;
		try {
			arquivo = new FileInputStream("./bin/clientes.txt");
			obj = new ObjectInputStream(arquivo);
			do {
				cliente = (Cliente) obj.readObject();
				if (cliente != null)
					clientes.add(cliente);
		   } while (cliente != null);
			obj.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return clientes;
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		//cliente.setNome("Gabriel");
		//Cliente.escrever(cliente);
		System.out.println("Ok");
		
		clientes = Cliente.ler();
		
		for (Cliente c: clientes) {
			System.out.printf("Cliente: %s\n", c.getNome());
		}
	}
		
}
