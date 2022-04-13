package br.uniesp.poo.unidade2.ted01;

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();

        System.out.println("Vamos Jogar? Tente acertar o número.");

        numero.geraRandom();
        numero.tentativaUsuario();
    }
}
