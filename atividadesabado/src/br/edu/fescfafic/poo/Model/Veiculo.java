package br.edu.fescfafic.poo.Model;

public class Veiculo {
    String modeloDoVeiculo;
    String corDoVeiculo;
    int placaDoCarro;
    int chassiDoCarro;
    public Veiculo(String veiculo, String cor, int placa, int chassi) {
        this.modeloDoVeiculo = veiculo;
        this.corDoVeiculo = cor;
        this.placaDoCarro = placa;
        this.chassiDoCarro = chassi;
    }
    public void acelerar() {
        System.out.println("Acelerando...");
    }
    public void parar(){
        System.out.println("Parar...");
    }
    public String toString() {
        return "Veiculo{" +
                "modeloVeiculo='" + modeloDoVeiculo+ '\'' +
                ", cor='" + corDoVeiculo + '\'' +
                ", placa='" + placaDoCarro + '\'' +
                ", chassi='" + chassiDoCarro + '\'' ;}}