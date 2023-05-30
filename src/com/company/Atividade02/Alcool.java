package com.company.Atividade02;

public class Alcool extends Substancia{

    private int quantAtomosCarbono;
    private int quantAtomosHidrogenio;
    private int quantAtomosOxigenio;

    public Alcool(String nome, String cor, String composicaoQuimica, double densidade, int quantAtomosHidrogenio, int quantAtomosOxigenio, int quantAtomosCarbono) {
        super(nome, cor, composicaoQuimica, densidade);
        this.quantAtomosCarbono = quantAtomosCarbono;
        this.quantAtomosHidrogenio = quantAtomosHidrogenio;
        this.quantAtomosOxigenio = quantAtomosOxigenio;
    }

    public int getQuantAtomosCarbono() {
        return quantAtomosCarbono;
    }

    public void setQuantAtomosCarbono(int quantAtomosCarbono) {
        this.quantAtomosCarbono = quantAtomosCarbono;
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
        if (temperatura < 78.4) {
            System.out.println("Temperatura de ebulição do álcool não foi atingido");
        } else {
            System.out.println("Temperatura de ebulição do álcool atingido: " + temperatura + "ªC");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura) {
        if (temperatura > 0) {
            System.out.println("Ponto de fusão não foi atingido !!");
        } else {
            System.out.println("Ponto de fusão do álcool atingido: " + temperatura + "ºC");
        }
    }


}
