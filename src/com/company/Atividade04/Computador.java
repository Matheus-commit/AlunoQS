package com.company.Atividade04;

public class Computador {

    protected String nome;
    protected String numSerie;
    protected String sitemaOperacional;
    protected String processador;
    protected String placaMae;
    protected String tamanhoTotalRAM;
    protected String cor;
    protected double tamanho;

    public Computador(String nome, String numSerie, String sitemaOperacional, String processador, String placaMae, String tamanhoTotalRAM, String cor, double tamanho) {
        this.nome = nome;
        this.numSerie = numSerie;
        this.sitemaOperacional = sitemaOperacional;
        this.processador = processador;
        this.placaMae = placaMae;
        this.tamanhoTotalRAM = tamanhoTotalRAM;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getSitemaOperacional() {
        return sitemaOperacional;
    }

    public void setSitemaOperacional(String sitemaOperacional) {
        this.sitemaOperacional = sitemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getTamanhoTotalRAM() {
        return tamanhoTotalRAM;
    }

    public void setTamanhoTotalRAM(String tamanhoTotalRAM) {
        this.tamanhoTotalRAM = tamanhoTotalRAM;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void informarCaracteristicas(double pTamanhoTela){
        this.tamanho = pTamanhoTela;
    }

    public void informarCaracteristicas(String pCor){
        this.cor = pCor;
    }

    public void informarCaracteristicas(double pTamanhoTela, String cor){
        this.tamanho = pTamanhoTela;
        this.cor = cor;
    }

}
