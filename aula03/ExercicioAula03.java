package br.uniesp.poo.aula03;

import java.util.Scanner;

public class ExercicioAula03 {

    public static void main(String[] args) {

        int quantCerveja = 99;

        while (quantCerveja > 0 && quantCerveja <= 99) {

            Scanner leitor = new Scanner(System.in);
            System.out.println("Você pegou quantas cervejas no Freezer? (Digite um número inteiro): ");
            int escolha = leitor.nextInt();

            if (escolha < 0) {
                System.out.println("Quantidade inválida. Tente Novamente:");
            }

            if ((quantCerveja - escolha) < 0){
                System.out.println("Quantidade inválida. Tente Novamente: ");
            }

            if (escolha != 0 && escolha > 0 && (quantCerveja - escolha) >= 0) {

                System.out.println("Você pegou " + escolha + " cervejas no freezer");
                quantCerveja = quantCerveja - escolha;
                System.out.println("Restam " + quantCerveja + " cervejas no freezer");
            }

            if (escolha == 0) {
                break;
            }
            while (quantCerveja == 0) {
                    Scanner leitor2 = new Scanner(System.in);
                    System.out.println("O freezer está vazio. Digite a quantidade que deseja adicionar. " +
                            "(Caso não desejar adicionar mais cervejas ao freezer, digite 0).");
                    int escolha2 = leitor2.nextInt();

                    if (escolha2 > 99) {

                        System.out.println(" Quantidade Inválida. A capacidade máxima do freezer é de 99 cervejas. Tente novamente: ");
                    }

                    if (escolha2 < 0) {
                        System.out.println("Quantidade inválida. Tente Novamente: ");
                    }

                    if (escolha2 != 0 && escolha2 > 0 && escolha2 <= 99) {
                        quantCerveja = quantCerveja + escolha2;
                        System.out.println("Foram adicionadas " + escolha2 + " cervejas ao freezer.");
                    } if (escolha2 == 0) {
                        break;
                }

                }





        }
    }
}
