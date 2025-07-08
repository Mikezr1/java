//package Challenges.challenge18;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ReplicatorArraylist {
//    public static void array7() {
//        // input ophalen uit userinput methode
//        String inputOutOfScanner = userInput();
//
//        // input splitsen op spatie
//        String[] individualArrays = inputOutOfScanner.split(" ");
//
//        // nieuwe ArrayList aanmaken
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        // vullen van ArrayList met integers
//        for (String s : individualArrays) {
//            numbers.add(Integer.parseInt(s));
//        }
//
//        // afdrukken
//        System.out.println(numbers);
//    }
//
//    public static String userInput() {
//        System.out.println("Insert numbers (separated by spaces):");
//        Scanner scan = new Scanner(System.in);
//        String inputOfNumbers = scan.nextLine();
//        return inputOfNumbers;
//    }
//}
//
//
