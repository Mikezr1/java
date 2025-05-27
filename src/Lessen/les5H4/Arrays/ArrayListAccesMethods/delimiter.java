package Lessen.les5H4.Arrays.ArrayListAccesMethods;

import java.util.List;

public class delimiter {
    public static void main(String[] args) {
        String merken = "Mustang,Corvette,Ferarri";
        //haal van elke array item a

        // maak van deze string een lijst met losse array items
        String[] splitMerk = merken.split(",");
        for (String merk : splitMerk) {
            System.out.println(merk);
        }
    }
}
