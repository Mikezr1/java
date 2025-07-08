package Lessen.les1OOP.voorbeeld1;


public class Snelheid {
    public static void main(String[] args) {
        //afstanden
        int afstandInMeter = 2500;

        //tijd
        int invoerUur = 5;
        int invoerMinuten = 56;
        int invoerSeconden = 23;

        //tip
        int afstandInMile = 1609;
//        int snelheid =

        // afstand per km/uur

//        afstand in meters en de tijd te nemen (uur, minuten en seconden) en
//        geef de snelheid weer in meters per seconden/ kilometer per uur / mijlen per uur ( 1 mijl is 1609 meter)

        double meterPerSeconde = afstandInMeter / invoerSeconden ;
        double kilometerPerUur = (afstandInMeter / 1000.00) / invoerUur ;
        double milePerHour = (afstandInMile / 2500.0) * invoerUur ;

        System.out.println("Uw snelheid in meter/seconden is " + meterPerSeconde + " m/s" );
        System.out.println("Uw snelheid in kilometer/uur is " + kilometerPerUur + " km/u" );
        System.out.println("Uw snelheid in mile per hour is " + milePerHour + " m/h" );

    }
}
