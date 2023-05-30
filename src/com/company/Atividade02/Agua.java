package com.company.Atividade02;

public class Agua extends Substancia {

    private int quantAtomosHidrogenio;
    private int quantAtomosOxigenio;

    public Agua (String nome, String cor, String composicaoQuimica, double densidade, int quantAtomosHidrogenio, int quantAtomosOxigenio){
        super(nome, cor, composicaoQuimica, densidade);
        this.quantAtomosHidrogenio = quantAtomosOxigenio;
        this.quantAtomosOxigenio = quantAtomosHidrogenio;
    }

    public int getQuantAtomosHidrogenio() {
        return quantAtomosHidrogenio;
    }

    public void setQuantAtomosHidrogenio(int quantAtomosHidrogenio) {
        this.quantAtomosHidrogenio = quantAtomosHidrogenio;
    }

    public int getQuantAtomosOxigenio() {
        return quantAtomosOxigenio;
    }

    public void setQuantAtomosOxigenio(int quantAtomosOxigenio) {
        this.quantAtomosOxigenio = quantAtomosOxigenio;
    }

    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        if (temperatura >= 100) {
            System.out.println("Ponto de ebulição da água atingido: " + temperatura + "ºC");
        }else {
            System.out.println("Ponto de ebulição ianda não atingido");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura){
        if (temperatura <= 0){
            System.out.println("Ponto de fusão da água atingido: " + temperatura + "ºC");
        }else {
            System.out.println("Ponto de fusão não foi atingido !!");
        }

    }


}
