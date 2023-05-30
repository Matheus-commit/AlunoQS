package com.company.Atividade01;

public class Cavalo extends Animal {

    private boolean ferradura;
    private String corDaCrina;

    public Cavalo(String nome, String especie, double peso, int idade, boolean Chifre, String corDaCrina, String sexo){
        super(nome, especie, peso, idade, Chifre, sexo);
        this.ferradura = ferradura;
        this.corDaCrina = corDaCrina;
    }

    public boolean isFerradura() {
        return ferradura;
    }

    public void setFerradura(boolean ferradura) {
        this.ferradura = ferradura;
    }

    public String getCorDaCrina() {
        return corDaCrina;
    }

    public void setCorDaCrina(String corDaCrina) {
        this.corDaCrina = corDaCrina;
    }

    public void emitirSom(){
        System.out.println("iiirrrrí, rilinchin !!");
    }
}
