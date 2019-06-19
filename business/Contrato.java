package business;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author thebell
 */
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/contratos.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\contratos.obj");
    private int codigo;
    private Projeto projeto;
    private Orcamento orcamento;
    private Date dataInicio;
    private Date dataTermino;
    private double custoMaterial;
    private double valorTotal;
    private ArrayList<Funcionario> funcionarios;
    private int visitasTecnicasCobradas;

    public Contrato() {
    }

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

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    public static boolean getContratoFileStatusAtivo() {
        return Files.exists(getOSPath());
    }

    public static void escrever(Contrato contrato, ArrayList<Contrato> contratos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            contratos.add(contrato);
            oos.writeObject(contratos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public static ArrayList<Contrato> ler() {
        ArrayList<Contrato> contratos = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getContratoFileStatusAtivo()) {
            new File("./Data").mkdir();
        }

        try {

            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            contratos = (ArrayList<Contrato>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException e) {
        } catch (FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return contratos;
    }
}