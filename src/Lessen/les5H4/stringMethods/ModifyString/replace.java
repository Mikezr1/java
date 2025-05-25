package Lessen.les5H4.stringMethods.ModifyString;

public class replace {
    public static void main(String[] args) {
        String letters = "ABCAB";
        System.out.println(letters.replace('B', 'b')); // AbCAb
        System.out.println(letters.replace("CA", "12")); // ?
    }
}
