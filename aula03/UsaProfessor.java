package br.uniesp.poo.aula03;

public class UsaProfessor {

    public static void main(String[] args) {
        Professor fujioka = new Professor();
        fujioka.nomeProfessor = "Rodrigo Fujioka";
        fujioka.disciplina = "Linguagem de Programação";
        fujioka.ensinar();

        Professor messias = new Professor();
        messias.nomeProfessor = "Messias";
        messias.disciplina = "Banco de Dados";
        messias.ensinar();

        Professor marcelo = new Professor();
        marcelo.nomeProfessor = "Marcelo";
        marcelo.disciplina = "Coordenação";
        marcelo.ensinar();

        Professor josemary = new Professor();
        josemary.nomeProfessor = "Josemary";
        josemary.disciplina = "Rede de Computadores";
        josemary.ensinar();
    }


}
