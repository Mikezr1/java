package Lessen.Les2ExtraClasses.Classes2;

public class Teacher {
    //constructor
    String name;
    String mail;

    //construcotr
    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    //method
    void printDetails() {
        System.out.println("Teacher - name: " + this.name + " mail: " + this.mail);
    }

}
