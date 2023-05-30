package com.company.Atividade03;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    protected String nome;
    protected String tipoCalculadora;
    protected List<String> listaOperacao;
    protected int quantBotoes;

    public Calculadora(String nome, String tipoCalculadora, int quantBotoes) {
        this.nome = nome;
        this.tipoCalculadora = tipoCalculadora;
        this.listaOperacao = new ArrayList<>();
        this.quantBotoes = quantBotoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCalculadora() {
        return tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public List<String> getListaSimbolos() {
        return listaOperacao;
    }

    public void adicionarOperacao(String pOperacao){
        this.listaOperacao.add(pOperacao);
    }

    public int getQuantBotoes() {
        return quantBotoes;
    }

    public void setQuantBotoes(int quantBotoes) {
        this.quantBotoes = quantBotoes;
    }

    public int Calcular(int pValor, int pValor2){
        return 0;
    }
}
