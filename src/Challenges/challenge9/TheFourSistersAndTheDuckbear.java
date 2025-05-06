package Challenges.challenge9;

import java.util.Scanner;

/* 
Four sisters own a chocolate farm and collect chocolate eggs laid by chocolate chickens every day. But
more often than not, the number of eggs is not evenly divisible among the sisters, and everybody knows
you cannot split a chocolate egg into pieces without ruining it. The arguments have grown more heated
over time. The town is tired of hearing the four sisters complain, and Chandra, the town’s Arbiter, has
finally come up with a plan everybody can agree to. All four sisters get an equal number of chocolate
eggs every day, and the remainder is fed to their pet duckbear. All that is left is to have some skilled
Programmer build a program to tell them how much each sister and the duckbear should get.

Objectives
1. Create a program that lets the user enter the number of chocolate eggs gathered that day.
2. Using / and %, compute how many eggs each sister should get and how many are left over for the
duckbear.
3. Answer this question: What are the total egg counts where the duckbear gets more than each
sister does? You can use the program you created to help you find the answer.
*/
public class TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        System.out.println("Welcome, please tell me for which day did want to register your egg count?");
        Scanner in = new Scanner(System.in);
        System.out.println("How many chocolate eggs did did you collect today?");
        int foundEggs = in.nextInt();
        System.out.println("Thank you, your administration has been updated.");
        int eggsPerSister = foundEggs / 4;
        System.out.println("Each sister will get " + eggsPerSister + " eggs.");
        System.out.println("This is the egg count the duckbear gets:");
        int eggsForDuckbear = foundEggs % 4; //How many eggs are left over when the amount of eggs is devide by 4 sisters?
        System.out.println(eggsForDuckbear + " Eggs are going to the duckbear.");
        System.out.println("With these amounts the duckbear will get more than the sisters.");

        for (int eggs = 0; eggs < 100; eggs++ ) //Loops through eggs 1 till 100 (99) and add a egg for every loop cycle 
        if (eggs % 4 > eggs /4) //Is the amount of eggs remain after deviding between the sisters higher than the amount devided between the sisters 
        System.out.println("The duckbear gets more eggs at " + eggs + " eggs total.");//Shows all egg counts that the duckbear gets more eggs than the sisters (1,2,3,6,7,11)
    }
}
