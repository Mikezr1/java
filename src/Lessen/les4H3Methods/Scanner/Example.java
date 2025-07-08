package Lessen.les4H3Methods.Scanner;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); //splits elke keer als het woord “fish” voorkomt, met eventueel spaties ervoor of erna.
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}

