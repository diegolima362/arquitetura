import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Cliente {
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
	
	public static void escreverCliente(Cliente cliente) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/clientes.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(cliente);
		obj.close();
	}
	
	public static ArrayList<Cliente> lerClientes() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/clientes.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				cliente = (Cliente)obj.readObject();
				if(cliente != null)
					clientes.add(cliente);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return clientes;
	}
}
