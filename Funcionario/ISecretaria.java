package io.uric.controleponto.funcionario;

public interface ISecretaria extends io.uric.controleponto.funcionario.IFuncionario {
    String getTelefone();
    void setTelefone(String telefone);
    String getRamal();
    void setRamal(String ramal);
}