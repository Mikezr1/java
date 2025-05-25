package Lessen.les5H4.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Dit print 1 int uit, niet alle ints...
//        System.out.println(NUM_ITEMS);

//Getal moet even zijn en positief
//        if (NUM_ITEMS % 2 == 0 && NUM_ITEMS > 0) {
//            // Dit print alle ingevoerde ints uit
//            System.out.println(scan.nextInt());
//        } else{
//            System.out.println("Mag niet");
//            System.out.println("Opnieuw; Wat is het aantal items in de array? (Geen negatief getal aub)?");
//            int NUM_ITEMS = scan.nextInt();
//        }

public class PrintArray {
    public static void main(String[] args) {
        //input vragen
        System.out.println("Wat is het aantal items in de array? (Geen negatief getal aub)?");
        Scanner scan = new Scanner(System.in);

        int NUM_ITEMS = scan.nextInt();
        scan.nextLine();

        //1 input valideren: Door blijven vragen totdat het antwoord wel positief is en even
        do {
            System.out.print("Wat is het aantal items in de array? (Bedenk een positief even getal aub): ");
            NUM_ITEMS = scan.nextInt();

            if (NUM_ITEMS <= 0 || NUM_ITEMS % 2 != 0) {
                System.out.println("Mag niet. Probeer opnieuw.");
            }
        } while (NUM_ITEMS <= 0 || NUM_ITEMS % 2 != 0);

        //2 Waarde vragen met spaties
        System.out.print("Voer de waarde van alle items in (gescheiden door spatie): ");

        // Wat voert de gebruiker in? (een string aan getallen) (je kan de tweede invoer met een tweede scanner inladen)
        String input = scan.nextLine();


        //--------------



        //3 datatype parsen
        String[] typedNumbers = input.split(" ");

        if (typedNumbers.length != NUM_ITEMS) {
            System.out.println("Incorrecte hoeveelheid nummers ingevuld");
            return;
        }
        int[] nums = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++) {
            nums[i] = Integer.parseInt(typedNumbers[i]);
        }

        // uitkomst afdrukken
        System.out.println(Arrays.toString(nums));

        // Bonus opdracht
        StringBuilder sb = new StringBuilder();

//        for (int num : nums) {
//            for (int i = 0; i < num; i++) {
//                sb.append(specialChar);
//            }
//            sb.append("(" + num + ")\n");
//        }

        System.out.println(sb.toString());

        //  string omzetten naar verzameling en dan ieder vakje naar een int
        //integer klasse



    }
}
