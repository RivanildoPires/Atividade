package br.edu.fescfafic.poo.Model;

public class Animal {
    String racaAnimal;
    String nomeAnimal;
    double tamanhoAnimal;
    String corDoPelo;

    public Animal(String raca, String nome, double tamanho, String pelo) {
        this.racaAnimal = raca;
        this.nomeAnimal = nome;
        this.tamanhoAnimal = tamanho;
        this.corDoPelo = pelo;
    }

    public void acordar() {
        System.out.println("O animal acordou.");
    }

    public void dormir() {
        System.out.println("O animal dormiu.");

    }
    public String toString(){
        return "Animal{" +
                "raça='" + racaAnimal+ '\'' +
                ", nome='" + nomeAnimal + '\'' +
                ", tamanho='" + tamanhoAnimal + '\'' +
                ", corDoPelo='" + corDoPelo + '\'' ;}}