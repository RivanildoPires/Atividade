package br.edu.fescfafic.poo.Main;
import br.edu.fescfafic.poo.Model.Casa;
import br.edu.fescfafic.poo.Model.Pessoa;
import br.edu.fescfafic.poo.Model.Veiculo;
import br.edu.fescfafic.poo.Model.Animal;
public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Fiat Uno 2012", "Preto", 503421, 409203);
        Veiculo veiculo2 = new Veiculo("Ranger Rouver","Azul", 503922, 129200);
        Veiculo veiculo3 = new Veiculo("Ferrari","Vermelha", 320302, 230900);
        Veiculo veiculo4 = new Veiculo("Audi", "Roxa", 329302, 323230);
        Veiculo veiculo5 = new Veiculo("BMW", "Rosa", 329102, 332230);

        Veiculo[] listaDeVeiculos = new Veiculo[6];
        listaDeVeiculos[0] = veiculo1;
        listaDeVeiculos[1] = veiculo2;
        listaDeVeiculos[2] = veiculo3;
        listaDeVeiculos[3] = veiculo4;
        listaDeVeiculos[4] = veiculo5;

        Animal animal1 = new Animal("Pitbull", "Alberto", 0.50, "Preto");
        Animal animal2 = new Animal("Pinscher", "Raivoso", 0.80, "Marrom");
        Animal[] listaDeAnimais = new Animal[3];
        listaDeAnimais[0] = animal1;
        listaDeAnimais[1] = animal2;

        Pessoa pessoa1 = new Pessoa("Rivanildo Pires", "Rivinha", "13290329", "30213921", 1.90);
        Pessoa pessoa2 = new Pessoa("Maciano Dantas", "Macinao","2309032","3923029032", 1.70);

        Pessoa[] listaDePessoas = new Pessoa[2];
        listaDePessoas[0] = pessoa1;
        listaDePessoas[1] = pessoa2;

        Casa casa = new Casa(listaDeVeiculos, listaDeAnimais, listaDePessoas);

        casa.imprimirVeiculos();

        casa.imprimirAnimais();

        casa.imprimirPessoas();





    }

}