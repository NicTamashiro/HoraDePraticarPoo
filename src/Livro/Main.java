package Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Código Limpo", "Robert C");
        Livro livro2 = new Livro("Entendendo Algoritmos", "Aditya Bhargava");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
