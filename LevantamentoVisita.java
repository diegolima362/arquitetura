

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class LevantamentoVisita {
	private int codigo;
	private Cliente cliente;
	private Projeto projeto;
	private Date data;
	private double cotas;
	private double valorCobrado;
	
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
	
	public static void escreverLevantamentoVisita(LevantamentoVisita levantamentoVisita) throws FileNotFoundException, IOException {
		File arquivo = new File("levantamentoVisitas.txt");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
		obj.writeObject(levantamentoVisita);
		obj.close();
	}
	
	public static ArrayList<LevantamentoVisita> lerLevantamentoVisitas() {
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream ("levantamentoVisita.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<LevantamentoVisita> levantamentoVisitas = new ArrayList<LevantamentoVisita>();
		LevantamentoVisita levantamentoVisita = null;
		boolean cont = true;
		
		try {
			ObjectInputStream obj = new ObjectInputStream(arquivo);
			while(cont){
				levantamentoVisita = (LevantamentoVisita)obj.readObject();
				if(levantamentoVisita != null)
					levantamentoVisitas.add(levantamentoVisita);
				else
					cont = false;
		   }
		   obj.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return levantamentoVisitas;
	}
}
