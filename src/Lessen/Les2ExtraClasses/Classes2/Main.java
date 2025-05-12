package Lessen.Les2ExtraClasses.Classes2;
//        new Student();
// data type, identifier = instantie aanmaken
// int a = 1;

public class Main {

        //1 invulling van je programma
    public static void main(String[] args) {

        //4
        Student s1 = new Student("Mike", "1");
        Student s2 = new Student("Mike", "2");

        Teacher t1 = new Teacher("Joris", "joris.vanbreugel@ivitaelearning.nl");

        //data ophalen
        s1.printDetails();
        t1.printDetails();


        //gedrag vastleggen van je programma


        //new object, aanroepen van een methode met add, dit kunje veranvgen met wat hij terug geeft. Je kan het gewoon gebruiken als een getal.
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        System.out.println(result);

        Course course = new Course(t1, s1, s2 );
        // je kan altijd bij die leraar via de course.
        course.printDetails();
    }
}
