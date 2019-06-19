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

    /**
     *
     * @param cliente
     * @param projeto
     * @param valorProjeto
     * @param detalhamentoCusto
     */
    public Orcamento(String cliente, String projeto, double valorProjeto, String detalhamentoCusto) {
        this.cliente = cliente;
        this.projeto = projeto;
        this.valorProjeto = valorProjeto;
        this.detalhamentoCusto = detalhamentoCusto;
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getProjeto() {
        return projeto;
    }

    /**
     *
     * @param projeto
     */
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    /**
     *
     * @return
     */
    public String getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public double getValorProjeto() {
        return valorProjeto;
    }

    /**
     *
     * @param valorProjeto
     */
    public void setValorProjeto(double valorProjeto) {
        this.valorProjeto = valorProjeto;
    }

    /**
     *
     * @return
     */
    public String getDetalhamentoCusto() {
        return detalhamentoCusto;
    }

    /**
     *
     * @param detalhamentoCusto
     */
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

    /**
     *
     * @return
     */
    public static boolean getOrcamentoFileStatus() {
        return Files.exists(getOSPath());
    }

    /**
     *
     * @param orcamento
     * @param orcamentos
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
     *
     * @param orcamentos
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
     *
     * @return
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
     *
     * @param index
     * @param orcamentos
     */
    public static void remover(int index, ArrayList<Orcamento> orcamentos) {
        orcamentos.remove(index);
        Orcamento.escrever(orcamentos);
    }
}
