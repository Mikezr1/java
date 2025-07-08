package Lessen.les5H4StringsAndArrays.stringMethods.PositionOfChars;
//charAt -> where is the char at?

//	Index 10 bestaat niet → dus een StringIndexOutOfBoundsException

//1 check of de index binnen de grenzen van de string ligt.

//2 ik wil weten hoe ik een string definineer in main, check in charAtControle en daarna print in main. gelet op het doorgeven (is dat parsen) van de data

public class charAt {
    public static void main(String[] args) {
        String naam = new String("Voorbeeldwoord");

        //Printen van char:
        //System.out.println(naam.charAt(0)); // P
        //System.out.println(naam.charAt(2)); // ?

        charAtControle(naam); //returns self made method

    }

    public static String charAtControle(String naam){
        for (int i = 0; i < naam.length(); i++) {
            System.out.println("Index nummer of Char: " + i);
        }
        return naam; //return the value to main
    }
}
