package ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setDolar(2400);
        System.out.println("Valor em Reais: " + conversor.converterDolarParaReal());
    }
}
