

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
	
	
}
