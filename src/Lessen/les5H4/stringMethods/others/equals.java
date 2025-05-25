package Lessen.les5H4.stringMethods.others;

public class equals {
    public static void main(String[] args) {
        String tekst = "Hallo Wereld Hallo Wereld";
        String tekst2 = "Hallo Wereld";
        if(tekst.equals(tekst2 + " " + tekst2)) {
            System.out.println("Gelijk!");
        } else {
            System.out.println("Ongelijk!");
        }
// Output: ?
    }
}
