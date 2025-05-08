package Lessen.les1.voorbeeld1;

public class Temperatuur {
    public static void main(String[] args) {

        double celsius = 1.8;
        double fahrenheit = 60;

        System.out.println("Hoeveel Fahrenheit is het momenteel?");

        double farenheitInCelsius = (fahrenheit - 32) * celsius;
        System.out.println("Fareneit is " + String.format("%.2f",farenheitInCelsius) + " graden celsius");
    }
}
