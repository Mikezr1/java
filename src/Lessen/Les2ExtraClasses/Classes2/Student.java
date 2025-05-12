package Lessen.Les2ExtraClasses.Classes2;
//2
public class Student {
    String name;
    String id;

//4
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    //void: Geef geen data terug
    void printDetails() {
        System.out.println("Student - name: " + this.name + " id: " + this.id);
    }

}
