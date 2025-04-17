package challenge14;
import java.util.Scanner;
/*
It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner, tells you as he turns
over and attempts to go back to sleep in his reclining chair in the corner.
There’s a simple solution: use your programming powers to build something to report the prices of
various pieces of equipment, based on the user’s selection:
The following items are available:

1. Rope
2. Torches
3. Climbing Equipment
4. Clean Water
5. Machete
6. Canoe
7. Food Supplies

What number do you want to see the price of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:

1. Build a program that will show the menu illustrated above. (make a program that shows all the menu items)
2. Ask the user to enter a number from the menu.
3. Using the information above, use a switch (either type) to show the item’s cost.

 */

public class BuyingInventory {

    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args){

        String[] menuItems = {
            "Torches",
            "Climbing Equipment",
            "Clean Water",
            "Rope",
            "Machete",
            "Canoe",
            "Food Supplies"
        };

        double[] menuPrices = {
            12.99, //torches price
            145.00,
            1.29,
            7.99,
            78.99,
            2300.00,
            70.45
        };


            System.out.println(BLUE + "This is our menu:"+ RESET + "\n");

            //challenge 1
            for (int i = 0 ; i < menuItems.length; i++){
                System.out.println((i + 1) + "." + menuItems[i] ); //Voeg automatisch voor elke string van menuitems een cijfer toe als menu nummer.
            };
            
            //challenge 2
            System.out.println(BLUE + "What would you like to buy? Enter the menu number"+ RESET + "\n");
            
            Scanner menuItemsScanner = new Scanner(System.in);

            int menuItem = menuItemsScanner.nextInt();

            switch (menuItem) {
                case 1: {
                    System.out.println("The rope costs" + menuPrices[menuItem - 1]);
                    break;
                }
                case 2: {
                    System.out.println("The Climbing Equipment costs $145,00");
                    break;
                }
                case 3: {
                    System.out.println("The Clean Water is $1,29");
                    break;
                }
                case 4: {
                    System.out.println("The Rope is $7,99");
                    break;
                }
                default: {
                    System.out.println("The menu item your looking for is not available");
                }

            }

            // System.out.println("the" + menuItems + "costs" + menuPrices );

            menuItemsScanner.close();
    }
    
}
