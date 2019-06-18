package business;



import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class LevantamentoVisita implements Serializable{
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Cliente cliente;
	private Projeto projeto;
	private Date data;
	private double cotas;
	private double valorCobrado;
	
	public LevantamentoVisita() {}
	public LevantamentoVisita (Cliente cliente, Projeto projeto, int codigo, Date data,
								double cotas, double valorCobrado) {
		this.cliente = cliente;
		this.projeto = projeto;
		this.codigo = codigo;
		this.data = data;
		this.cotas = cotas;
		this.valorCobrado = valorCobrado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getCotas() {
		return cotas;
	}
	public void setCotas(double cotas) {
		this.cotas = cotas;
	}
	public double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
    
    public static void escrever(LevantamentoVisita levantamentoVisita, ArrayList<LevantamentoVisita> levantamentoVisitas) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/levantamentoVisitas.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\levantamentoVisitas.obj");
			}
			oos = new ObjectOutputStream(fos);
			levantamentoVisitas.add(levantamentoVisita);
			oos.writeObject(levantamentoVisitas);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<LevantamentoVisita> ler() {
    	ArrayList<LevantamentoVisita> levantamentoVisitas = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fis = new FileInputStream("./bin/levantamentoVisitas.obj");
			} else {
				fis = new FileInputStream(".\\bin\\levantamentoVisitas.obj");
			}
			ois = new ObjectInputStream(fis);
			levantamentoVisitas = (ArrayList<LevantamentoVisita>)ois.readObject();
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
		return levantamentoVisitas;
    }
}
