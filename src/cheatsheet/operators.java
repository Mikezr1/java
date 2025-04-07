package cheatsheet;

public class operators {
    public static void main(String[] args) {
        // 🔹 Unary Operators - Werken op slechts 1 waarde
        int a = 5;
        System.out.println("Unary + : " + (+a)); // positief maken
        System.out.println("Unary - : " + (-a)); // negatief maken
        System.out.println("Pre-increment ++a : " + (++a)); // verhoogt a met 1 vóór gebruik (a wordt 6)
        System.out.println("Pre-decrement --a : " + (--a)); // verlaagt a met 1 vóór gebruik (a wordt 5)
        boolean bool = true;
        System.out.println("Logical NOT !bool : " + (!bool)); // omkeren van boolean (true wordt false)
        System.out.println("Bitwise complement ~a : " + (~a)); // bits omkeren (bijv. 5 wordt -6)

        // 🔹 Arithmetic Operators - Rekenkundige bewerkingen
        System.out.println("Addition 5 + 3 = " + (5 + 3));
        System.out.println("Subtraction 5 - 3 = " + (5 - 3));
        System.out.println("Multiplication 5 * 3 = " + (5 * 3));
        System.out.println("Division 5 / 2 = " + (5 / 2)); // let op: geheel getal deling
        System.out.println("Modulo 5 % 2 = " + (5 % 2)); // rest van de deling

        // 🔹 Relational / Comparison Operators - Vergelijkingen maken
        System.out.println("5 == 5: " + (5 == 5)); // gelijk aan
        System.out.println("5 != 3: " + (5 != 3)); // niet gelijk aan
        System.out.println("5 > 3: " + (5 > 3));   // groter dan
        System.out.println("5 < 3: " + (5 < 3));   // kleiner dan
        System.out.println("5 >= 5: " + (5 >= 5)); // groter of gelijk aan
        System.out.println("3 <= 5: " + (3 <= 5)); // kleiner of gelijk aan

        // 🔹 Logical Operators - Werken met boolean waarden (true/false)
        System.out.println("true && true: " + (true && true)); // EN
        System.out.println("false || true: " + (false || true)); // OF
        System.out.println("!false: " + (!false)); // NIET

        // 🔹 Assignment Operators - Toewijzing van waardes aan variabelen
        int x = 10;
        System.out.println("x = 10 -> " + x);
        x += 5; // x = x + 5
        System.out.println("x += 5 -> " + x);
        x -= 2; // x = x - 2
        System.out.println("x -= 2 -> " + x);
        x *= 2; // x = x * 2
        System.out.println("x *= 2 -> " + x);
        x /= 2; // x = x / 2
        System.out.println("x /= 2 -> " + x);
        x %= 3; // x = x % 3
        System.out.println("x %= 3 -> " + x);

        // 🔹 Bitwise Operators - Werken met binaire getallen (bit-per-bit)
        System.out.println("5 & 3 = " + (5 & 3)); // AND op bits
        System.out.println("5 | 3 = " + (5 | 3)); // OR op bits
        System.out.println("5 ^ 3 = " + (5 ^ 3)); // XOR op bits
        System.out.println("5 << 1 = " + (5 << 1)); // shift bits naar links (vermenigvuldigt met 2)
        System.out.println("5 >> 1 = " + (5 >> 1)); // shift bits naar rechts (deelt door 2)

        // 🔹 Ternary Operator - Verkorte if-else in 1 regel
        int max = (5 > 3) ? 5 : 3; // als 5 > 3 dan 5, anders 3
        System.out.println("(5 > 3) ? 5 : 3 -> " + max);
        System.out.println("(5 < 3) ? 'Ja' : 'Nee' -> " + ((5 < 3) ? "Ja" : "Nee"));

        // 🔹 instanceof Operator - Check of object tot een klasse behoort
        String text = "Hello";
        System.out.println("text instanceof String: " + (text instanceof String)); // true als text een String is
    }
}
