package Lessen.les5H4.Arrays.ArrayListAccesMethods;

import java.util.List;

public class get {
    public static void main(String[] args) {
        // Lijst ophalen uit andere klasse
        List<String> auto = connectedArrayList.haalAutoOp();

        // get(index) gebruiken
        System.out.println("Element op index 1: " + auto.get(1)); // Output: Corvette

        // Laat alle auto's zien
        System.out.println("Dit zijn al onze auto's in onze showroom:");
        for (int i = 0; i < auto.toArray().length; i++) {
            System.out.println(auto.get(i));
        }
    }
}