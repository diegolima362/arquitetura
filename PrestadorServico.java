import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PrestadorServico {
	private int codigo;
	private String nome;
	private String descricaoServico;
	private double desconto;
	
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
	
	public static void escreverPrestadorServico(PrestadorServico prestadorServico) throws FileNotFoundException, IOException {
		File arquivo = new File("prestadorServicos.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(prestadorServico);
		obj.close();
	}
	
	public static ArrayList<PrestadorServico> lerPrestadorServicos() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("prestadorServicos.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<PrestadorServico> prestadorServicos = new ArrayList<PrestadorServico>();
		PrestadorServico prestadorServico = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				prestadorServico = (PrestadorServico)obj.readObject();
				if(prestadorServico != null)
					prestadorServicos.add(prestadorServico);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return prestadorServicos;
	}
	
}
