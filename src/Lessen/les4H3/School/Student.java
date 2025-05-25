package Lessen.les4H3.School;

public class Student {
    private String name;
    private String id;

    //4
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    //void: Geef geen data terug
    void printDetails() {
        System.out.println("Student - name: " + this.name + " id: " + this.id);
    }

    //functies aanmaken voor in main
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //een student toevoegen aan de lijst met add maar dit is ook een methode d
//    public void addStudent(Student student) {
//        this.students.add(student);
//    }
}
