package Lessen.les1.Mensen;

public class Main {
    public static void main(String[] args) {
//        new Person();
        int a = 10;

        // drie regels voor een persoon = te lang en je kan hem verkeerd invullen (fout tolerant hoog, want je kan leeg ook invullen)
        Person person = new Person("joris", 32, "haarlem");
        person.printDetails();


        //argumenten (geen parameters)
        Person person2 = new Person("Hans", 34, "Utrecht");
//        person2.name = "Hans";
//        person2.age = 32;

        person2.printDetails();

//        een regel code is beter dan:

//        person.name = "Joris";
//        person.age = 32;
//        System.out.println("name:" + person.name + person.age);

//        Person person = new Person ( "freek", "32", "Haarlem");
//        System.out.println("name:" + person2.name + person2.age);
//        person.printDetails();

        // de waarde moeten gelijk in de instantie ingeladen worden, en een volledig persoon. in de constructor kan je een vraag stellen daarvoor.
        // Person(String name)
        // je roept de constructor aan en met een identifer name als controle of de naam is ingevuld.
        // this in de constructor -> verwijs je naar dit object want de object eigenschappen en naam van het object hebben vaak dezelfde variabele naam.

        // Andere manier:
        // datatype  identifier  waarde
        double       number      = 5.5;
        Person       jojo        = new Person("Daniël", 30, "Den Bosch");
        jojo.printDetails();

        Person p3 = new Person("Dwarka", 32, "Haarlem");
        p3.printDetails();

        }
}