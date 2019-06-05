

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Contrato {
	private int codigo;
	private Projeto projeto;
	private Orcamento orcamento;
	private Date dataInicio;
	private Date dataTermino;
	private double custoMaterial;
	private double valorTotal;
	private ArrayList<Funcionario> funcionarios;
	private int visitasTecnicasCobradas;
	
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
	public Orcamento getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public double getCustoMaterial() {
		return custoMaterial;
	}
	public void setCustoMaterial(double custoMaterial) {
		this.custoMaterial = custoMaterial;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public int getVisitasTecnicasCobradas() {
		return visitasTecnicasCobradas;
	}
	public void setVisitasTecnicasCobradas(int visitasTecnicasCobradas) {
		this.visitasTecnicasCobradas = visitasTecnicasCobradas;
	}
	
	public static void escreverContrato(Contrato contrato) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/contratos.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(contrato);
		obj.close();
	}
	
	public static ArrayList<Contrato> lerContratos() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/contratos.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Contrato> contratos = new ArrayList<Contrato>();
		Contrato contrato = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				contrato = (Contrato)obj.readObject();
				if(contrato != null)
					contratos.add(contrato);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return contratos;
	}
	
}
