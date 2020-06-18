package io.uric.controleponto;

import io.uric.controleponto.funcionario.Funcionario;
import io.uric.controleponto.funcionario.Gerente;
import io.uric.controleponto.funcionario.Operador;
import io.uric.controleponto.funcionario.Secretaria;
import io.uric.controleponto.registroponto.RegistroPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciarControlePonto {
    private static void sleepTime() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 1000 + 1000));
    }
    private static RegistroPonto gerarRegistoPonto(List<RegistroPonto> pontosRegistrados, Funcionario funcionario){
        List<RegistroPonto> pontosFiltrados = pontosRegistrados.stream()
                .filter((RegistroPonto rp) -> (rp.getFunc().equals(funcionario)))
                .collect(Collectors.toList());
        if (pontosFiltrados.size()>=1) {
            RegistroPonto ultimoPonto = pontosFiltrados.get(pontosFiltrados.size() - 1);
            if (ultimoPonto.getHoraEntrada()!=null && ultimoPonto.getHoraSaida() == null){
                return new RegistroPonto(
                        Long.valueOf(pontosRegistrados.size()+1),
                        funcionario,
                        ultimoPonto.getData(),
                        ultimoPonto.getHoraEntrada(),
                        LocalDateTime.now()
                );
            }
        }
        return new RegistroPonto(
                Long.valueOf(pontosRegistrados.size()+1),
                funcionario,
                LocalDate.now(),
                LocalDateTime.now()
        );
    }

    public static void main(String[] args) throws InterruptedException {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<RegistroPonto> pontosRegistrados = new ArrayList<RegistroPonto>();
        funcionarios.add(new Gerente(
                funcionarios.size()+1,
                "Jose Antonio",
                "JoseAntonio@tivit.com",
                "123456754-23",
                "jsant",
                "134967"
        ));
        funcionarios.add(new Operador(
                funcionarios.size()+1,
                "Michele Pereira",
                "MichelePereira@tivit.com",
                "987456327-89",
                10.17
        ));
        funcionarios.add(new Secretaria(
                funcionarios.size()+1,
                "Milena Aparecida",
                "MilenaApr@praca.com",
                "675496935-81",
                "38313400",
                "3400"
        ));

        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(0)));
        sleepTime();
        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(1)));
        sleepTime();
        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(2)));
        sleepTime();
        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(0)));
        sleepTime();
        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(1)));
        sleepTime();
        pontosRegistrados.add(gerarRegistoPonto(pontosRegistrados,funcionarios.get(2)));
        sleepTime();
        pontosRegistrados
                .stream()
                .forEach(
                        registroPonto -> registroPonto.apresentarRegistroPonto()
                );

    }
}