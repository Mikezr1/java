package Lessen.les4H5.MethodsOefening;

/*
Schrijf een methode genaamd exponent(int base, int exp)
die een int waarde teruggeeft tot de macht van exp.

Geef de basis: 3
Geef de exponent: 4
3 tot de macht 4 is: 81
*/

public class Exponent {
    //1 main methode
    public static void main(String[] args) {

        //2 waarde vastleggen
        int base = 3;
        int exp = 4;

        //printen van de uitkomst
        System.out.println(exponent(3,4) + " met for math pow");
        System.out.println(exponent( base, exp) + " met for loop");

    }

    //3 eerste optie: methode met een exponent teruggeven via Math.pow
    public static int exponent (int base, int exp){

        //4 gebruik met een math pow method een resultaat variabele die de expotonetieel waarde kan berekenen met de macht 4
        double resultaat = Math.pow(base,exp);

        //5 waarde teruggeven - return value
        return (int) resultaat;

    }

    //3B tweede optie: een methode met een forloop
    public static int exponent2 (int base, int exp){

        int resultaat2 = 1;

        for (int i = 0; i < exp; i++) {
            resultaat2 *= base;
        }

        return (int) resultaat2;
    }

}