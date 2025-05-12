package Lessen.Les2ExtraClasses.Aanroepen;
//Importeren doe je onder de package

//scanner
import java.util.Scanner;


public class AanroepenVanWaarde {

    // Vaste waarden die niet mogen veranderen. IN HOOFDLETTERS
    public static final int ALFABET = 26;

    //Kleuren buiten de main method definiëren!
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        //Invoer bron: Scanner functie
        Scanner GetalScanner = new Scanner(System.in);

        //Hier zet je handmatig de waarde neer waarmee elke iteratie van de loop mee gaat werken.
        int testnaam = 3;

        //Hier zet je het waarde invoer veld voor de scanner
//        int GetalInvoer = GetalScanner.nextInt();

        //Dit is de uitkomst van je berekening in de for loop
        int alleOnevenGetallen = 0;

        for (int i = 5; i < 40 ; i++) {

            //definiëren van een waarde: data type + variabele naam = waarde. Zet je hem in een loop dan blijft de loop optellen. Ook belangrijk, de data blijven niet opgeslagen zo.
//            int testnaam = 4;

            //een waarde weergeven
            System.out.println(BLUE + "Een waarde weergeven" + RESET);
            System.out.println(testnaam);

            //meerdere waarden weergeven verticale lijn
            System.out.println("\n" + BLUE + "Meerdere waarden weergeven verticale lijn" + RESET);
            System.out.println(testnaam + "(" + i + ")");

            //een waarde weergeven in meerdere horizontale lijnen
            System.out.println("\n" + BLUE + "Een waarde weergeven in meerdere horizontale lijnen" + RESET);
            System.out.print((testnaam + 1) + " (" + "Iteratie getal: " + i + ")");

            // Totale waarde van een loop (alle iteraties/i optellen)
            System.out.println("\n" + BLUE + "Totaal aantal van alle iteratie tot het max punt en opgeteld" + RESET);
            System.out.println(i);

            // Totale waarde van een loop (alle iteraties/i optellen), maar dan alleen met allen oneven getallen
            System.out.println("\n" + BLUE + "Totaal aantal van alle iteratie tot het max punt en opgeteld" + RESET);
            if (i % 2 == 0) {
                alleOnevenGetallen += i;
            }
            System.out.println(alleOnevenGetallen);

            //Hoevaak past totaal in getal?
            int Getal = 26;
            int Encryptie = 3;
            double totaal = Getal + Encryptie;
            //Werk je met een double/int of char? Gebruik bij sommen dan ook (char), (double) om de waarde weer te geven aan de computer zodat de berekening kan worden gemaakt.
            System.out.println("Hoevaak past totaal in getal?");
            System.out.println(String.format("%.1f", (double) totaal / Getal) + " keer");

            //Shorthands

//            int testnaam += 2;
        }
    }
}
