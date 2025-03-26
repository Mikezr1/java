package challenge8;

import java.util.Scanner;
/*
Objectives:
1. Write a program that lets you input the triangle’s base size and height.
2. Compute the area of a triangle by turning the above equation into code.
3. Write the result of the computation.
*/

public class TheTriangleFarmer {
    public static void main(String[] args) {
    System.out.println("Welcome to the triangle creator 3000");
    System.out.print("What is the length in cm of the base of the triangle? ");
    Scanner in = new Scanner(System.in);
    double base = in.nextInt();
    System.out.print("What is the height in cm of the triangle? ");
    double height = in.nextInt();
    double triangleSurface = base * height / 2;
    System.out.print("The surface of the triangle is " + triangleSurface + " cm\u00B2.");

    in.close(); //To prevent data leaks
}
}
