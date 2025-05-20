package Lessen.les4H5.MethodsOefening;
/*Schrijf een boolean methode met de naam isOdd() in
een klasse met de naam OddEvenTest,
die een int als invoer neemt en true retourneert als deze oneven is.*/

//methodes mogen nooit in een andere methode

public class OddEvenTest {
    //1 main hier wordt het programma gestart
    public static void main(String[] args) {
        //3 de invoer
        int input = 3;

        //6 printen van de uitkomst
        System.out.println(isOdd(input));
    }

    //2 een boolean methode met de functienaam isOdd
    public static boolean isOdd(int invoer) {
        //4 argument meegeven met een int (wiskundige if formule)
        boolean result = ((invoer) % 2 == 1);

        //5 return variabele
        return result;

    }

}


