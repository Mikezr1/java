package challenge6;

/* Objectives:
1. Build a program with a variable of all eight primitive Java types (as well as the ‘text’ type).
2. Assign each of them a value using a literal of the correct type.
3. Use System.out.println to display the contents of each variable.
*/

public class TheVariableShop {
    public static void main(String[] args) {
        byte myFirstByte = 4;
        char myFirstChar = 'M';
        int myFirstInt  = 17_867_200;
        long myFirstLong = 9_223_372_036_854L;
        short myFirstShort = 32;
        float myFirstFloat = 183.75F;
        boolean myFirstBoolean = true;
        double myFirstDouble = 123.33;
    
    
    //Print out all variables
    System.out.println("My family consists of " + myFirstByte + " people.");
    System.out.println("The first letter of my name is an " + myFirstChar + ".");
    System.out.println("The amount of people living in the Netherlands " + myFirstInt + ".");
    System.out.println("The biggest number i have every seen and its called a long in Java docs " + myFirstLong + ".");
    System.out.println("The opposite side of long is short, this an example of a short number " + myFirstShort + ".");
    System.out.println("This a float, this is a number with up to 7 decimal digits " + myFirstFloat + ".");
    System.out.println("A Boolean is simple, its true or false. Is it true that you like cars?" + " that's " + myFirstBoolean + ".");
    System.out.println("A double is a number with up to 16 decimal digits. This an example: " + myFirstDouble + ".");
    }
    
}
