package com.company.Atividade05;

public class Moto extends Veiculo{

    private String categoriaMoto;
    private boolean capacete;
    private int quantTuboEscape;
    private boolean retrovisor;


    public Moto(String nome, String chassi, String cor, double tamanho, double peso, int quantRodas, String motor, double litroGasolina, int quantMarcha, double velocidadeAtual, int marchaAtual, String categoriaMoto, boolean capacete, int quantTuboEscape, boolean retrovisor) {
        super(nome, chassi, cor, tamanho, peso, quantRodas, motor, litroGasolina, quantMarcha, velocidadeAtual, marchaAtual);

        this.categoriaMoto = categoriaMoto;
        this.capacete = capacete;
        this.quantTuboEscape = quantTuboEscape;
        this.retrovisor = retrovisor;
    }

    public String getCategoriaMoto() {
        return categoriaMoto;
    }

    public void setCategoriaMoto(String categoriaMoto) {
        this.categoriaMoto = categoriaMoto;
    }

    public boolean isCapacete() {
        return capacete;
    }

    public void setCapacete(boolean capacete) {
        this.capacete = capacete;
    }

    public int getQuantTuboEscape() {
        return quantTuboEscape;
    }

    public void setQuantTuboEscape(int quantTuboEscape) {
        this.quantTuboEscape = quantTuboEscape;
    }

    public boolean isRetrovisor() {
        return retrovisor;
    }

    public void setRetrovisor(boolean retrovisor) {
        this.retrovisor = retrovisor;
    }

    public void aumentarVelocidade(double pVelocidade, int marcha) {
        if (super.getVelocidadeAtual() < pVelocidade && super.getMarchaAtual() < marcha) {
            if (pVelocidade <= 100.00 && marcha <= 4) {
                System.out.println("Moto recebeu a nova velocidade: " + pVelocidade + " | e a nova marcha: " + marcha);
            } else {
                System.out.print("A velocidade não foi alterada. Velocidade desejada é maior que 200km/h ou marcha recebida maior que 5 !!");
            }
        } else {
            System.out.print("Erro !!");
        }
    }

    public void diminuirVelocidade(double pVelocidade, int marcha){
        if (super.getVelocidadeAtual() > pVelocidade && super.getMarchaAtual() > marcha) {
            if (pVelocidade > 0.0 && marcha >= 1) {
                System.out.println("Moto recebeu a nova velocidade: " + pVelocidade + " | e a nova marcha: " + marcha);
            } else {
                System.out.print("A velocidade não foi alterada. Velocidade desejada é menor que 0.0km/h ou marcha recebida menor que 1 !!");
            }
        } else {
            System.out.print("Erro !!");
        }
    }

}
