package br.uniesp.poo.aula03;

public class Professor {

    String nomeProfessor;
    String disciplina ;
    /**
     * Esse método ensina alguma disciplina.
     */
    public void ensinar(){
        System.out.println("O professor(a) " + this.nomeProfessor + " ensina a disciplina de " + this.disciplina) ;
    }
}
