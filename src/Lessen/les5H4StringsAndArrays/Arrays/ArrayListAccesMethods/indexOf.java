package Lessen.les5H4StringsAndArrays.Arrays.ArrayListAccesMethods;

import java.util.List;

public class indexOf {
    public static void main(String[] args) {
        // Laad de arraylist in
        List <String> auto = connectedArrayList.haalAutoOp();

//        Ik wil het index nummer van alle auto's weten
        for (int i = 0; i < auto.toArray().length; i++) {
            System.out.println(auto.indexOf(i));
        }
    }
}
