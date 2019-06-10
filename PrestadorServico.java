import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PrestadorServico implements Serializable{
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private String descricaoServico;
	private double desconto;
	
	public PrestadorServico() {}
	public PrestadorServico(String nome, String descricao, int codigo, double desconto) {
		this.nome = nome;
		this.desconto = desconto;
		this.codigo = codigo;
		this.desconto = desconto;
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
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
    public static void escrever(PrestadorServico prestadorServico, ArrayList<PrestadorServico> prestadorServicos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("./bin/prestadorServicos.obj");
			oos = new ObjectOutputStream(fos);
			prestadorServicos.add(prestadorServico);
			oos.writeObject(prestadorServicos);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<PrestadorServico> ler() {
    	ArrayList<PrestadorServico> prestadorServicos = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("./bin/prestadorServicos.obj");
			ois = new ObjectInputStream(fis);
			prestadorServicos = (ArrayList<PrestadorServico>)ois.readObject();
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
		return prestadorServicos;
    }
}
