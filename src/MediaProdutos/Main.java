package MediaProdutos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Macarrao", 8.00));
        listaProdutos.add(new Produto("Arroz", 5.00));
        listaProdutos.add(new Produto("feijao", 10.00));

        double somaPrecos = 0;
        for(Produto produto : listaProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
