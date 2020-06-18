package io.uric.controleponto.funcionario;

public class Secretaria extends Funcionario implements io.uric.controleponto.funcionario.ISecretaria {
    private String telefone;
    private String ramal;

    public Secretaria(int id, String nome, String email, String documento, String telefone, String ramal){
        super(id, nome, email, documento);
        this.telefone = telefone;
        this.ramal = ramal;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getRamal() {
        return this.ramal;
    }

    @Override
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}