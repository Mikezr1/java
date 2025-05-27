package Lessen.les5H4.Arrays.ArrayListAccesMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class connectedArrayList {

        //method voor het beschikbaar stellen van een array list, niet bedoeld als database, meer om te testen.
        public static List<String> haalAutoOp() {
        List<String> testLijst = new ArrayList<>(Arrays.asList(
                "Mustang",
                "Corvette",
                "Ferrari"
        ));

        //inhoud toeveogen aan deze array list
        testLijst.add("Mercedes");

        //return de lijst
        return testLijst;
    }
}