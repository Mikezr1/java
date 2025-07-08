package Lessen.les4H3Methods.Opdracht;

public class Main {
    public static void main(String[] args) {

        //Objecten oproepen/aanroepen
        Engine e1 = new Engine(1200, 4, 120,"Toyota", EngineType.PETROL);// referntie aan auto
        Car c1 = new Car("Toyota", "Yaris", 2022, e1);
        //Print de auto
        System.out.println(c1 +"\n");
        System.out.println(e1);


        //Controle handmatig om te controleren dat de set method overload werkt met van string een int maken.
        e1.setHorsepower("2434");

        //controle van de horsepower set method overload als horsepower boven de 300 is. Maar dit hoort eigenlijk bij de objecten toevoegen.
        Car c2 = new Car("BMW", "3-serie", 2020, e1);
        c2.setEngine(new Engine(1200, 8, 350, "BMW", EngineType.PETROL));



    }
}
