package Lessen.les5H4StringsAndArrays.stringMethods.others;

public class endsWith {
    public static void main(String[] args) {
        String letters = "ABCAB";
        System.out.println(letters.startsWith("AB")); // true
        System.out.println(letters.startsWith("a")); // false
        System.out.println(letters.startsWith("A", 3)); // ?
        System.out.println(letters.endsWith("CAB")); // ?
        System.out.println(letters.endsWith("B")); // ?
        System.out.println(letters.endsWith("b")); // ?
    }
}
