package Com.Shopping;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart {
  
	public static void main(String[] args) {
		LinkedList<String> cart = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("***************************");
		System.out.println("Mini Shopping Cart System 🛒");
		System.out.println("   ******************* ");
		while (true) {
		
		System.out.println("\n SYAK Shopping Cart Menu:");
		System.out.println("1. Add Item");
		System.out.println("2. Remove Item");
		System.out.println("3. View First Added Item");
		System.out.println("4. View Last Added Item");
		System.out.println("5. view All Items");
		System.out.println("6. Exit");
		
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		scan.nextLine(); // Consume the new line
		
		switch (choice) {
		case 1: 
			System.out.println("Enter Item to add: ");
			String itemAdd = scan.nextLine();
			cart.add(itemAdd);
			System.out.println(itemAdd + " added successfully.");
			break;
			
		case 2: 
			if(!cart.isEmpty()) {
			System.out.println("Enter Item name to Remove: ");
			String itemRemove  = scan.nextLine();
			if (cart.remove(itemRemove)) {
			     System.out.println(itemRemove + " remove frome the Cart.") ;
			}
			else {
				 System.out.println(itemRemove + " not found in the Cart.");
			}
		}
			else {
				System.out.println("Cart is Empty.");
		}
			break;
			
		case 3: 
			if (!cart.isEmpty()) {
				System.out.println("First added item is : " + cart.getFirst());
			}
			else {
				System.out.println("Cart is Empty.");
			}
			break;
			
		case 4:
			if (!cart.isEmpty()) {
				System.out.println("Last added item is : " + cart.getLast());
			}
			else {
				System.out.println("Cart is Empty.");
			}
			break;
		
		case 5:
			if (cart.isEmpty()) {
				System.out.println("Cart is Empty.");
			}
			else {
				System.out.println("items is the Cart : "+ cart);
			}
			break;
			
		case 6:
			System.out.println("....Thank you for shopping....");
			scan.close();
			return;
		 
	    default:
	    	System.out.println();
		
	     }
	 
	   }
	
	 }	
  
  }


