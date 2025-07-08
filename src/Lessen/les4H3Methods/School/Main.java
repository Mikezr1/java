package Lessen.les4H3Methods.School;

public class Main {

    public static void main(String[] args) {

        //4
        Student s1 = new Student("Mike", "1");
        Student s2 = new Student("Daan", "2");

        Teacher t1 = new Teacher("Joris", "joris.vanbreugel@ivitaelearning.nl");



        //data ophalen
        s1.printDetails();
        t1.printDetails();


        //gedrag vastleggen van je programma met methodes
        System.out.println(s1.getName());

        //testen van restrictie
        t1.setMail("tes.nl");


        Course course = new Course(t1, s1, s2 );
        // je kan altijd bij die leraar via de course.
        course.printDetails();
    }
}

