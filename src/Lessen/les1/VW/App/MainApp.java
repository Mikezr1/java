package Lessen.les1.VW.App;

import Lessen.les1.VW.Model.Car;

public class MainApp {

    public static void main(String[] args) {

        Car vw = new Car("Volkswagen Golf", 30000.00, 2023, "VW12345678");

        System.out.println("Dit is het nieuwste model");

        vw.showCarDetails(); // Optioneel: toont info van de auto
    }
}
