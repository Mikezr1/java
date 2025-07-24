package Challenges.challenge21;
//nested functies= recursie
public class Main {
    public static void main(String[] args) {
//        sayHi(); //voorbeeld 1
        System.out.println("Totaal:" );
        int result = berekening(5, 10); //voorbeeld 2 met halt en telt alle getallen op van start tot end
        System.out.println(result);
        System.out.println("Aftellen:" );
        aftellen2(10); // we starten met 10 opdracht playersguide
    }

    //say hi! to many times
    public static String sayHi() {
        System.out.println("Hi!");
        return sayHi();
    }

    public static int berekening(int start, int end) {
    if (end > start) {
        return end + berekening(start, end - 1);
            } else {
                return end;
            }
        }

    public static void aftellen2(int x) {
        if (x <= 0) {
            return; // stop bij 0
        }
        System.out.println(x);   // print huidige getal
        aftellen2(x - 1);         // roep jezelf aan met 1 lager
    }
//    berekening(5, 5) = 5
//    berekening(5, 6) = 6 + 5 = 11
//    berekening(5, 7) = 7 + 11 = 18
//    berekening(5, 8) = 8 + 18 = 26
//    berekening(5, 9) = 9 + 26 = 35
//    berekening(5, 10) = 10 + 35 = 45

}


