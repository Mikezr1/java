package Lessen.les5H4.stringMethods.PositionOfChars;

//substring -> kijkt naar de chars tot een bepaald aantal en dus niet tot en met.

public class substring {
    public static void main(String[] args) {
        String examen = "Oracle";

        String sub = examen.substring(2);

        System.out.println(sub); // acle

        //het limiet van de string is 4
        String resultaat = examen.substring(2, 4);

        System.out.println(resultaat); // ?
    }
}
