package com.company.Atividade01;

public class Leao extends Animal{

    private String corDaJuba;
    private double tamanhoPresa;

    public Leao(String nome, String especie, double peso, int idade, boolean chifre, String sexo, String corDaJuba, double tamanhoPresa) {
        super(nome, especie, peso, idade, chifre, sexo);
        if (sexo == "macho") {
            this.corDaJuba = corDaJuba;
        } else {
            this.corDaJuba = "";

        }

        this.tamanhoPresa = tamanhoPresa;
    }

    public String getCorDaJuba() {
        return corDaJuba;
    }

    public void setCorDaJuba(String corDaJuba) {
        this.corDaJuba = corDaJuba;
    }

    public double getTamanhoPresa() {
        return tamanhoPresa;
    }

    public void setTamanhoPresa(double tamanhoPresa) {
        this.tamanhoPresa = tamanhoPresa;
    }

    public void emitirSom(){
        System.out.println("roar, grrr !!");
    }
}


