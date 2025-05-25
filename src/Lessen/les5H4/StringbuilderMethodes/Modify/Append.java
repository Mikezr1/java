package Lessen.les5H4.StringbuilderMethodes.Modify;

public class Append {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(true);
        sb1.append(10);
        sb1.append('a');
        sb1.append(20.99);
        sb1.append("Hi");
        System.out.println(sb1); // true10a20.99Hi
    }
}
