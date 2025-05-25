package Lessen.les5H4.Arrays.ArrayList;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>(); //Let op dit is dus een standaard ArrayList type en niet de class naam!
        lijst.add("Hallo");
        lijst.add("Wereld");
        lijst.add(1, "WELKOM"); // ← dit voegt 'WELKOM' in op index 1

        // Afdrukken om het effect te zien
        for (String woord : lijst) {
            System.out.println(woord);
        }
    }
}