package Carro;

public class ModeloCarro extends Carro{
    private String categoria;
    private String cor;
    private int anoDeFabricacao;

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
    }
}
