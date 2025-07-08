package Lessen.H5Flowcontrol.Nesting;

public class NestedTernaryStatement {
    public static void main(String[] args) {

        //Multiple variables
        int a = 3;
        int b = 4;
        int c = 5;
        int max = (a > b ? (a > c ? a : c) : (b > c ? b : c));

        //Nesting
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c; }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c; }
        }
    }
}
