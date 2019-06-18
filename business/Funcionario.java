package business;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private char tipo;
	private Endereco endereco;
	private int telefone;
	private float salario;
	private int projetoAlocado;
	
        public Funcionario(){}
	public Funcionario(String nome, char tipo, int codigo, Endereco endereco, 
			int telefone, float salario, int proJetoAlocado) {
		this.nome = nome;
		this.tipo = tipo;
		this.codigo = codigo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
		this.projetoAlocado = proJetoAlocado;
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
    
    public static void escrever(ArrayList<Funcionario> funcionarios) {
		FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream(".\\bin\\funcionarios.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\funcionarios.obj");
			}
			oos = new ObjectOutputStream(fos);
			oos.writeObject(funcionarios);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
	}
    public static void escrever(Funcionario funcionario, ArrayList<Funcionario> funcionarios) {
    	FileOutputStream fos;
    	ObjectOutputStream oos;
    	try {
    		if (System.getProperty("os.name").equals("Linux")) {
    			fos = new FileOutputStream("./bin/funcionarios.obj");
    		} else {
    			fos = new FileOutputStream(".\\bin\\funcionarios.obj");
    		}
    		
    		oos = new ObjectOutputStream(fos);
    		funcionarios.add(funcionario);
    		oos.writeObject(funcionarios);
    		fos.close();
    		oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
        @SuppressWarnings("unchecked")
	public static ArrayList<Funcionario> ler() {
    	ArrayList<Funcionario> funcionarios = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
            try {
            	if (System.getProperty("os.name").equals("Linux")) {
            		fis = new FileInputStream("./bin/funcionarios.obj");
            	} else {
            		fis = new FileInputStream(".\\bin\\funcionarios.obj");
            	}
                ois = new ObjectInputStream(fis);
                funcionarios = (ArrayList<Funcionario>)ois.readObject();
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
		return funcionarios;
    }
    public static void remover (int index, ArrayList<Funcionario> funcionarios) {
    	funcionarios.remove(index);
    	Funcionario.escrever(funcionarios);
    }
}
