package Lessen.les4H3Methods.School;

import java.util.List;

public class Course {

    //2 eigenschappen vastleggen met data typen. Met een lijst (generiek list type), hover en erop klikken maakt de lijst zelf.

    Teacher teacher;
    List<Student> students;

    public Course(Teacher teacher, Student... students) {
        this.teacher = teacher;
        this.students = List.of(students);
    }


    // methoden voor het printen van de course
    void printDetails() {
        this.teacher.printDetails();

        //voor elke student:voor iedere student in studenten data type - identifier
        for(Student student : students) {
            student.printDetails();
        }
    }

    //meerdere student toevoegen aan een course met VAR ARGS
    public void addStudent(Student... students) {
        for (Student student : students) {
            this.addStudent(student); //voor iedere student die ik binnen krijg -> meerdere studenten toeveogen
        }
    }

}