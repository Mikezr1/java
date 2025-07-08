package Lessen.les5H4StringsAndArrays.StringbuilderMethodes.Modify;

public class Insert {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r');
        System.out.println(sb1); // ?
    }
}

//StringBuilder sb1 = new StringBuilder("123");
//char[] naam = {'J', 'a', 'v', 'a'};
//sb1.insert(1, naam, 1, 3);
//System.out.println(sb1); // ?