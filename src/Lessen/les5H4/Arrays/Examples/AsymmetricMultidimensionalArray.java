package Lessen.les5H4.Arrays.Examples;

public class AsymmetricMultidimensionalArray {
    public static void main(String[] args) {
        String multiStrArr[][] = new String[][] {
                {"A", "B"},                 // index 0 → lengte 2
                null,                       // index 1 → geen array (null)
                {"Jan", "Feb", "Mar"},      // index 2 → lengte 3
        };

        //Andere manier om het uit te lezen (chatgpt)
        System.out.println("In tekst:");
        for (int i = 0; i < multiStrArr.length; i++) {
            if (multiStrArr[i] != null) {
                for (int j = 0; j < multiStrArr[i].length; j++) {
                    System.out.println("multiStrArr[" + i + "][" + j + "] = " + multiStrArr[i][j]);
                }
            } else {
                System.out.println("multiStrArr[" + i + "] = null");
            }
        }
    }
}


