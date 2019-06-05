

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	public static void escreverMaterial(Material material) throws FileNotFoundException, IOException {
		File arquivo = new File("./bin/materiais.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(material);
		obj.close();
	}
	
	public static ArrayList<Material> lerMateriais() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("./bin/materiais.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Material> materiais = new ArrayList<Material>();
		Material material = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				material = (Material)obj.readObject();
				if(material != null)
					materiais.add(material);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return materiais;
	}
	
}
