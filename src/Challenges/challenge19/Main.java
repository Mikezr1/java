package Challenges.challenge19;

public class Main {
    public static void main(String[] args) {
        //data staat in de main!!
        int[] jojo = {4, 51, -7, 13, -99, 15, -8, 45, 90};
        int[] jojo2 = {5, 56, -2, 15, -9};
        String naam = "mike";
        int i = Array.arrayMinimum(jojo);// jojo meegeven en uitkomst in een int i variabelen plaatsen

        System.out.println("Minimum: " + Array.arrayMinimum(new int[] {1,2}) );// hier checkt de compiler; is jojo een int array
//        System.out.println("Average: " + Array.arrayAverage(naam));// de naam van de waarde blijft in de scope.
        System.out.println("Minimum: " + Array.arrayMinimum(jojo));
        System.out.println("Average: " + Array.arrayAverage(jojo));
        System.out.println("Average: " + Array.arrayAverage(jojo2));


        //meegeven is met parameters
        //terugkrijgen is met terugkeertype -> return

    }
}
