package Challenges.challenge18_ArraysAndMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Replicator {

public static String userInput () {
//Ask the user for five numbers and put them in the array.
    System.out.println("Insert five numbers please");
    Scanner scan = new Scanner(System.in);
    String inputOfNumbers = scan.nextLine();
    return inputOfNumbers;
}

//dit is met een vaste limiet handig van 5. wil je vrijheid in data dan is een arraylist beter.
public static int[] array6 () {

    String input = userInput(); // input uit de input methode hier staat de methode en de aanroeping daarvan naar een string.

    String[] looseArrays = input.split(" ");// omzetten naar een array

    //omzetting naar getallen
    int[] numbers = new int[looseArrays.length];

    //alle letters in de array
    for (int i = 0; i < looseArrays.length; i++) {
        numbers[i] = Integer.parseInt(looseArrays[i]);
    }

    System.out.println("Original: "+ Arrays.toString(numbers));

    return numbers;
}

public static void duplicateArray (int[] numbers) {
    int[] replicaArray = new int[5];
    for (int i = 0; i < replicaArray.length; i++) {
        replicaArray[i] = numbers[i];
    }
    System.out.println("Replica: " + Arrays.toString(replicaArray));

}





}
