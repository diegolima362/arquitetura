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
public class Projeto implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/projetos.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\projetos.obj");

    private int codigo;
    private String nome;
    private String descricao;
    private String cliente;
    private Date dataInicio;
    private double valorTotal;

    public Projeto() {
    }

    public Projeto(String nome, String cliente, int codigo, String descricao, Date dataInicio,
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        String datafix;
        if(dataInicio.length() < 6){
            datafix = "000000";
        }else{
            datafix = dataInicio;
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            this.dataInicio = df.parse(datafix);
        } catch (ParseException e) {
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

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    public static boolean getProjectFileStatusAtivo() {
        return Files.exists(getOSPath());
    }

    public static void escrever(ArrayList<Projeto> projetos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(projetos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public static void escrever(Projeto projeto, ArrayList<Projeto> projetos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            projetos.add(projeto);
            oos.writeObject(projetos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Projeto> ler() {
        ArrayList<Projeto> projetos = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getProjectFileStatusAtivo()) {
            new File("./Data").mkdir();
        }

        try {
            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            projetos = (ArrayList<Projeto>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
        } catch (IOException e) {

        }
        return projetos;
    }

    public static void remover(int index, ArrayList<Projeto> projetos) {
        projetos.remove(index);
        Projeto.escrever(projetos);
    }
}
