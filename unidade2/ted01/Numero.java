package br.uniesp.poo.unidade2.ted01;

import java.util.Random;
import java.util.Scanner;

public class Numero {
    int numRandom;
    int numUsuario;

    public void geraRandom(){
        Random geradorRandom = new Random();
        numRandom = geradorRandom.nextInt(11);
    }

    public void tentativaUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 0 a 10: ");
        numUsuario = leitor.nextInt();

        int contador = 1;

        while (numUsuario != numRandom) {
            if (numUsuario > numRandom){
                System.out.println("Infelizmente você errou! " +
                        "Dica: Tente um número menor. ");
            }else {
                System.out.println("Infelizmente você errou! " +
                        "Dica: Tente um número maior. ");
            }
            contador += 1;

            System.out.println("Digite um número inteiro de 0 a 10: ");
            numUsuario = leitor.nextInt();
        }

        System.out.format("Parabéns, você acertou em %d tentativas! ", contador);
        }

    }

