package Lessen.H5.Statements;

/*
Een andere manier van conditionele logica binnen veel programmeertalen is het werken met switch statements.
Sinds Java 7 zit dit ook in Java.
*/

public class nvt {
    public static void main(String[] args) {

        // Switch statement voorbeeld
        int expressie = 1; // voorbeeldwaarde

        switch (expressie) {
            case 0:
                System.out.println("Expressie is nul");
                break;
            case 1:
                System.out.println("Expressie is één");
                break;
            default:
                System.out.println("Expressie heeft een andere waarde");
                break;
        }

        // if statement als alternatief
        int andereExpressie = 1;
        if (andereExpressie == 0) {
            System.out.println("Expressie is nul");
        } else if (andereExpressie == 1) {
            System.out.println("Expressie is één");
        } else {
            System.out.println("Expressie heeft een andere waarde");
        }

        // switch statement zonder break (fall-through)
        int aantal = 0;
        switch (aantal) {
            case 0:
                System.out.println("nul");
                // geen break, dus gaat door naar case 1
            case 1:
                System.out.println("een");
                // geen break, dus gaat door naar default
            default:
                System.out.println("veel");
        }

        // switch statement met break
        int anderAantal = 1;
        switch (anderAantal) {
            case 0:
                System.out.println("nul");
                break;
            case 1:
                System.out.println("een");
                break;
            default:
                System.out.println("veel");
                break;
        }
    }
}
