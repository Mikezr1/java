package Lessen.Les2ExtraClasses.Sommen;

public class Modulo {

    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";

    public static int ALFABET = 26;

    public static void main(String[] args) {
        int Getal = 25;
        int Encryptie = 3;
//        int EvenGetallen = 0;
//        int OnevenGetallen = 0;

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

        //Modulo check: Alle hele getallen
        System.out.println(BLUE + "Totaal aantal even getallen" + RESET);

        int AlleEvenGetallen = 26;

        //Eerst de waarde van de variabele initialiseren
        int EvenGetallen = 0;

        //For loop -> voor alle letters in het alfabet
        for (int i = 0; i < ALFABET; i++) {
            //if -> elke iteratie van de for loop delen door 2 en vergelijken met 0 (heel getal)
            if (i % 2 == 0) {
                //Optellen van alle waarden -> alle iteraties
                EvenGetallen += i;
            }
        }
        //Totaal berekening buiten de loop: 1 antwoordt.
        System.out.println("Het totaal aan even getallen: " + EvenGetallen);

//        Variabele intitialiseren
        System.out.println(BLUE + "Totaal aantal oneven getallen" + RESET);
        int OnevenGetallen = 0;

        for (int i = 0; i < ALFABET; i++) {
            if (i % 2 != 0){
                OnevenGetallen += i;
            }
        }
        System.out.println("Het totaal aan oneven getallen: " + OnevenGetallen + "\n");

//        Het verschil tussen even en oneven totalen
        System.out.println(BLUE + "Het verschil" + RESET);

//        Waarde definieren en initaliseren, camelcase nooit pascal case op variabele, wel op classes.
        int Verschil = 0;

        //casten naar een double of float vanuit een int doe je met delen.
        if (EvenGetallen != 0 && OnevenGetallen != 0) {
            Verschil = EvenGetallen - OnevenGetallen;
        }

        System.out.println("Het verschil is: " + Verschil + "\n");

        //Heel kort
        System.out.println(BLUE + "In het kort" + RESET);
        int verkortTotaal = 0;
        for (int i = 0; i < ALFABET; i += Encryptie) {
            verkortTotaal += i;
        }
        System.out.println("In het kort, het totaal is:" + verkortTotaal + "\n");


        //Hoeveel blijft er over als je totaal - getal doet?
        System.out.println("Past totaal in getal?");
        System.out.println(totaal % Getal);

        //Hoe vaak past totaal in getal?
        System.out.println("Past totaal in getal?");
//        double Antwoordt = totaal / Getal;
        System.out.println(String.format("%.2f", (double) totaal / Getal));

    }
}
