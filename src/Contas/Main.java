package Contas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(1234, 5000));
        contas.add(new ContaBancaria(1357, 3000));
        contas.add(new ContaBancaria(2468, 9000));
        contas.add(new ContaBancaria(1111, 4000));

        ContaBancaria contaMaiorSaldo = contas.get(0);
        for(ContaBancaria conta: contas){
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() + ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
