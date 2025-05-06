package Challenges.challenge7;

/*
Objectives:
1. Modify your Variable Shop program to assign a new, different literal value to each of the 9 original
variables. Do not declare any additional variables.
2. Use System.out.println to display the updated contents of each variable.
*/

public class TheVariableShopReturns {
    public static void main(String[] args) {
        byte myFirstByte = 6;
        char myFirstChar = 'M';
        int myFirstInt  = 18_867_200;
        long myFirstLong = 8_223_372_036_854L;
        short myFirstShort = 44;
        float myFirstFloat = 182.75F;
        boolean myFirstBoolean = false;
        double myFirstDouble = 122.11;
    
    
    
    //Print out all variables
    System.out.println("My family consists of " + myFirstByte + " people.");
    System.out.println("The first letter of my name is an " + myFirstChar + ".");
    System.out.println("The amount of people living in the Netherlands " + myFirstInt + ".");
    System.out.println("The biggest number i have every seen and its called a long in Java docs " + myFirstLong + ".");
    System.out.println("The opposite side of long is short, this an example of a short number " + myFirstShort + ".");
    System.out.println("This a float, this is a number with up to 7 decimal digits " + myFirstFloat + ".");
    System.out.println("A Boolean is simple, its true or false. Is it true that you like cars?" + " That's " + myFirstBoolean + ".");
    System.out.println("A double is a number with up to 16 decimal digits. This an example: " + myFirstDouble + ".");
    }
}
