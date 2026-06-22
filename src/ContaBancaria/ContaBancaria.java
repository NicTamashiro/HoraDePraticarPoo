package ContaBancaria;

public class ContaBancaria {
    private double saldo;

    public double consultarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Deve ser um valor maior que '0'!");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }
}
