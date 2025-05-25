package Lessen.les5H4.StringbuilderMethodes.Modify;

public class delete {
        public static void main(String args[]) {
            StringBuilder sb1 = new StringBuilder("0123456");
            sb1.delete(2, 4); // delete vanaf index 2 tot 4 (inclusief)
            System.out.println(sb1); // ?
        }
    }
