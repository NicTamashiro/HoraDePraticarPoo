package TemperaturaConversor;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temp){
        double fahrenheit = (temp * 9.0/5.0) + 32;
        System.out.println("Temperatura para fahrenheit: " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double temp){
        double celsius = (temp - 32) * 5.0 / 9.0;
        System.out.println("Temperatura para celsius: " + celsius);
    }
}
