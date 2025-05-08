package Lessen.les1.VW.Model;

public class Car {

    public String brand;
    private double price;
    protected int year;
    String vinNumber;

    public Car(String brand, double price, int year, String vinNumber) {
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.vinNumber = vinNumber;
    }

    private String formatPrice() {
        return String.format("€%.2f", price);
    }

    protected int getYear() {
        return year;
    }

    String getVinNumber() {
        return vinNumber;
    }

    public void showCarDetails() {
        System.out.println("Merk: " + brand);
        System.out.println("Prijs: " + formatPrice());
        System.out.println("Bouwjaar: " + getYear());
        System.out.println("VIN: " + getVinNumber());
    }
}
