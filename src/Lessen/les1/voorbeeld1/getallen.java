package Lessen.les1.voorbeeld1;

public class getallen {
    public static void main(String[] args) {
        int jaar = 2;
        int maand = 12;
        int week = 1;
        int dag = 1;
        int uur = 60;

        int jaarInMinuten = jaar * 24 * uur * 5 * 52;
        System.out.println("In " + jaar + " jaar zitten " + jaarInMinuten + " minuten.");

        int maandInMinuten = (maand * 24 * uur * 5 * 52) / 12;
        System.out.println("In " + maand + " maand" + "(" + "en" +")" + " zitten " + maandInMinuten + " minuten.");

        int weekInMinuten = week * 24 * uur * 5;
        System.out.println("In " + week + " week" + "(" + "en" +")" + " zitten " + weekInMinuten + " minuten.");

        int dagInMinuten = dag * 24 * 60;
        System.out.println("In " + week + " dag" + "(" + "en" +")" + " zitten " + dagInMinuten + " minuten.");

//        Snellere manier in een keer (zie github)
//        maand += jaar * 12;

//        System.out.println(uur * 60);
    }
}
