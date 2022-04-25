package br.uniesp.poo.unidade2.ted03;


import java.util.*;

public class Pessoa {

    private String genero;
    private int altura;

    List<Integer> alturaGeral = new ArrayList<>();
    List<Integer> alturaFeminino = new ArrayList<>();
    List<Integer> alturaMasculino = new ArrayList<>();
    List<Integer> alturaOutro = new ArrayList<>();

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void maiorAltura(){
        Iterator lista = alturaGeral.iterator();
        int maior = 0;
        while (lista.hasNext()) {
            Integer i = (Integer)lista.next();
            if (i > maior) {
                maior = i;
            }
        }
        System.out.println("A maior altura é: " + maior);

    }

    public void mediaMasculino(){
        int soma = 0;
        int quantidade = 0;
        for (Integer i : alturaMasculino) {
            soma += i.intValue();
            quantidade += 1;
        }
        double media = soma / quantidade;
        System.out.println("A média da altura do gênero Masculino é: "
        + media);
    }

    public void registrosFeminino(){
        int numRegistros = alturaFeminino.size();

        System.out.println("O número de registros do gênero Feminino é: "
        + numRegistros);
    }

    public void menu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira letra do gênero" +
                " da pessoa:\nF - Feminino\n" +
                "M - Masculino\nO - Outro\n ");
        String escolha = ler.nextLine();
        escolha = escolha.toUpperCase();
        setGenero(escolha);

        System.out.println("Digite a altura da pessoa em cm (ex: 170): ");
        int escolha2 = ler.nextInt();
        setAltura(escolha2);

        if (getGenero().equals("F")) {
            alturaFeminino.add(getAltura());
        } else if (getGenero().equals("M")){
            alturaMasculino.add(getAltura());
        } else if (getGenero().equals("O")){
            alturaOutro.add(getAltura());
        }
        else {
            System.out.println("Opção inválida");
        }

        alturaGeral.add(getAltura());

    }


}