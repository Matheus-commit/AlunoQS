package com.company.Atividade04;

public class Desktop extends Computador{

    private String nomeGabinete;
    private double tamanhoGabinete;


    public Desktop(String nome, String numSerie, String sitemaOperacional, String processador, String placaMae, String tamanhoTotalRAM, String cor, double tamanho, String nomeGabinete, double tamanhoGabinete) {
        super(nome, numSerie, sitemaOperacional, processador, placaMae, tamanhoTotalRAM, cor, tamanho);
        this.nomeGabinete = nomeGabinete;
        this.tamanhoGabinete = tamanhoGabinete;
    }

    public String getNomeGabinete() {
        return nomeGabinete;
    }

    public void setNomeGabinete(String nomeGabinete) {
        this.nomeGabinete = nomeGabinete;
    }

    public double getTamanhoGabinete() {
        return tamanhoGabinete;
    }

    public void setTamanhoGabinete(double tamanhoGabinete) {
        this.tamanhoGabinete = tamanhoGabinete;
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
