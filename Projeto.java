

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Projeto {
	private int codigo;
	private String nome;
	private String descricao;
	private Cliente cliente;
	private Date dataInicio;
	private double valorTotal;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		if (valorTotal >= 0) {
			this.valorTotal = valorTotal;
		}
	}
	
	public static void escreverProjeto(Projeto projeto) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/projetos.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(projeto);
		obj.close();
	}
	
	public static ArrayList<Projeto> lerProjetos() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/projetos.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Projeto> projetos = new ArrayList<Projeto>();
		Projeto projeto = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				projeto = (Projeto)obj.readObject();
				if(projeto != null)
					projetos.add(projeto);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return projetos;
	}
	
}
