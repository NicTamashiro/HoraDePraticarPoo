package NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)) {
            System.out.println(numero + " eh primo.");
        } else {
            System.out.println(numero + " nao eh primo.");
        }
    }
}
