package br.uniesp.poo.unidade2.ted02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        List<Integer> numerosPositivos = new ArrayList<Integer>();
        List<Integer> numerosNegativos = new ArrayList<Integer>();
        int quantPositivos = 0;
        int quantNegativos = 0;
        int soma = 0;
        int quantidade = 0;
        double media;

        do {
            System.out.println("Digite um número inteiro: ");
            numero = ler.nextInt();
            soma = numero + soma;

            if (numero > 0 & numero != 0) {
                numerosPositivos.add(numero);
                quantidade += 1;
                quantPositivos += 1;
            } else if (numero < 0 & numero != 0) {
                numerosNegativos.add(numero);
                quantidade += 1;
                quantNegativos += 1;
            }

        } while (numero != 0);

        media = soma / quantidade;

        System.out.println("Quantidade de números positivos: "+ quantPositivos +
                ". Os números foram: " + numerosPositivos);
        System.out.println("Quantidade de número negativos: "+ quantNegativos +
                ". Os números foram: " + numerosNegativos);
        System.out.println("A soma dos valores digitados é: " + soma);
        System.out.println("A média dos valores digitados é: " + media);


    }
}