package br.uniesp.poo.unidade2.ted04;

public class Main {
    public static void main(String[] args) {
        Numero num = new Numero();
        for (int i = 1; i <= 10; i++){
            num.menu();

        }
        num.menorValor();
        num.maiorValor();
        num.somar();
        num.somarPares();
    }
}
