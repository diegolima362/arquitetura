

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
	private String projeto;
	private String cliente;
	private double valorProjeto;
	private String detalhamentoCusto;
	
	public Orcamento() {}
	public Orcamento(String cliente, String projeto, double valorProjeto, String detalhamentoCusto) {
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
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getValorProjeto() {
		return valorProjeto;
	}
	public void setValorProjeto(double valorProjeto) {
		this.valorProjeto = valorProjeto;
	}
	public String getDetalhamentoCusto() {
		return detalhamentoCusto;
	}
	public void setDetalhamentoCusto(String detalhamentoCusto) {
		this.detalhamentoCusto = detalhamentoCusto;
	}

    
    public static void escrever(Orcamento orcamento, ArrayList<Orcamento> orcamentos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/orcamentos.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\orcamentos.obj");
			}
			
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
     public static void escrever(ArrayList<Orcamento> orcamentos) {
		FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/orcamentos.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\orcamentos.obj");
			}
			
			oos = new ObjectOutputStream(fos);
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
			if (System.getProperty("os.name").equals("Linux")) {
				fis = new FileInputStream("./bin/orcamentos.obj");
			} else {
				fis = new FileInputStream(".\\bin\\orcamentos.obj");
			}
			
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
    public static void remover (int index, ArrayList<Orcamento> orcamentos) {
    	orcamentos.remove(index);
    	Orcamento.escrever(orcamentos);
    }
}
