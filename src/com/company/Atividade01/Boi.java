package com.company.Atividade01;

public class Boi extends Animal{

    boolean ferradura;
    double tamanhoChifre;

    public Boi(String nome, String especie, double peso, int idade, boolean chifre, String sexo, double tamanhoChifre, boolean ferradura) {
        super(nome, especie, peso, idade, chifre, sexo);
        if (chifre){
            this.tamanhoChifre = tamanhoChifre;
        }else {
            this.tamanhoChifre = 0.0;
        }
        this.ferradura = ferradura;
    }

    public boolean isFerradura() {
        return ferradura;
    }

    public void setFerradura(boolean ferradura) {
        this.ferradura = ferradura;
    }

    public double getTamanhoChifre() {
        return tamanhoChifre;
    }

    public void setTamanhoChifre(double tamanhoChifre) {
        this.tamanhoChifre = tamanhoChifre;
    }

    public void emitirSom(){
        System.out.println("Muuuu !!");
    }
}
