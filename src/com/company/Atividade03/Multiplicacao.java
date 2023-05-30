package com.company.Atividade03;

public class Multiplicacao extends Calculadora{

    private String operador;

    public Multiplicacao(String nome, String tipoCalculadora, int quantBotoes) {
        super(nome, tipoCalculadora, quantBotoes);
        this.operador = "*";
        listaOperacao.add(this.operador);
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public int Calcular(int pValor, int pValor2){
        int total = pValor * pValor2;
        return total;
    }

    public double Calcular(int pValor, double pValor2){
        double total = pValor * pValor2;
        return total;
    }

    public double Calcular(double pValor, int pValor2){
        double total = pValor * pValor2;
        return total;
    }

    public double Calcular(double pValor, double pValor2){
        double total = pValor * pValor2;
        return total;
    }
}
