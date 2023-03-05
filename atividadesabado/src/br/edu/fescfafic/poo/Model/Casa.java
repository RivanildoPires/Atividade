package br.edu.fescfafic.poo.Model;

public class Casa {
    Veiculo[] listaDeVeiculos = new Veiculo[2];
    Animal[] listaDeAnimais = new Animal[3];
    Pessoa[] listaDePessoas = new Pessoa[4];

    public Casa(Veiculo[] listaDeVeiculos, Animal[] listaDeAnimais, Pessoa[] listaDePessoas) {
        this.listaDeAnimais = listaDeAnimais;
        this.listaDeVeiculos = listaDeVeiculos;
        this.listaDePessoas = listaDePessoas;}

    public void imprimirAnimais () {
        for (Animal animal : listaDeAnimais) {
            System.out.println(animal);
        }
    }
    public void imprimirVeiculos () {
        for (Veiculo veiculos : listaDeVeiculos) {
            System.out.println(veiculos);
        }
    }
    public void imprimirPessoas () {
        for (Pessoa pessoas : listaDePessoas) {
            System.out.println(pessoas);
        }
    }
}
