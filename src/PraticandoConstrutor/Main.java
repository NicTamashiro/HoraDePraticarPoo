package PraticandoConstrutor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(new Produto("Agua", 5.50, 10));
        listaDeProdutos.add(new Produto("Coca-Cola", 7.50, 7));
        listaDeProdutos.add(new Produto("Pao de queijo", 15.00, 5));

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto no indice 0: " + listaDeProdutos.getFirst().getNome());

        System.out.println();

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<ProdutoPerecivel> produtosPereciveis = new ArrayList<>();

        produtosPereciveis.add(new ProdutoPerecivel("Agua", 5.50, 10, "25/08/2027"));
        produtosPereciveis.add(new ProdutoPerecivel("Coca-Cola", 7.50, 7, "15/08/2026"));
        produtosPereciveis.add(new ProdutoPerecivel("Pao de Queijo", 15.00, 5, "15/09/2026"));
        produtosPereciveis.add(new ProdutoPerecivel("Bolo", 20.00, 3, "12/08/2026"));

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto no indice 0: " + listaDeProdutos.getFirst().getNome());

        System.out.println();

        for(ProdutoPerecivel produto : produtosPereciveis){
            System.out.println(produto);
        }
    }
}
