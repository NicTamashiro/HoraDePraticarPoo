package CalculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura){
        double area = altura * largura;
        System.out.println("Area: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double perimetro = (altura*2) + (largura*2);
        System.out.println("Perimetro: " + perimetro);
    }
}
