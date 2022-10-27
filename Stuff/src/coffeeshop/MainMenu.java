package coffeeshop;

import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {

	// hook this up to use a scanner to take user input
	// each of 1 to 4 should be implmented in its own sub function
	// should use a while loop to keep displaying the menu until the user selects
	// exit
	// print a menu
	// 1) order item 2) fulfillOrder 3) List menu 4) print total 5) list drinks 6)
	// list food 7) exit

	// -- 1 function that displays the menu, collects the user input, and returns an
	// integer for selection
	// if the user type 1 and hits enter this function will return 1

	// using a while loop ... an if or case statement

	// for example a user enters 1 .. create a function that will ask the user to
	// enter the item name and call
	// the addOrder on the coffee house and return to the main menu
	// then if a user select 4 print to total and go back to the main menu
	//
	// BONUS dont forget some error checking ... if a user enters a letter instead
	// of a number gracefully handle that

	private Scanner scanner = new Scanner(System.in);
	private CoffeeShop shop = new CoffeeShop();
	
	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		m.start();
	}

	private int showMenu() {
		System.out.println("1) Order Item");
		System.out.println("2) List Order");
		System.out.println("3) Fulfill Order");
		System.out.println("4) Print total");
		System.out.println("5) list drinks");
		System.out.println("6) list food");
		System.out.println("7) exit");

		System.out.print("Enter menu option ");

		int input = scanner.nextInt();
		return input;
	}

	private void orderMenuItem() {
		System.out.print("\nEnter Item to order: ");
		String itemName = scanner.nextLine();
		String success = shop.addOrder(itemName);
		System.out.println(success);
	}
	
	public void start() {
		// while loop
		int input = showMenu();
		while (input != 7) {
			switch (input) {
			case 1:
				// order Item
				orderMenuItem();
				break;
			case 2:
				// List Order
				break;
			case 3:
				// Fulfill Order
				break;
			case 4:
				//Print total
				break;
			case 5: 
				//List Drinks
				break;
			case 6:
				//List food
				break;
			case 7:
				//exit
				System.exit(0);
			default:
				System.out.println("invalid input, please try again");
				break;
			}
			input = showMenu();
		}

		CoffeeShop tcs = new CoffeeShop();

		// put a scanner to allow a person to enter a menu item

		System.out.println(tcs.addOrder("hot cocoa"));
		System.out.println(tcs.addOrder("iced tea"));
		System.out.println(tcs.addOrder("cinnamon roll"));
		System.out.println(tcs.addOrder("iced coffee"));
		System.out.println(Arrays.toString(tcs.listOrders()));
		System.out.println(tcs.dueAmount());

		// we know that we have 2 items ordered
		// so by fulfilling 3 times the 3rd time shuold be all orders fullfilled
		System.out.println(tcs.fulfillOrder());
		System.out.println(tcs.fulfillOrder());
		System.out.println(tcs.fulfillOrder());

		// now we sould get an empty array because we filled all orders
		System.out.println(Arrays.toString(tcs.listOrders()));
		System.out.println(tcs.dueAmount());

		System.out.println(tcs.cheapestItem());
		System.out.println(Arrays.toString(tcs.drinksOnly()));
		System.out.println(Arrays.toString(tcs.foodOnly()));
	}

}