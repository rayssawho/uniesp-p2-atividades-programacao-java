import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();


        Scanner leitor = new Scanner(System.in);
        System.out.println("---> Estudantes da Nova Ordem Jedi <--- \nDigite o nome do(a) Jedi: ");
        aluno1.nome = leitor.nextLine();

        System.out.format("Informe o curso de %s: ",aluno1.nome);
        aluno1.curso = leitor.nextLine();

        System.out.format("Digite o número de qual período %s está. Ex: 1, 2, 3...: ",aluno1.nome);
        aluno1.periodo = leitor.nextInt();

        System.out.format("Informe a quantidade de faltas de %s: ",aluno1.nome);
        aluno1.faltas = leitor.nextInt();


        System.out.format("Digite a primeira nota de %s: (Use a vírgula para notas quebradas. Ex: 9,7) ",aluno1.nome);

        aluno1.nota1 = aluno1.verificaNota();

        System.out.format("Digite a segunda nota de %s: (Use a vírgula para notas quebradas. Ex: 9,7) ",aluno1.nome);

        aluno1.nota2 = aluno1.verificaNota();

        System.out.format("Digite a terceira nota de %s: (Use a vírgula para notas quebradas. Ex: 9,7) ",aluno1.nome);

        aluno1.nota3 = aluno1.verificaNota();

        aluno1.mediaAluno();

        System.out.println("---> Informações do(a) Jedi: <---");
        System.out.format("Nome: %s \nCurso: %s \nPeríodo: %d " +
                "\nFaltas: %d \n1ª nota: %.2f \n2ª nota: %.2f \n3ª nota: %.2f " +
                "\nMédia: %.2f", aluno1.nome,aluno1.curso,aluno1.periodo,
                aluno1.faltas,aluno1.nota1,aluno1.nota2,aluno1.nota3,aluno1.media);
    }
}

