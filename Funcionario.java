import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Funcionario {
	private int codigo;
	private String nome;
	private char tipo;
	private Endereco endereco;
	private int telefone;
	private float salario;
	private int projetoAlocado;
	
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
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
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
		this.telefone = telefone;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getProjetoAlocado() {
		return projetoAlocado;
	}
	public void setProjetoAlocado(int projetoAlocado) {
		this.projetoAlocado = projetoAlocado;
	}
	
	public static void escreverFuncionario(Funcionario funcionario) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/funcionarios.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(funcionario);
		obj.close();
	}
	
	public static ArrayList<Funcionario> lerFuncionarios() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/funcionarios.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario funcionario = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				funcionario = (Funcionario)obj.readObject();
				if(funcionario != null)
					funcionarios.add(funcionario);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return funcionarios;
	}
	
}
