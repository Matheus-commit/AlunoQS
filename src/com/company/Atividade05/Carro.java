package com.company.Atividade05;

public class Carro extends Veiculo{

    private String tipoCarro; //eletrico, tradicinal
    private boolean cameraMarchaRe;
    private boolean arCondicionado;
    private boolean airBags;


    public Carro(String nome, String chassi, String cor, double tamanho, double peso, int quantRodas, String motor, double litroGasolina, int quantMarcha, double velocidadeAtual, int marchaAtual, String tipoCarro, boolean cameraMarchaRe, boolean arCondicionado, boolean airBags) {
        super(nome, chassi, cor, tamanho, peso, quantRodas, motor, litroGasolina, quantMarcha, velocidadeAtual, marchaAtual);
        this.tipoCarro = tipoCarro;
        this.arCondicionado = arCondicionado;
        this.cameraMarchaRe = cameraMarchaRe;
        this.airBags = airBags;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public boolean isCameraMarchaRe() {
        return cameraMarchaRe;
    }

    public void setCameraMarchaRe(boolean cameraMarchaRe) {
        this.cameraMarchaRe = cameraMarchaRe;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isAirBags() {
        return airBags;
    }

    public void setAirBags(boolean airBags) {
        this.airBags = airBags;
    }

    public void aumentarVelocidade(double pVelocidade, int marcha) {
        if (super.getVelocidadeAtual() < pVelocidade && super.getMarchaAtual() < marcha) {
            if (pVelocidade <= 200.00 && marcha <= 5) {

                super.setVelocidadeAtual(pVelocidade);
                super.setMarchaAtual(marcha);
                System.out.println("Carro recebeu a nova velocidade: " + pVelocidade + " | e a nova marcha: " + marcha);

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

                super.setVelocidadeAtual(pVelocidade);
                super.setMarchaAtual(marcha);
                System.out.println("Carro recebeu a nova velocidade: " + pVelocidade + " | e a nova marcha: " + marcha);

            } else {
                System.out.print("A velocidade não foi alterada. Velocidade desejada é menor que 0.0km/h ou marcha recebida menor que 1 !!");
            }
        } else {
            System.out.print("Erro !!");
        }
    }
}
