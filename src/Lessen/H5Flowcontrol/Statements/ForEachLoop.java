package Lessen.H5Flowcontrol.Statements;

/*
De enhanced for-loop (for-each-loop) biedt enkele voordelen ten opzichte van de reguliere for-loop.
Met behulp van een foreach loop kun je over alle elementen uit een array itereren:
 */

public class ForEachLoop {
    public static void main(String[] args) {

//        Uitleg
//        for(type naam : lijst) {
            // het element staat nu toegankelijk via de variabele "naam"
//        }

        //Alle waarde laten zien
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //Ter vergelijking -> een losse array inladen werkt zo
        String[] cars2 = {"Mclaren", "Porsche", "Ferrari", "Audi"};
        System.out.println(cars2[0]);

    }
}
