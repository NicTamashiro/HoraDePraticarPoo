package TreinandoForeach;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList<>();

        pessoa.add(new Pessoa("Nicolas", 18, "Masculino"));
        pessoa.add(new Pessoa("Clarinha", 18, "Feminino"));
        pessoa.add(new Pessoa("Pedro", 18, "Masculino"));

        for(Pessoa item : pessoa){
            System.out.println(item);
        }
    }
}
