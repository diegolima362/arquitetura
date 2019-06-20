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
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Path PATHUNIX = Paths.get("./Data/materiais.obj");
    private final static Path PATHMS = Paths.get(".\\Data\\materiais.obj");
    private int codigo;
    private String nome;
    private String fabricante;
    private String descricao;
    private double valor;
    private ArrayList<Material> catalogo;

    /**
     *
     */
    public Material() {
    }

    public Material(String nome, String fabricante, String descricao, int codigo,
            double valor, ArrayList<Material> catalogo) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.catalogo = catalogo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Material> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Material> catalogo) {
        this.catalogo = catalogo;
    }

    private static Path getOSPath() {
        if (System.getProperty("os.name").equals("Linux")) {

            return PATHUNIX;
        } else {

            return PATHMS;
        }
    }

    public static boolean getMaterialFileStatus() {
        return Files.exists(getOSPath());
    }
    /**
    * Método usado para salvar um material no arquivo de persistência
    * @param materiais ArrayListe de Material que será salvo no arquivo de persistência
    */
    public static void escrever(ArrayList<Material> materiais) {
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(materiais);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
    /**
    * Método usado para salvar um material no arquivo de persistência
    * @param material Material que será adicionado no arquivo
    * @param materiais ArrayListe de Material que será usado para adicionar um material no arquivo
    */
    public static void escrever(Material material, ArrayList<Material> materiais) {
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {

            fos = new FileOutputStream(getOSPath().toFile());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(materiais);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
     /**
     * Método usado para pegar todos os materiais
     * @return Retorna um ArrayList com todos os materiais
     */
    public static ArrayList<Material> ler() {
        ArrayList<Material> materiais = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;

        if (!getMaterialFileStatus()) {
            new File("./Data").mkdir();
        }

        try {
            fis = new FileInputStream(getOSPath().toFile());
            ois = new ObjectInputStream(fis);
            materiais = (ArrayList<Material>) ois.readObject();
            fis.close();
            ois.close();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException e) {
        } catch (IOException e) {

        }
        return materiais;
    }
    
     /**
     * Método para remover um material de uma posição especifica
     * @param index Índice do material a ser removido
     * @param materiais ArrayListe com os materiais que será utilizado para remover um material
     */
    public static void remover(int index, ArrayList<Material> materiais) {
        materiais.remove(index);
        Material.escrever(materiais);
    }
}
