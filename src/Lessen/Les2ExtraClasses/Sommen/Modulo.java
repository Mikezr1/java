package Lessen.Les2ExtraClasses.Sommen;

public class Modulo {

    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";

    public static int ALFABET = 26;

    public static void main(String[] args) {
        int Getal = 26;
        int Encryptie = 3;

        //Optellen of aftrekken
        System.out.println(Getal + Encryptie);

        //Modulo: Past dit getal in het andere getal?
        System.out.println(BLUE + "Past dit getal in het andere getal?" + RESET);
        int totaal = Getal + Encryptie;

        for (int i = 0; i < ALFABET ; i++) {
            if (totaal % Getal == 0) {
                System.out.println(i + " past er in");
            } else {
                System.out.println(i + " Past er niet in");
            }
        }

        //Hoeveel blijft er over als je totaal - getal doet?
        System.out.println("Past totaal in getal?");
        System.out.println(totaal % Getal);

        //Hoevaak past totaal in getal?
        System.out.println("Past totaal in getal?");
//        double Antwoordt = totaal / Getal;
        System.out.println(String.format("%.2f", (double) totaal / Getal));

    }
}
