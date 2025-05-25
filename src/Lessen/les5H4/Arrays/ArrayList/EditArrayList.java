package Lessen.les5H4.Arrays.ArrayList;

import java.util.ArrayList;

public class EditArrayList {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>();
        lijst.add("Hallo");
        lijst.add("Wereld");
        lijst.set(1, "Wereld!!!!!"); // vervangt de waarde op index 1

        // Afdrukken om het effect te zien
        for (String woord : lijst) {
            System.out.println(woord);
        }
    }
}
