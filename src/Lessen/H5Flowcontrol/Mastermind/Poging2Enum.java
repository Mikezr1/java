package Lessen.H5Flowcontrol.Mastermind;

import java.util.ArrayList;
import java.util.Random;

public class Poging2Enum {
    public static void main(String[] args) {
//      random woord inladen uit methode
        ArrayList<Colors> codeColors = randomColors();

        for (int i = 0; i < codeColors.size(); i++) {
            System.out.println(codeColors.get(i));
        }

        String guess = "BLACK, WHITE, BLUE, RED";

        playersGuess();//aanroepen, ga naar de plek waar deze naam is gedefineerd en begin daar () alles tussen de haakjes neem je mee. Je begint met uitvoeren met de waardes die meeneemt.
        checkPosition(codeColors); //argument meegeven (dit is een variabele)

    }



    //random woord reeks maken
    public static ArrayList<Colors> randomColors(){ //de array is al het type

        ArrayList<Colors> randomColorArray = new ArrayList<>() ; //array updaten als er een nieuer waarde is

        // voor elke Color in Colors genaamd jojo
        for (int i = 0; i < 4; i++) {
            //random woord kiezen uit de vijf woorden
            Random random = new Random(); //constructor is een soort methode, die een nieuw random object returned

            Colors[] colorArray = Colors.values();// [] dit is een lijst van kleuren, onder de naam colorArray
            int randomIndex = random.nextInt(colorArray.length); //hoeveel array items (dynamisch)
            Colors randomColor = colorArray[randomIndex]; //vraag
//            String randomColor = random

            randomColorArray.add(randomColor);
        }

        return randomColorArray;

//        String input = "BLACK, BLUE, GREEN, RED";


    }

    /*speler vult een poging in met vier kleuren*/
    public static void playersGuess() {
        System.out.println("U mag een van deze kleuren (Black, Yellow, Red, Green, Blue) gebruiken bij uw pogingen");
//        Scanner scanForGuess = new Scanner(System.in);
        String scanForGuess = "black yellow red green";
//        String contentGuess = String.format(scanForGuess.nextLine().toUpperCase());
        String contentGuess = String.format(scanForGuess.toUpperCase());

        // spatie, komma en uppercase van maken
        String contentGuessRemastered = contentGuess.replace(" ", ",");

        //maak een array met deze poging guessColors ->



        System.out.println(contentGuessRemastered);

    }


    /* check op juiste plek per vier woorden controleren*/
    public static void checkPosition(ArrayList <Colors> codeColors) {
        for (int i = 0; i < codeColors.size(); i++) {
//            if (codeColors.get(i).equals(contentGuess.get(i))) {
//                System.out.println("Op positie" + i + " is het goed:" + guessColors.get(i));
//            }

            System.out.println(i);
        }
    }

//
    //check op juiste kleur

}
