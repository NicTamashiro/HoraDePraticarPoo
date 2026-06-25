package TreinandoForeach;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " (" + this.idade + ") e (" + this.genero + ")";
    }
}
