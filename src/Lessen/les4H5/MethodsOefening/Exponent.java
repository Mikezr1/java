package Lessen.les4H5.MethodsOefening;
//return types

// dit staat nu in de system print
//        int base = 3;
//        int exp = 4;
//        double resultaat = 0;

public class Exponent {
    public static void main(String[] args) {
        System.out.println(exponent(4,3));
    }


    public static int exponent (int base, int exp){
        //exponent terug geven

        //expotonetieel is x4
        double resultaat = Math.pow(base,exp);

        //waarde teruggeven - return value
        return (int) resultaat;

    }

}


//        //methode aanmaken
//        public static int exponent (int base, int exp) {
//
//        }