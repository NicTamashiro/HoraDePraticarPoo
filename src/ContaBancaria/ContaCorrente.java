package ContaBancaria;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){
        double tarifa = 0.05;
        double saldo = consultarSaldo();
        setSaldo(saldo * (1 - tarifa));
    }
}
