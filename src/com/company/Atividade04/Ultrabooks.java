package com.company.Atividade04;

public class Ultrabooks extends Computador{

    private String tipoTeclado; //ABNT-1 ABNT-2
    private String marca;
    private String modelo;
    private String duracaoBateria;
    private String tipoTela;

    public Ultrabooks(String nome, String numSerie, String sitemaOperacional, String processador, String placaMae, String tamanhoTotalRAM, String cor, double tamanho, String tipoTeclado, String marca, String modelo, String duracaoBateria, String tipoTela) {
        super(nome, numSerie, sitemaOperacional, processador, placaMae, tamanhoTotalRAM, cor, tamanho);
        this.tipoTeclado = tipoTeclado;
        this.marca = marca;
        this.modelo = modelo;
        this.duracaoBateria = duracaoBateria;
        this.tipoTela = tipoTela;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDuracaoBateria() {
        return duracaoBateria;
    }

    public void setDuracaoBateria(String duracaoBateria) {
        this.duracaoBateria = duracaoBateria;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public void informarCaracteristicas(double pTamanhoTela){
        super.setTamanho(pTamanhoTela);
    }

    @Override
    public void informarCaracteristicas(String pCor){
        super.setCor(pCor);
    }
    @Override
    public void informarCaracteristicas(double pTamanhoTela, String pCor){
        super.setTamanho(pTamanhoTela);
        super.setCor(pCor);
    }
}
