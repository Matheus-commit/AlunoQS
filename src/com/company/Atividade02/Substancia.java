package com.company.Atividade02;

public class Substancia {

    protected String nome;
    protected String cor;
    protected String composicaoQuimica;
    protected double densidade;

    public Substancia(String nome, String cor, String composicaoQuimica, double densidade) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getComposicaoQuimica() {
        return composicaoQuimica;
    }

    public void setComposicaoQuimica(String composicaoQuimica) {
        this.composicaoQuimica = composicaoQuimica;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double peso) {
        this.densidade = peso;
    }

    public void entrarPontoDeEbulicao(double temperatura){}
    public void entrarPontoDeFusao(double temperatura) {}
}
