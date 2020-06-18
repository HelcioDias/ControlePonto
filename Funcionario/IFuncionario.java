package io.uric.controleponto.funcionario;

public interface IFuncionario {
    int getIdFunc();
    void setIdFunc(int idFunc);
    String getNome();
    void setNome(String nome);
    String getEmail();
    void setEmail(String email);
    String getDocumento();
    void setDocumento(String documento);
}