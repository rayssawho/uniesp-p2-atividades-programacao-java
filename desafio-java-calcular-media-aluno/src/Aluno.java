import java.util.Scanner;

public class Aluno {

    String nome;
    String curso;
    int periodo;
    int faltas;
    double nota1;
    double nota2;
    double nota3;
    double media;

    public void mediaAluno(){

        media = (nota1 + nota2 + nota3) / 3;
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
}

