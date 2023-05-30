package com.company.Atividade01;

public class Cachorro extends Animal {
    private String raca;
    private String porte;

    public Cachorro(String nome, String especie, double peso, int idade, boolean chifre, String raca, String porte, String sexo) {
        super(nome, especie, peso, idade, chifre, sexo);
        this.raca = raca;
        this.porte = porte;
        this.nome = "Dogão";
        this.sexo = sexo;
    }

    // Sobrescrita
    @Override
     public String getNome() {
        System.out.println("O nome eh: ");
        return super.getNome();
    }

    // Sobrecarga
    public String getNome(String a, int b) {
        a = "b";
        return a;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void emitirSom(){
        System.out.println("au-au!!");
    }
}
