package Lessen.les0Classes;

//        // datatype -> int, een geheel getal
// variabele naam -> leeftijd
// waarde -> 18

//        System.out.println(leeftijd);
//        leeftijd = 32;
//        System.out.println(leeftijd);
//
//        char l = '42';
//        //asci tabel uitkomst daarom mag het twee nummers zijn> je krijgt een character * ipv 42 als cijfer.
//        System.out.println(l);

//        int leeftijd = 18;
//        leeftijd = 18 + 1;
//        System.out.println("leeftijd");
//
//        leeftijd = 18 - 1;
//        System.out.println("leeftijd");
//
//        leeftijd = 18 / 2;
//        System.out.println("leeftijd");
//
//        leeftijd = 18 * 3;
//        System.out.println("leeftijd");
//
//        leeftijd = 18 % 2;
//        System.out.println("leeftijd");
//        // modulo / restwaarde -> delen door 2, net zo lang tot dat er een komma getal overblijft.

// variabele is altijd nodig!
//    leeftijd = 20;

// == -> is gelijk aan
//!= -> is niet gelijk
// <= -> is kleiner of gelijk aan



public class Leeftijd {

    public static void main(String[] args) {

        int leeftijd = 19;

        boolean isAge18plus = leeftijd >= 18;
        System.out.println("Is this person is 18 years old or older? " + isAge18plus);

        int leeftijdB = 16;
        boolean isAge18minus= leeftijdB <= 18;
        System.out.println("Is this person is younger than 18 years? " + isAge18minus);

        int leeftijdC = 17;
        boolean isAgebetween18and16 = leeftijdC >= 16 && leeftijdC <= 18;
        System.out.println("Is this person between 16 and 18 years old?" + isAgebetween18and16);
    }
}
