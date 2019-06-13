package office;



import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Orcamento implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Projeto projeto;
	private Cliente cliente;
	private double valorProjeto;
	private String[] detalhamentoCusto;
	
	public Orcamento() {}
	public Orcamento(Cliente cliente, Projeto projeto, double valorProjeto, String[] detalhamentoCusto) {
		this.cliente = cliente;
		this.projeto = projeto;
		this.valorProjeto = valorProjeto;
		this.detalhamentoCusto = detalhamentoCusto;
	}
	
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
	public String[] getDetalhamentoCusto() {
		return detalhamentoCusto;
	}
	public void setDetalhamentoCusto(String[] detalhamentoCusto) {
		this.detalhamentoCusto = detalhamentoCusto;
	}

    
    public static void escrever(Orcamento orcamento, ArrayList<Orcamento> orcamentos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("./bin/orcamentos.obj");
			oos = new ObjectOutputStream(fos);
			orcamentos.add(orcamento);
			oos.writeObject(orcamentos);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Orcamento> ler() {
    	ArrayList<Orcamento> orcamentos = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("./bin/orcamentos.obj");
			ois = new ObjectInputStream(fis);
			orcamentos = (ArrayList<Orcamento>)ois.readObject();
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
		return orcamentos;
    }
}
