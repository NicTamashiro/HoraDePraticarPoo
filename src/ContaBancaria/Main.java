package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.setSaldo(9000);
        System.out.println("Meu saldo: " + minhaConta.consultarSaldo());
        minhaConta.sacar(1000);
        minhaConta.depositar(2000);
        minhaConta.cobrarTarifaMensal();
        System.out.println("Novo saldo: " + minhaConta.consultarSaldo());
    }
}
