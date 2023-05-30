package com.company.Atividade04;

public class Notebook extends Computador{

    private String tipoTeclado; //ABNT-1 ABNT-2
    private String marca;
    private String modelo;

    public Notebook(String nome, String numSerie, String sitemaOperacional, String processador, String placaMae, String tamanhoTotalRAM, String cor, double tamanho, String tipoTeclado, String marca, String modelo) {
        super(nome, numSerie, sitemaOperacional, processador, placaMae, tamanhoTotalRAM, cor, tamanho);
        this.tipoTeclado = tipoTeclado;
        this.marca = marca;
        this.modelo = modelo;
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
