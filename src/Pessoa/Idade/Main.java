package Pessoa.Idade;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Nicolas Tamashiro");
        pessoa.setIdade(18);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.verificarIdade();
    }
}
