package com.company.Atividade01;

public class Animal {
    protected String nome;
    protected String especie;
    protected double peso;
    protected int idade;
    protected boolean chifre;
    protected String sexo;

    public Animal(String nome, String especie, double peso, int idade, boolean chifre, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.chifre = chifre;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isChifre() {return chifre;}

    public void setChifre(boolean chifre) {this.chifre = chifre;}

    public String getSexo() {return sexo;}

    public void setSexo(String sexo) {this.sexo = sexo;}

    public void emitirSom(){
        System.out.println("Som do animal !!!");
    }
}
