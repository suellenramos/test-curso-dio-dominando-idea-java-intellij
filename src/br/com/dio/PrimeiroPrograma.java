package br.com.dio;

import br.com.dio.model.Cachorro;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro);

        Livro livro = new Livro("Livro Programação na Pática", 300 );
        System.out.println(livro);

       /* int a = 5;
        int b = 3;
        System.out.println("Resultado: " + (a + b));*/
    }
}

class Livro{

    private String nome;
    private Integer numPage;

    public Livro(String nome, Integer numPage) {
        this.nome = nome;
        this.numPage = numPage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPage=" + numPage +
                '}';
    }
}