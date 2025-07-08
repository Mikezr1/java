package Lessen.les4H3Methods.Oefening;

//Dit is de Person klasse met een Constructor en Methode.
public class Person {

    //Stap 1: Eigenschappen (variabelen) van de klasse declareren
    String name ;
    int age;

    //Stap 2: Constructor -> Deze stelt de eigenschappen in zodat ze goed ingeladen kunnen worden in de klasse.
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Stap 3: Print methode -> methode die ervoor zorgt dat de eigenschappen geprint kunnen worden maken naar de klasse in de main method
    void printDetails() {
        System.out.println("Person - Name: " + this.name + " Age: " + this.age);
    }

}

