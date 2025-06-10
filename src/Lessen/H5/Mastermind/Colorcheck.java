package Lessen.H5.Mastermind;

public class Colorcheck {
    public static void main(String[] args) {
//      random woord inladen uit methode
        colorCheck();
    }

    public static boolean colorCheck() {
        //        Zit de kleur blauw in een van de kleuren in de array?

        String kleurBlauw = "blue";

        /*data type item : array*/
        for (Colors color2 : Colors.values()) {
            if (color2.name().equals(kleurBlauw)) {
                System.out.println("De kleur blauw zit er in");
                return true;
            }
        }
        System.out.println("helaas geen blauw");
        return false;
    }
}
