package Lessen.les5H4StringsAndArrays.Reverse;

/*
Gegeven een willekeurige string als invoer, reverse deze string:
Abcdef -> fedcba
Bonus: Geef ook aan wanneer een string een palindroom is.
Lepel -> lepel
Palindroom! -> string lepel is van beide kante hetzelfde is dus reverse -> string equals
* */

public class opdracht {
    public static void main(String[] args) {

        String invoer = "Abcdef";
//        Stirng output = "";

        System.out.println(omgekeerd(invoer));

    }

    //Omkeer methode
    public static String omgekeerd(String invoer){
        String omgekeerd = "";

        //index is een index cijfer te lang -> daarom -1 na invoer lengte.
        for (int i = invoer.length() -1; i >= 0; i--) {
            omgekeerd += invoer.charAt(i);
        }

//        for (int i = 0; i < length; i++) {
//            omgekeerd += invoer.charAt(i);
//        }
        return omgekeerd;
    }

    //Stringbuilder
//    public static String omgekeerd(String invoer){
//        StringBuilder builder = new StringBuilder
//    }

//    Palindroom check methode -> buffer equals
//    if (output.equals(input)) {
//        System.out.println("Palingdrome");
//    } else {
//        System.out.println("Geen palindrome");
//    }


}

/*
oplossing
public class Main {
    public static void main(String[] args) {
        String input = "lepela";
        String output = "";
        int length = input.length() ;

        boolean palindrome = true;

        for (int i = 0; i < length; i++) {
            output += input.charAt(length - i - 1);
            System.out.println(input.charAt(length - i - 1));

            if (input.charAt(i) != input.charAt(length - i - 1)) {
                palindrome = false;
            }

        }

        if (palindrome) {
            System.out.println("PALINGDROME");
        } else {
            System.out.println("GEEN PALINGDROME");
        }


        if (output.equals(input)) {
            System.out.println("PALINGDROME");
        } else {
            System.out.println("GEEN PALINGDROME");
        }

//        StringBuilder builder = new StringBuilder(input);
//        builder.reverse();
//        String result = builder.toString();

//        System.out.println(result);

        System.out.println(output);

    }
}

*/