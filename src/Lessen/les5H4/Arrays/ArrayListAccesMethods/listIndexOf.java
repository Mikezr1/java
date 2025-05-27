package Lessen.les5H4.Arrays.ArrayListAccesMethods;

import java.util.ArrayList;
import java.util.List;

public class listIndexOf {
    public static void main(String[] args) {
        //Lijst inladen
        // List method + data type + variabele naam = (vind je in) Naam van arraylist . (en daarin) method haalAutoop erin.
        List<String> auto = connectedArrayList.haalAutoOp();

        // Van een specifieke auto de indexOf waarde
        System.out.println("De index van een Mustang:" + auto.indexOf("Mustang"));
    }
}
