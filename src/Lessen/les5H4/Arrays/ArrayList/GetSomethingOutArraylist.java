package Lessen.les5H4.Arrays.ArrayList;

import java.util.ArrayList;

public class GetSomethingOutArraylist {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>();
        lijst.add("Hallo");
        lijst.add("Wereld");

        for (String woord : lijst) {
            System.out.println(woord);
        }
    }
}
