

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
	
	
}
