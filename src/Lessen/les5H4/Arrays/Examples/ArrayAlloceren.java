package Lessen.les5H4.Arrays.Examples;

public class ArrayAlloceren {
    public static void main(String[] args) {

        //Declareren en direct alloceren, initalisatie met de standaardwaarde:
        int[] getallen1 = new int[10];

        //        2. Declareren en direct alloceren, zelf initialiseren:
        int[] getallen2 = {10,20,30,40,50,60,71,80,90,91};

        //        3. Declareren en later alloceren, initialisatie met de standaardwaarde:
        int[] getallen3;
        getallen3 = new int[10];

        //        4. Declareren en later alloceren, zelf initialiseren:
        int[] getallen4;
        getallen4 = new int[]
                {10,20,30,40,50,60,71,80,90,91};
    }
}
