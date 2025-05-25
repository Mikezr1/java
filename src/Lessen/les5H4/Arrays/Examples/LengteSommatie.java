package Lessen.les5H4.Arrays.Examples;

public class LengteSommatie {
    public static void main(String[] args) {
        int[] getallen = {10,20,30,40,50,60,71,80,90,91};
        int som = 0;
        for(int i = 0; i < getallen.length; i++) {
            som = som + getallen[i];
        }
        System.out.println(getallen.length); // 10
        System.out.println(som); // 542
    }
}
