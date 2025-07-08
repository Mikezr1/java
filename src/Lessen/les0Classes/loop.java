package Lessen.les0Classes;

//10//
/*
123 rij met 1 loop
int i = 0 -> inialisatie
i <= 9 -> optellen van 1 naar 9
i++ -> elke rond een 1 omhoog
*/

//27//
//Aantal loops: twee
//Loop 1 -> variabele i is gelijk aan nums; variabele i mag gaan tot 0; per iteratie / for loop daalt i met 1
//Loop 2 -> variabele j is gelijk aan 1; de loop blijft doorgaan zolang j gelijk/kleiner is dan nums
//Print out ->

//41// Aflopende getallen
//maak een rij van 60 tot 24
//Statement 1-> Wordt 1x uitgevoerd om te achterhalen wat de start waarde van variabele I is voor in de for loop.
//Statement 2 -> Defineert de conditie voor het uitvoeren van de for loop. Loop door tot i kleiner/gelijk is aan 24. En I dus niet meer past in 24.
//Statement 3 -> Dit is het code block dat elke keer uitgevoerd wordt als statement 2 akkoord is.

//47// Grid

public class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2) );
        }

        int nums = 8;

        for (int i = nums; i > 0; i--) {
            for (int j = 1; j <= nums; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        int nummerA = 60;
        int nummerB = 24;

        for (int i = nummerA; i >= nummerB; i--) {
            System.out.println(i);
        }

        int count = 1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.printf("%2d ", count);
                count++;
            }
            System.out.println();
        }



    }
}