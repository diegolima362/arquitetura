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
public class PrestadorServico implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/prestadorServicos.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\prestadorServicos.obj");
    private int codigo;
    private String nome;
    private String descricaoServico;
    private double desconto;

    public PrestadorServico() {
    }

    public PrestadorServico(String nome, String descricao, int codigo, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.codigo = codigo;
        this.desconto = desconto;
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

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    public static boolean getPrestadorFileStatus() {
        return Files.exists(getOSPath());
    }
    /**
    * Método usado para salvar um serviço no arquivo de persistência
    * @param prestadorServicos ArrayListe de PrestadorServico que será salvo no arquivo de persistência
    */
    public static void escrever(ArrayList<PrestadorServico> prestadorServicos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(prestadorServicos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
   /**
    * Método usado para salvar um serviço no arquivo de persistência
    * @param prestadorServico Serviço que será adicionado no arquivo
    * @param prestadorServicos ArrayListe de PrestadorServico que será usado para adicionar um serviço no arquivo
    */
    public static void escrever(PrestadorServico prestadorServico, ArrayList<PrestadorServico> prestadorServicos) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            prestadorServicos.add(prestadorServico);
            oos.writeObject(prestadorServicos);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
     /**
     * Método usado para pegar todos os serviços
     * @return Retorna um ArrayList com todos os serviços
     */
    public static ArrayList<PrestadorServico> ler() {
        ArrayList<PrestadorServico> prestadorServicos = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getPrestadorFileStatus()) {
            new File("./Data").mkdir();
        }

        try {

            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            prestadorServicos = (ArrayList<PrestadorServico>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return prestadorServicos;
    }
     /**
     * Método para remover um serviço de uma posição especifica
     * @param index Índice do serviço a ser removido
     * @param prestadorServicos ArrayListe com os serviços que será utilizado para remover um serviço
     */
    public static void remover(int index, ArrayList<PrestadorServico> prestadorServicos) {
        prestadorServicos.remove(index);
        PrestadorServico.escrever(prestadorServicos);
    }
}
