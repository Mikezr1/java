package Lessen.les1.voorbeeld1;

import java.util.Scanner;

//teksten
//    Caesar's Code is een van de eenvoudigste encryptietechnieken. Elke letter in de leesbare
//    tekst wordt cyclisch vervangen door een letter op een vast aantal posities (n) in het alfabet.
//    In deze oefening kiezen we n=3. Dat wil zeggen, 'A' wordt vervangen door 'D', 'B' door 'E', 'C'
//    door 'F', ..., 'X' door 'A', ..., 'Z' door ' C'.
//    Schrijf een programma met de naam CaesarCode om de code van Caesar te coderen. Het
//    programma zal de gebruiker vragen om een leesbare tekenreeks die alleen uit hoofdletters
//            bestaat; bereken de cijfertekst; en druk de cijfertekst in hoofdletters af.

public class CaesarsCodex {
    public static void main(String[] args) {
        System.out.println("Welke woorden wil je encrypten?");

        String code = new String("ZORO");
        //een voor een chars lezen
        // for -> hoeveel letters zijn er, tot aan de laatste letter, elke iteratie een letter verder.

        int encryptionSize = 3;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i); //declaratie, als je de char verandert naar int dan zie je de ASCI getallen voor de letters.

            if ( ch >= 'A' && ch <= 'Z') {


                // Dit stuk begrijp ik nog niet helemaal -> waarom (char) ('A')?
                int positieInAlfabet = ch - 'A';  // Z - A = 25
                int nieuwePositie = (positieInAlfabet + encryptionSize) % 26; // (25 + 3) % 26 = 2
                char nieuweLetter = (char) ('A' + nieuwePositie); // A + 2 = 'C'
                System.out.print(ch + " ");

                // Laat hem m niet verder gaan dan 26 letters, want bij Zoro gaat de Z een ] worden. Hij moet na de z weer naar de a springen.
                // Z is ascii 93. dus hij moet na 93 naar 68 (A) dit verschil is 25 getallen, je wil dat hij dus na 25 getallen opnieuw begint.
            }
            // Met een modulo geef je aan dat je na een bepaald asci getal weer wil beginnen met een nieuwe reeks bij nummer 65 (A)
            // 'Z'(93) + 3 → 'C' (68)
            else {
                ch += 0; //shorthand operator -> ch = ch + 3 //te lang // en dit is een (re) assignment
                System.out.print(ch + " ");
            }

            // %

            // > 93

        }

//        char i = ;
//        System.out.println(i);


//        ch += encryptionSize; //shorthand operator -> ch = ch + 3 //te lang // en dit is een (re) assignment
        // computer begint bij tellen bij nul.
//        charat -> hiermee pak je elke letter als char los uit het woord.
        int n = 3;

        //elke letter drie letters op het alfabet verder
        Scanner encryptie= new Scanner(System.in);  // Create a Scanner object
//        String woord = encryptie.nextline();

    }

}