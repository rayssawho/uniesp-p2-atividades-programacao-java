package br.uniesp.poo.unidade2.ted04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Numero {
    private int numero;
    List<Integer> todosNumeros = new ArrayList<>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void menu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = ler.nextInt();
        setNumero(numero1);
        todosNumeros.add(getNumero());
    }

    public void menorValor(){
        Iterator lista = todosNumeros.iterator();
        int menor = Integer.MAX_VALUE;
        while (lista.hasNext()){
            Integer i = (Integer)lista.next();
            if (i < menor) {
                menor = i;
            }
        }
        System.out.println("O menor valor digitado foi: " + menor);
    }

    public void maiorValor() {
        Iterator lista = todosNumeros.iterator();
        int maior = Integer.MIN_VALUE;
        while (lista.hasNext()) {
            Integer i = (Integer)lista.next();
            if (i > maior) {
                maior = i;
            }
        }
        System.out.println("O maior valor digitado foi: " + maior);
    }

    public void somar(){
        int soma = 0;
        for (Integer i : todosNumeros) {
            soma += i.intValue();
        }
        System.out.println("A soma de todos os números digitados é: " + soma);
    }

    public void somarPares() {
        int somaPares = 0;
        for (Integer i : todosNumeros) {
            if (i.intValue() % 2 == 0) {
                somaPares += i.intValue();
            }
        }
        System.out.println("A soma dos números pares é: " + somaPares);
    }


}
