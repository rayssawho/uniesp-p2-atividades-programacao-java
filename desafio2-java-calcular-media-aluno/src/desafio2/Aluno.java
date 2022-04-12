package desafio2;

import java.util.Scanner;

public class Aluno {

    String nome;
    String curso;
    int periodo;
    int faltas;
    double nota1;
    double nota2;
    double media;

    public void mediaAluno(){

        media = (nota1 + nota2) / 2;
    }

    public double verificaNota(){
        Scanner leitor = new Scanner(System.in);
        double valorNota = leitor.nextDouble();
        while (valorNota > 10 || valorNota < 0) {
            System.out.println("Nota Inválida. A nota precisa estar entre 0 e 10. " +
                    "\nDigite novamente: ");
            valorNota = leitor.nextDouble();

        }
        if (valorNota <= 10 && valorNota > 0) {
            return valorNota;
        }
        return valorNota;
    }

    public void situacaoAluno(){
        if (media > 0 & media <= 4.9){
            double notaNecessaria = 10 - media + 2;
            System.out.println(nome + " está em recuperação, e precisa " +
                    "tirar " + notaNecessaria + " para ser aprovado.");
        } else if (media >= 5 & media <= 6.9) {
            double notaNecessaria = 10 - media;
            System.out.println(nome + " está na prova final, e precisa " +
                    "tirar " + notaNecessaria + " para ser aprovado.");
        } else if (media >= 7 & media <= 10) {
            System.out.println(nome + " foi aprovado por média! ");
        }
    }
}
