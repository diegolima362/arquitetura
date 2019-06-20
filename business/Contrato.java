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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private String projeto;
    private String orcamento;
    private Date dataInicio;
    private Date dataTermino;
    private double custoMaterial;
    private double valorTotal;
    private String funcionarios;
    private int visitasTecnicasCobradas;

    public Contrato() {
    }

    public Contrato(String projeto, String orcamento, int codigo, Date dataInicio, Date dataTermino,
            double custoMaterial, double valorTotal, String funcionarios, int visitasTecnicasCobradas) {
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

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataInicio = df.parse(dataInicio);
        } catch (ParseException e) {
        }
        
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataTermino = df.parse(dataTermino);
        } catch (ParseException e) {
        }
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

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
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

    /**
    * Método usado para salvar um contrato no arquivo de persistência
    * @param contratos ArrayListe de contratos que será salvo no arquivo de persistência
    */
    public static void escrever(ArrayList<Contrato> contratos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(contratos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
    /**
    * Método usado para salvar um contrato no arquivo de persistência
    * @param contrato Contrato que será adicionado no arquivo
    * @param contratos ArrayListe de Contrato que será usado para adicionar um contrato no arquivo
    */
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
     /**
     * Método usado para pegar todos os contratos
     * @return Retorna um ArrayList com todos os contratos
     */
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
     /**
     * Método para remover um contrato de uma posição especifica
     * @param index Índice do contrato a ser removido
     * @param contratos ArrayListe com os contratos que será utilizado para remover um contrato
     */
    public static void remover(int index, ArrayList<Contrato> contratos) {
        contratos.remove(index);
        Contrato.escrever(contratos);
    }
}
