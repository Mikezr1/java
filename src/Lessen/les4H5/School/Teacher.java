package Lessen.les4H5.School;

public class Teacher {
    //constructor -> prive maken
    private String name;
    private String mail;

    //construcotr
    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail.contains("@")){
            this.mail = mail;
        } else {
            System.out.println("Dit is geen email");
        }
    }

    //method
    void printDetails() {
        System.out.println("Teacher - name: " + this.name + " mail: " + this.mail);
    }

}
