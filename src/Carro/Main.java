package Carro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Tiggo 7 sport");
        meuCarro.setCategoria("SUV");
        meuCarro.setCor("Branco");
        meuCarro.setAnoDeFabricacao(2024);
        meuCarro.setPrecos(120000, 125000, 130000);
        meuCarro.exibirInfo();
    }
}
