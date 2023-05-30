package com.company.Atividade05;

public class Aviao extends Veiculo{

    private double altitude;
    private double resistenciaAr;
    private boolean fluxoArConstante;
    private boolean aviaoSobrevoando; //Se o avião está no chão ou sobrevoando atualmente
    private int quantTurbina;
    private double tamanhoAsa;

    public Aviao(String nome, String chassi, String cor, double tamanho, double peso, int quantRodas, String motor, double litroGasolina, int quantMarcha, double velocidadeAtual, int marchaAtual, boolean fluxoArConstante, boolean aviaoSobrevoando, int quantTurbina, double tamanhoAsa, double altitude, double resistenciaAr) {
        super(nome, chassi, cor, tamanho, peso, quantRodas, motor, litroGasolina, quantMarcha, velocidadeAtual, marchaAtual);
        this.fluxoArConstante = fluxoArConstante;
        this.aviaoSobrevoando = aviaoSobrevoando;
        this.quantTurbina = quantTurbina;
        this.tamanhoAsa = tamanhoAsa;
        this.altitude = altitude;
        this.resistenciaAr = resistenciaAr;
    }

    public boolean isFluxoArConstante() {
        return fluxoArConstante;
    }

    public void setFluxoArConstante(boolean fluxoArConstante) {
        this.fluxoArConstante = fluxoArConstante;
    }

    public boolean isAviaoSobrevoando() {
        return aviaoSobrevoando;
    }

    public void setAviaoSobrevoando(boolean aviaoSobrevoando) {
        this.aviaoSobrevoando = aviaoSobrevoando;
    }

    public int getQuantTurbina() {
        return quantTurbina;
    }

    public void setQuantTurbina(int quantTurbina) {
        this.quantTurbina = quantTurbina;
    }

    public double getTamanhoAsa() {
        return tamanhoAsa;
    }

    public void setTamanhoAsa(double tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getResistenciaAr() {
        return resistenciaAr;
    }

    public void setResistenciaAr(double resistenciaAr) {
        this.resistenciaAr = resistenciaAr;
    }

    //Duvida nessa abaixo, questionar com prof.:
    public void aumentarVelocidade(double pVelocidade, double pAltitude, double pResistenciaAr) {
        if (super.getVelocidadeAtual() < pVelocidade && super.getMarchaAtual() < pAltitude) {
            if (pVelocidade <= 100.00 && pAltitude <= 4) {
                System.out.println("Aviao recebeu a nova velocidade: " + pVelocidade + " | e a nova resistencia do ar: " + pResistenciaAr);
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
                System.out.println("Aviao recebeu a nova velocidade: " + pVelocidade + " | e a nova marcha: " + marcha);
            } else {
                System.out.print("A velocidade não foi alterada. Velocidade desejada é menor que 0.0km/h ou marcha recebida menor que 1 !!");
            }
        } else {
            System.out.print("Erro !!");
        }
    }

}
