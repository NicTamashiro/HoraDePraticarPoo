package TreinandoArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Nicolas", 18);
        Pessoa pessoa2 = new Pessoa("Caue", 18);
        Pessoa pessoa3 = new Pessoa("Pedro", 18);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamasho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println(listaDePessoas);

    }
}
