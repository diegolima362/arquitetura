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
public class LevantamentoVisita implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/levantamentoVisitas.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\levantamentoVisitas.obj");
    private int codigo;
    private Cliente cliente;
    private Projeto projeto;
    private Date data;
    private double cotas;
    private double valorCobrado;

    /**
     *
     */
    public LevantamentoVisita() {
    }

    /**
     *
     * @param cliente
     * @param projeto
     * @param codigo
     * @param data
     * @param cotas
     * @param valorCobrado
     */
    public LevantamentoVisita(Cliente cliente, Projeto projeto, int codigo, Date data,
            double cotas, double valorCobrado) {
        this.cliente = cliente;
        this.projeto = projeto;
        this.codigo = codigo;
        this.data = data;
        this.cotas = cotas;
        this.valorCobrado = valorCobrado;
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
    public Cliente getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     *
     * @param projeto
     */
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    /**
     *
     * @return
     */
    public Date getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public double getCotas() {
        return cotas;
    }

    /**
     *
     * @param cotas
     */
    public void setCotas(double cotas) {
        this.cotas = cotas;
    }

    /**
     *
     * @return
     */
    public double getValorCobrado() {
        return valorCobrado;
    }

    /**
     *
     * @param valorCobrado
     */
    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
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
    public static boolean getLevantamentoFileStatus() {
        return Files.exists(getOSPath());
    }

    /**
     *
     * @param levantamentoVisita
     * @param levantamentoVisitas
     */
    public static void escrever(LevantamentoVisita levantamentoVisita, ArrayList<LevantamentoVisita> levantamentoVisitas) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            levantamentoVisitas.add(levantamentoVisita);
            oos.writeObject(levantamentoVisitas);
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
    public static ArrayList<LevantamentoVisita> ler() {
        ArrayList<LevantamentoVisita> levantamentoVisitas = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getLevantamentoFileStatus()) {
            new File("./Data").mkdir();
        }

        try {

            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            levantamentoVisitas = (ArrayList<LevantamentoVisita>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return levantamentoVisitas;
    }
}
