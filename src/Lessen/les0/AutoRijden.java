package Lessen.les0;

//        if (heeftRijbewijs == false) {

public class AutoRijden {
    public static void main(String[] args) {
        int leeftijd = 18;
        boolean heeftRijbewijs = true;

        if (!heeftRijbewijs) {
            System.out.println("Je mag niet autorijden");
        }
        else if (leeftijd >= 90) {
            System.out.println("Wij raden het af nog de weg op te gaan");
        }
        else if (leeftijd >= 18) {
            System.out.println("Je mag zelfstandig autorijden");
        }
        else {
            System.out.println("Je mag autorijden met begeleiding");
        }

    }

}
