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

/**
 *
 * @author thebell
 */
public class Orcamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/orcamentos.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\orcamentos.obj");
    private int codigo;
    private String projeto;
    private String cliente;
    private double valorProjeto;
    private String detalhamentoCusto;

    /**
     *
     */
    public Orcamento() {
    }

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

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    public static boolean getOrcamentoFileStatus() {
        return Files.exists(getOSPath());
    }
    /**
    * Método usado para salvar um orçamento no arquivo de persistência
    * @param orcamento Orçamento que será adicionado no arquivo
    * @param orcamentos ArrayListe de Orcamento que será usado para adicionar um orçamento no arquivo
    */
    public static void escrever(Orcamento orcamento, ArrayList<Orcamento> orcamentos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            orcamentos.add(orcamento);
            oos.writeObject(orcamentos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
    /**
    * Método usado para salvar um orçamento no arquivo de persistência
    * @param orcamentos ArrayListe de Orcamento que será salvo no arquivo de persistência
    */
    public static void escrever(ArrayList<Orcamento> orcamentos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(orcamentos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
     /**
     * Método usado para pegar todos os orçamentos
     * @return Retorna um ArrayList com todos os orçamentos
     */
    public static ArrayList<Orcamento> ler() {
        ArrayList<Orcamento> orcamentos = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getOrcamentoFileStatus()) {
            new File("./Data").mkdir();
        }

        try {

            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            orcamentos = (ArrayList<Orcamento>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return orcamentos;
    }
     /**
     * Método para remover um orçamento de uma posição especifica
     * @param index Índice do orçamento a ser removido
     * @param orcamentos ArrayListe com os orçãmentos que será utilizado para remover um orçamento
     */
    public static void remover(int index, ArrayList<Orcamento> orcamentos) {
        orcamentos.remove(index);
        Orcamento.escrever(orcamentos);
    }
}
