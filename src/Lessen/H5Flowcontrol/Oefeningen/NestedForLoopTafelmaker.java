package Lessen.H5Flowcontrol.Oefeningen;



public class NestedForLoopTafelmaker {
    public static void main(String[] args) {
        System.out.println("* | 1   2   3   4");

        int start = 0;

        for (int j = 0; j < 10 ; j++) {
            System.out.print(start * 1 + "  " + "0" );
        }
        System.out.println("\n---------------------------------------------------");

        //Naar beneden
        for (int i = 1; i < 10 ; i++) {// maak de eerste rij
            System.out.print(i);//

            //naar rechts
            for (int j = 0; j < 10 ; j++) {
                System.out.print(start + 2 + "  " + start * 2 );
            }
            System.out.println();
        }
    }
}
