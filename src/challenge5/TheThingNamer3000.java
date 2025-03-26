package challenge5;

import java.util.Scanner;

// TAGS block-comments, line-comments, Scanner, Scanner.next(), String, string-concatenation, System.in, System.out.println()

/* DESCRIPTION
// From RB Whitaker's "C# Player's Guide" - adjusted to Java

The Thing Namer 3000
As you walk through the city of Commenton, admiring its forward-slash-based
architectural buildings, a young man approaches you in a panic. “I dropped my Thing
Namer 3000 and broke it. I think it’s mostly working, but all my variable names got
reset! I don’t understand what they do!” He shows you the following program:
System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
“You gotta help me figure it out!”
Objectives:
- Rebuild the program above on your computer.
- Add comments near each of the four variables that describe what they store. You must use at least one of each comment type (// and /* ).
- Find the bug in the text displayed and fix it.
- Answer this question: Aside from comments, what else could you do to make this code more understandable?

Bugs fixed:
1.Scanner cannot be resolved to a type. Added import java.util.Scanner; at line 3.
2.Resource leak: 'input' is never closed. Added input.close(); at line 47.
3.on line 45 there is an double 'of' after the string a. I deleted the 'of' in 'of doom' on line 43
4.fixed the variabele names to clearly readable names.
 */

public class TheThingNamer3000 {
    public static void main(String[] args) {
    System.out.println("What kind of thing are we talking about?"); // This is a question
    Scanner input = new Scanner(System.in);//Create a scanner object to enter the answer for question 1
    String subject = input.next(); //This is the first input value from the scanner
    System.out.println("How would you describe it? Big? Azure? Tattered?");
    String description = input.next(); //This is the second input value from the scanner
    String doom = "Doom";//This is a string and third value but already defined
    String year = "3000";/*This is an integer and fourth value but already defined */
    System.out.println("The " + description + " " + subject + " of " + doom + " " + year + "!");

    input.close();
}
}
