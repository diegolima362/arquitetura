

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
	
}
