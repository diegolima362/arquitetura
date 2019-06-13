

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class DadosLogin {

    private String nomeUser;
    private String senhaUser;

    public DadosLogin(String nome, String senha) {
        this.nomeUser = nome;
        this.senhaUser = senha;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

}
