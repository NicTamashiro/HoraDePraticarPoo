package Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 2000.0);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preco: " + produto1.getPreco());

        produto1.aplicarDesconto(10);
        System.out.println("Novo preco: " + produto1.getPreco());
    }
}
