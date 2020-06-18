package io.uric.controleponto.funcionario;

public interface IGerente extends io.uric.controleponto.funcionario.IFuncionario {
    String getLogin();
    void setLogin(String login);
    String getSenha();
    void setSenha(String senha);
}