package Lessen.H5Flowcontrol.BreakAndContinue;
//stopt de iteratie


public class Break {
    public static void main(String[] args) {
        int i;
        String str = "Hallo Hi Hallo";
        for(i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'l')
                break; }
        System.out.println("Eerste l gevonden op positie: " + i);
    }
}
