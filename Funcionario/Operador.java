package io.uric.controleponto.funcionario;

public class Operador extends Funcionario implements io.uric.controleponto.funcionario.IOperador {
    private double valorHora;

    public Operador(int id, String nome, String email, String documento, double valorHora){
        super(id, nome, email, documento);
        this.valorHora = valorHora;
    }
    @Override
    public double getValorHora() {
        return this.valorHora;
    }

    @Override
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}