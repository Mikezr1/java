package Lessen.H5.BreakAndContinue;
//stopt de


public class Continue {
    public static void main(String[] args) {
        int aantalHs = 0;
        String str = "Hallo Hi Hallo";
        for(char karakter : str.toCharArray()) {
            if (karakter != 'H')
                continue;
            // we slaan dit deel over als het karakter geen H is
            aantalHs = aantalHs + 1;
            System.out.println("H gevonden!");
        }
        System.out.println("Aantal gevonden Hs: " + aantalHs);
    }
}
