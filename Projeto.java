

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Projeto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private String descricao;
	private Cliente cliente;
	private Date dataInicio;
	private double valorTotal;
	
	public Projeto() {}
	public Projeto(String nome, Cliente cliente, int codigo, String descricao, Date dataInicio,
					double valorTotal) {
		this.nome = nome;
		this.cliente = cliente;
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
            try {
				this.dataInicio = df.parse(dataInicio);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		if (valorTotal >= 0) {
			this.valorTotal = valorTotal;
		}
	}
    
	public static void escrever(ArrayList<Projeto> projetos) {
		FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("\\bin\\projetos.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(projetos);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
	}
        
    public static void escrever(Projeto projeto, ArrayList<Projeto> projetos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("\\bin\\projetos.obj");
			oos = new ObjectOutputStream(fos);
			projetos.add(projeto);
			oos.writeObject(projetos);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Projeto> ler() {
    	ArrayList<Projeto> projetos = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			fis = new FileInputStream("\\bin\\projetos.obj");
			ois = new ObjectInputStream(fis);
			projetos = (ArrayList<Projeto>)ois.readObject();
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
		return projetos;
    }
    
    public static void remover (int index, ArrayList<Projeto> projetos) {
    	projetos.remove(index);
    	Projeto.escrever(projetos);
    }
}
