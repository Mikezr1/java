package Challenges.challenge13;

import java.util.Scanner;
/*
 There are watchtowers in the region around Consolas that can alert
you when an enemy is spotted. With some help from you, they can tell
you which direction the enemy is from the watchtower.

Objectives:

1. Ask the user for an x value and a y value. These are coordinates of the enemy relative to the watchtower’s location. Positive x-values are east, positive y-values are north (as they would be on a normal graph)
2. Using if statements and relational operators, display a message about what direction the enemy is coming from. For example, “The enemy is to the northwest!” or “The enemy is here!
*/

public class Watchtower {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the x coordinate value?");
        int coordinatex = in.nextInt();
        System.out.println("What is the y coordinate value?");
        int coordinatey = in.nextInt();
        //coordinate + x = east, + y = north, - x = west, - y = south

        System.out.println("This is the direction the enemy is coming from:");
        if (coordinatex >= 0 && coordinatey >= 0 )
        System.out.println("The enemy is north east");
        
        if (coordinatex <= 0 && coordinatey <= 0)
        System.out.println("The enemy is south west");
        
        if (coordinatex >= 0 && coordinatey <= 0 )
        System.out.println("The enemy is south east");
        
        if (coordinatex <= 0 && coordinatey >= 0 )
        System.out.println("The enemy is north west");

        in.close();

    }
    
}
