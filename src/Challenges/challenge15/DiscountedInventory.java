package Challenges.challenge15;
import java.util.Scanner;

/*
    After sorting through Tortuga’s outfitter shop and making it viable again, Tortuga realizes you’ve put him
    back in business. He wants to repay the favor by giving you a 50% discount on anything you buy from
    him, and he wants you to modify your program to reflect that.
    After asking the user for a number, the program should also ask for their name. If the name supplied is
    your name, cut the price in half before reporting it to the user.

    Objectives:

  1. Modify your program from before to also ask the user for their name.
  2. If their name equals your name, divide the cost in half.
     */

//75// challenge 1: string equality, if name equals my name than give 50% discount

//46// Product class gemaakt ipv losse arrays

//        double[] menuPrices = {
//                    12.99, //torches price
//                    145.00,
//                    1.29,
//                    7.99,
//                    78.99,
//                    2300.00,
//                    70.45
//            };

//            String[] menuItems = {
//                    "Torches",
//                    "Climbing Equipment",
//                    "Clean Water",
//                    "Rope",
//                    "Machete",
//                    "Canoe",
//                    "Food Supplies"
//            };

//59// Een for loop gemaakt voor het loopen door de naam en prijs van elk product binnen de producten array.
//85// Een for loop gemaakt die met twee decimalen de prijs weergeeft als men Mike heet en korting krijg of niet.

public class DiscountedInventory {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Product[] producten = {
            new Product("Torches", 12.99),
            new Product("Climbing Equipment", 145.00),
            new Product("Clean water",1.29),
            new Product("Rope",7.99),
            new Product("Machete",78.99),
            new Product("Canoe",2300.00),
            new Product("Food supplies",70.45),
        };

        System.out.println(BLUE + "This is our menu:"+ RESET + "\n");

        for (int i = 0 ; i < producten.length; i++){
            System.out.println((i + 1) + ". " + producten[i].name + " - " + "$" + String.format("%.2f", producten[i].price) ); //Voeg automatisch voor elke string van menuitems een cijfer toe als menu nummer.
        };

        System.out.println(BLUE + "What would you like to buy? Enter the menu number"+ RESET + "\n");

        Scanner menuItemsScanner = new Scanner(System.in);

        int menuItem = menuItemsScanner.nextInt();

        switch (menuItem) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("The " + producten[menuItem - 1].name +" has a price of " + String.format("%.2f", producten[menuItem - 1].price) + " gold.");
                break;
            default:
                System.out.println("The menu item your looking for is not available");

        }

        Scanner discountedPrice = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = discountedPrice.nextLine();
        double discountedPrices = producten[menuItem - 1].price / 2;

        if (name.toLowerCase().equals("mike")) {
            System.out.println("Because your name is Mike, the " + producten[menuItem - 1].name + " will be " + String.format("%.2f", discountedPrices));
        }
        else {
            System.out.println("Because your name is not Mike " + "(" + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase()  + ")" + ", the " + producten[menuItem - 1] + " will be " + producten[menuItem - 1] );
        }
    }
}

