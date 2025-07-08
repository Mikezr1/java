package Lessen.H5Flowcontrol.Statements;

public class MultipleElseIfStatement {
    public static void main(String[] args) {

        //invoer
        int aantalMensen = 49;

        if (aantalMensen < 50)
            System.out.println("Er zijn minder dan 50 mensen");
        else if (aantalMensen < 100)
            System.out.println("Er zijn minstens 50 en minder dan 100 mensen");
        else if (aantalMensen < 200)
            System.out.println("Er zijn minstens 100 en minder dan 200 mensen");
        else
            System.out.println("Er zijn meer dan 100 mensen");
    }
}
