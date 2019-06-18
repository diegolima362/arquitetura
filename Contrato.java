

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

public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Projeto projeto;
	private Orcamento orcamento;
	private Date dataInicio;
	private Date dataTermino;
	private double custoMaterial;
	private double valorTotal;
	private ArrayList<Funcionario> funcionarios;
	private int visitasTecnicasCobradas;
	
	public Contrato() {}
	public Contrato(Projeto projeto, Orcamento orcamento, int codigo, Date dataInicio, Date dataTermino,
					double custoMaterial, double valorTotal, ArrayList<Funcionario> funcionarios, int visitasTecnicasCobradas) {
		this.projeto = projeto;
		this.orcamento = orcamento;
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.custoMaterial = custoMaterial;
		this.valorTotal = valorTotal;
		this.funcionarios = funcionarios;
		this.visitasTecnicasCobradas = visitasTecnicasCobradas;
		
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
	public Orcamento getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public double getCustoMaterial() {
		return custoMaterial;
	}
	public void setCustoMaterial(double custoMaterial) {
		this.custoMaterial = custoMaterial;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public int getVisitasTecnicasCobradas() {
		return visitasTecnicasCobradas;
	}
	public void setVisitasTecnicasCobradas(int visitasTecnicasCobradas) {
		this.visitasTecnicasCobradas = visitasTecnicasCobradas;
	}
	
    public static void escrever(Contrato contrato, ArrayList<Contrato> contratos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fos = new FileOutputStream("./bin/contratos.obj");
			} else {
				fos = new FileOutputStream(".\\bin\\contratos.obj");
			}
			
			oos = new ObjectOutputStream(fos);
			contratos.add(contrato);
			oos.writeObject(contratos);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
    }
    
    @SuppressWarnings("unchecked")
	public static ArrayList<Contrato> ler() {
    	ArrayList<Contrato> contratos = new ArrayList<>();
    	FileInputStream fis;
    	ObjectInputStream ois;
    	
		try {
			if (System.getProperty("os.name").equals("Linux")) {
				fis = new FileInputStream("./bin/contratos.obj");
			} else {
				fis = new FileInputStream(".\\bin\\contratos.obj");
			}
			ois = new ObjectInputStream(fis);
			contratos = (ArrayList<Contrato>)ois.readObject();
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
		return contratos;
    }
}
