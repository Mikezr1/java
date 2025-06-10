package Lessen.H5.Nesting;
/*
Ook for-loops kan je nesten.
Een voorbeeld hiervan is bijvoorbeeld werken met een klok of multidimensionele array.
Dan heb je te maken met minuten en uren.
Beide krijgen dan hun eigen for-loop:
*/
public class NestedForLoop {
    public static void main(String[] args) {
        for (int uur = 1; uur <= 2; uur++) {
            for (int min = 1; min <= 60; min++) {
                System.out.println(uur + ":" + min);
            }
        }
    }
}
