package br.uniesp.poo.unidade2.ted03;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        for (int i = 1; i <= 10; i++){
            pessoa1.menu();
        }

        pessoa1.maiorAltura();
        pessoa1.mediaMasculino();
        pessoa1.registrosFeminino();

    }

}
