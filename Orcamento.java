

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Orcamento {
	private int codigo;
	private Projeto projeto;
	private Cliente cliente;
	private double valorProjeto;
	private ArrayList<String> detalhamentoCusto;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getValorProjeto() {
		return valorProjeto;
	}
	public void setValorProjeto(double valorProjeto) {
		this.valorProjeto = valorProjeto;
	}
	public ArrayList<String> getDetalhamentoCusto() {
		return detalhamentoCusto;
	}
	public void setDetalhamentoCusto(ArrayList<String> detalhamentoCusto) {
		this.detalhamentoCusto = detalhamentoCusto;
	}
	
	public static void escreverOrcamento(Orcamento orcamento) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/orcamentos.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(orcamento);
		obj.close();
	}
	
	public static ArrayList<Orcamento> lerOrcamentos() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/orcamentos.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Orcamento> orcamentos = new ArrayList<Orcamento>();
		Orcamento orcamento = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				orcamento = (Orcamento)obj.readObject();
				if(orcamento != null)
					orcamentos.add(orcamento);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return orcamentos;
	}
	
}
