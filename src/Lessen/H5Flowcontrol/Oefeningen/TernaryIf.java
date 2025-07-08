package Lessen.H5Flowcontrol.Oefeningen;

/*Schrijf een methode genaamd fibonacci(int n) die gebruikmaakt van recursie en een ternary if
De methode mag slechts één regel lang zijn.

recursie
een funcite die zichzelf aanroept, een loopje die zichzelf aanroept.

ternary if

*/

public class TernaryIf {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
//        return (n > 0) ? n + fibonacci(n + 1) : return fibonacci; }
            return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}

