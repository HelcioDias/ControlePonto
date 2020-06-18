package io.uric.controleponto.funcionario;

import Funcionario.IGerente;

public class Gerente extends Funcionario implements IGerente {
    private String login;
    private String senha;

    public Gerente(int id, String nome, String email, String documento, String login, String senha){
        super(id, nome, email, documento);
        this.senha = senha;
        this.login = login;
    }
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}