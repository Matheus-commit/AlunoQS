package com.company.Atividade03;

public class Subtracao extends Calculadora{

    private String simbolo;

    public Subtracao(String nome, String tipoCalculadora, int quantBotoes) {
        super(nome, tipoCalculadora, quantBotoes);
        this.simbolo = "-";
        listaOperacao.add(simbolo);
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    @Override
    public int Calcular(int pValor, int pValor2){
        int total = pValor - pValor2;
        return total;
    }

    public double Calcular(int pValor, double pValor2){
        double total = pValor - pValor2;
        return total;
    }

    public double Calcular(double pValor, int pValor2){
        double total = pValor - pValor2;
        return total;
    }

    public double Calcular(double pValor, double pValor2){
        double total = pValor - pValor2;
        return total;
    }
}
