package Lessen.Les2ExtraClasses.Classes2;
//              System.out.println((char)(letter + 3));
//            System.out.println((char) (letter + 'A' % 26)); //nu krijg je een getal
//            System.out.println(input.charAt(1)); //waar in Test begint ie met printen
public class WoordenVersleutelen {
    public static void main(String[] args) {
        String input = "ZXRO";
        int caesarShift = 7;
        int numberOfLetters = 26;

        for (int i =0; i< input.length(); i++){

            char letter = input.charAt(i);
            if (letter == 'Z' || letter == 'X'){
//                System.out.println('C');
                    letter -= 26;
            }
            else {
                letter += caesarShift;
//                System.out.println(letter);
            }
            letter += 3;
            System.out.print(letter);

        }
    }
}
