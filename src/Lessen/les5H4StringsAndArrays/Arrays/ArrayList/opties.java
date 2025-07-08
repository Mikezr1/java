package Lessen.les5H4StringsAndArrays.Arrays.ArrayList;

import java.util.ArrayList;

public class opties {
    public static void main(String[] args) {
//        lijst met wrapper classes integer + identifier
        ArrayList<Integer> nummers = new ArrayList();
        int[] numbers2 = new int[10];

//        in de array de waarde tien gestopt, numbers[0] = 10 werkt niet.
        numbers2[0] = 10;

//        Autoboxing java snapt zelf dat de 10 in het doosje moet...
//        numbers.add(10);

//        iets weghalen
//        for (int i = 0; i < ; i++) {
//            System.out.println(numbers2.getClass());
//        }
//      lengte=  numbers.length niet .size wel

        for (int num : numbers2) {
            System.out.println(num);
        }

//        auto inboxing

//        zit hij er niet in, dan krijg je -1

//        leeggooien = te hoog getal printen


    }
}
