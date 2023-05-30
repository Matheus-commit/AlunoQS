package com.company.Atividade02;

public class Amonia extends Substancia{

    private int quantAtomosNitrogenio;
    private int quantAtomosHidrogenio;


    public Amonia(String nome, String cor, String composicaoQuimica, double densidade, int quantAtomosHidrogenio, int quantAtomosNitrogenio){
        super(nome, cor, composicaoQuimica, densidade);
        this.quantAtomosHidrogenio = quantAtomosHidrogenio;
        this.quantAtomosNitrogenio = quantAtomosNitrogenio;
    }

    public int getQuantAtomosNitrogenio() {
        return quantAtomosNitrogenio;
    }

    public void setQuantAtomosNitrogenio(int quantAtomosNitrogenio) {
        this.quantAtomosNitrogenio = quantAtomosNitrogenio;
    }

    public int getQuantAtomosHidrogenio() {
        return quantAtomosHidrogenio;
    }

    public void setQuantAtomosHidrogenio(int quantAtomosHidrogenio) {
        this.quantAtomosHidrogenio = quantAtomosHidrogenio;
    }

    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        if (temperatura < -33) {
            System.out.println("Temperatura de ebulição da água não foi atingido");
        } else {
            System.out.println("Temperatura de ebulição da amônia atingido: " + temperatura + "ªC");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura){
        if (temperatura < -77){
            System.out.println("Ponto de fusão não foi atingido !!");
        }else {
            System.out.println("Ponto de fusão da amônia atingido: " + temperatura + "ºC");
        }
    }


}
