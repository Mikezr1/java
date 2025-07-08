package Lessen.H5Flowcontrol.Oefeningen;

//in ieder vakje van de lijst komt een nieuw getal

public class WhileDoWhile {
    public static void main(String[] args) {
        int[] list = new int [5];

//        for (int i = 0; i < 5; i++) {
//            list [i] = i + 2;
//            System.out.println(i);
//        }

        int i = 0;

        while (i < 5) {
            list [i] = i + 2;
            i++;
            System.out.println(i);
        }
    }
}
