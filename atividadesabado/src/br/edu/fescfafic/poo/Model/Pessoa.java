package br.edu.fescfafic.poo.Model;

public class Pessoa {
    String nomeCompleto;
    String apelido;
    String cpf;
    String rg;
    double altura;

    public Pessoa(String nome, String apelido, String cpf, String rg, double altura) {
        this.nomeCompleto = nome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.rg = rg;
        this.altura = altura;
    }

    public void andar() {
        System.out.println("Andando...");
    }

    public void pular() {
        System.out.println("Pulou...");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", apelido='" + apelido + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", altura=" + altura +
                '}';
    }

}

