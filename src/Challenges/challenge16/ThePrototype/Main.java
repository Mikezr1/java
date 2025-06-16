package Challenges.challenge16.ThePrototype;

//Good practise for OOP
//Dit is je startpunt. Hier start je het spel.

public class Main {
    public static void main(String[] args) {
        GuessingGame game1 = new GuessingGame();

//    methode aanroepen voor daadwerkelijk aangemaakte object/instantie= object variabele naam.methode();
        game1.setTargetNumber();
        game1.clearScreen();
        game1.gameLoop();
    }
}
