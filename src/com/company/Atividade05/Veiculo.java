package com.company.Atividade05;

public class Veiculo {

    protected String nome;
    protected String chassi;
    protected String cor;
    protected double tamanho;
    protected double peso;
    protected int quantRodas;
    protected String motor;
    protected double litroGasolina;
    protected int quantMarcha;
    protected double velocidadeAtual;
    protected int marchaAtual;

    public Veiculo(String nome, String chassi, String cor, double tamanho, double peso, int quantRodas, String motor, double litroGasolina, int quantMarcha, double velocidadeAtual, int marchaAtual) {
        this.nome = nome;
        this.chassi = chassi;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
        this.quantRodas = quantRodas;
        this.motor = motor;
        this.litroGasolina = litroGasolina;
        this.quantMarcha = quantMarcha;
        this.velocidadeAtual = velocidadeAtual;
        this.marchaAtual = marchaAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantRodas() {
        return quantRodas;
    }

    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getLitroGasolina() {
        return litroGasolina;
    }

    public void setLitroGasolina(double litroGasolina) {
        this.litroGasolina = litroGasolina;
    }

    public int getQuantMarcha() {
        return quantMarcha;
    }

    public void setQuantMarcha(int quantMarcha) {
        this.quantMarcha = quantMarcha;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public double aumentarVelocidade(double pVelocidade) {
        return pVelocidade;
    }

    public double diminuirVelocidade(double pVelocidade){
        return pVelocidade;
    }
}
