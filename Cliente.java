import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
    private String nome;
    private Endereco endereco;
    private int telefone;
    
    public Cliente() {}
    public Cliente(String nome, int codigo, Endereco endereco, int telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.telefone = telefone;
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
}