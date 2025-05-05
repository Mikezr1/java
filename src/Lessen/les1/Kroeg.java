package Lessen.les1;

//7// vergelijking -> if statemment
//16// De knikker kan in een baan vallen en de andere banen krijgen niks
//20// Check de volgorde anders mag een 200 jarige de kroeg in, dus afvangen.

public class Kroeg {
    public static void main(String[] args) {
        int leeftijd = 16;

        if (leeftijd < 18) {
            System.out.println("je mag niet naar binnen");
        }
        else if (leeftijd < 65) {
            System.out.println("je mag naar binnen");
        }
        else  {
            System.out.println("Je bent te oud, ga naar een bejaardenhuis.");
        }
    }
}
