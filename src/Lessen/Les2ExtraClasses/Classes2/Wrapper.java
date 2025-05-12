package Lessen.Les2ExtraClasses.Classes2;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner invoerGetal = new Scanner(System.in);

        System.out.println("Welk heel en positief getal wil je hebben?");

        int getal = invoerGetal.nextInt();

        System.out.println("Getal: " + getal);  // Output user input

        int sum = 0;

    //als niet heel min is en heel getal is. kan het getal gedeeld worden door 2 zegmaar? is ie nul dan is ie even.
        for (int i = 1 ; i <= getal ; i++) { //zolang i kleiner is dan getal
            if (i % 2 == 0){
                sum += i;
//                System.out.println(sum);

            } else {
              System.out.println(i + " is ongelijk");

            }

        }

        System.out.println(sum);
    }
    // Tel vanaf 1 alle even getallen op tot het getal dat is ingegeven.
}