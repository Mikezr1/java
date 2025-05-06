package Challenges.challenge10;

import java.util.Scanner;
/*
Three kings, Melik, Casik, and Balik, are sitting around a table, debating who has the greatest kingdom
among them. Each king rules an assortment of provinces, duchies, and estates. Collectively, they agree
to a point system that helps them judge whose kingdom is greatest: Every estate is worth 1 point, every
duchy is worth 3 points, and every province is worth 6 points. They just need a program that will allow
them to enter their current holdings and compute a point total.

Objectives:
1. Create a program that allows users to enter how many provinces, duchies, and estates they have.
2. Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
3. Display the point total to the user.

Time:
This took me out of my head 15 min.
*/
public class TheDominionOfKings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many provinces do you have?");
        int provinces = in.nextInt();
        System.out.println("How many duchies do you have?");
        int duchies = in.nextInt();
        System.out.println("How many estates do you have?");
        int estates = in.nextInt();

        int sum = provinces * 6 + duchies * 3 + estates * 1; //user score calculation
        System.out.println("Your score is: " + sum );
    }
    
}
