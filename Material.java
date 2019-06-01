

import java.util.ArrayList;

public class Material {
	private int codigo;
	private String nome;
	private String fabricante;
	private String descricao;
	private ArrayList<Material> catalogo;
	
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
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Material> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(ArrayList<Material> catalogo) {
		this.catalogo = catalogo;
	}
	
	
}
