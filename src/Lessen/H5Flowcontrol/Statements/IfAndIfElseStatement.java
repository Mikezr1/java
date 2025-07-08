package Lessen.H5Flowcontrol.Statements;

public class IfAndIfElseStatement {
    public static void main(String[] args) {
        int radius = 6;
        double oppervlakte = 20;

        //1. If -> Deze code wordt uitgevoerd als de expressie van de if-bewerking waar is
        if (radius >= 5) {
            oppervlakte = Math.PI * radius * radius;
            System.out.println("De oppervlakte van de cirkel: " + oppervlakte);
        }

        //2. If else ->  uitgevoerd als bewering true oplevert en indien onwaar dan bij false het andere doen
        if (radius <= 5) {
            oppervlakte = Math.PI * radius * radius;
            System.out.println("De oppervlakte van de cirkel: " + oppervlakte);
        }
        else {
            System.out.println("De oppervlakte van de cirkel is ongeldig");
        }
    }
}
