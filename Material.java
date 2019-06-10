

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Material implements Serializable{
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private String fabricante;
	private String descricao;
	private ArrayList<Material> catalogo;
	
	public Material() {}
	public Material(String nome, String fabricante, String descricao, int codigo, 
			ArrayList<Material> catalogo) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.catalogo = catalogo;
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
    
    public static void escrever(Material material, ArrayList<Material> materiais) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("./bin/materiais.obj");
			oos = new ObjectOutputStream(fos);
			materiais.add(material);
			oos.writeObject(materiais);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Material> ler() {
    	ArrayList<Material> materiais = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("./bin/materiais.obj");
			ois = new ObjectInputStream(fis);
			materiais = (ArrayList<Material>)ois.readObject();
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
		return materiais;
    }
}
