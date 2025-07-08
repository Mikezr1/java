package Lessen.les5H4StringsAndArrays.stringMethods.ModifyString;

public class trim {
    public static void main(String[] args) {
        String stringMetSpaties = " AC CB ";

        //print
        System.out.print(":");//doet niks
        System.out.print(stringMetSpaties);
        System.out.print(":"); // : AB CB : //doet niks
        System.out.print(":");//doet niks
        System.out.print(stringMetSpaties.trim());
    }
}
