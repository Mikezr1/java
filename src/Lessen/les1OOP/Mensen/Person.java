package Lessen.les1OOP.Mensen;

public class Person {
    //decalaratie van eigenschappen
    String name; //declaratie
    int age; //assignment
    String woonplaats;

    //constructor en parameters en de declaratie assignen/koppelen aan
    Person(String name, int age, String woonplaats) {
        this.name = name;
        this.age = age;
        this.woonplaats = woonplaats;
// System.out.println("Dit is een constructor");
// System.out.println(name);
        }

//  return-type identified -> je gebruikt hier this om de declaratie op te halen
    void printDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Woonplaats: " + this.woonplaats);
    }
}