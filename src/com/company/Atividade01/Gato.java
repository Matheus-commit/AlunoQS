package com.company.Atividade01;

public class Gato extends Animal {

    private String corOlho;
    private boolean heterocromia;
    private String raca;

    public Gato(String nome, String especie, double peso, int idade, boolean chifre, String raca, String corOlho, boolean heterocromia, String sexo) {
        super(nome, especie, peso, idade, chifre, sexo);
        this.corOlho = corOlho;
        this.raca = raca;
        this.heterocromia = heterocromia;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isHeterocromia() {
        if(heterocromia) {
            System.out.println("Gato com um olhinho de cada cor");
            return heterocromia;
        }
        else{return heterocromia;}
    }

    public void setHeterocromia(boolean heterocromia) {
        this.heterocromia = heterocromia;
    }

    public void emitirSom ()
    {
        System.out.println("Miauuu!!");
    }
}
