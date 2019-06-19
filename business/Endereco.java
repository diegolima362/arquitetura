package business;

import java.io.Serializable;

/**
 *
 * @author thebell
 */
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    /**
     *
     */
    public Endereco() {
    }

    /**
     *
     * @param pais
     * @param estado
     * @param cidade
     * @param bairro
     * @param rua
     * @param numero
     */
    public Endereco(String pais, String estado, String cidade,
            String bairro, String rua, int numero) {

        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getCidade() {
        return cidade;
    }

    /**
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     *
     * @return
     */
    public String getBairro() {
        return bairro;
    }

    /**
     *
     * @param bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     *
     * @return
     */
    public String getRua() {
        return rua;
    }

    /**
     *
     * @param rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

}
