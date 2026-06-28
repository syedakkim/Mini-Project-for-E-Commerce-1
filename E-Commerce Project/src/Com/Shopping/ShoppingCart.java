package Com.Shopping;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Item {
	String name;
	int quantity;
	double price;
	
	public Item(String name, int quantity, double price) {
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public double getTotal() {
		return quantity * price;
	}
	
	public String toString() {
	return name + "[ Quantity : " + quantity + ",Price : " +  price + "Total : " + getTotal() + "]"; 
}

public class ShoppingCart {
  
	public static void main(String[] args) {
		LinkedList<Item> cart = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("***************************");
		System.out.println("Mini Shopping Cart System 🛒");
		System.out.println("   ******************* ");
		while (true) {
		
		System.out.println("\n SYAK Shopping Cart Menu:");
		System.out.println("1. Add Item");
		System.out.println("2. Remove Item");
		System.out.println("3. Update quantity & item");
		System.out.println("4. View First Added Item");
		System.out.println("5. View Last Added Item");
		System.out.println("6. View All item & Total Bill");
		System.out.println("7. Clear the Cart");
		System.out.println("8. Exit");
		
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		scan.nextLine(); // Consume the new line
		
		switch (choice) {
		case 1: 
			System.out.println("Enter Item name : ");
			String itemAdd = scan.nextLine();
			System.out.println("Enter Quantity : ");
			int itemQunatity = scan.nextInt();
			System.out.println("Enter price per unit : ");
			double itemPrice = scan.nextDouble();
			scan.nextLine();
			cart.add(new Item(itemAdd,itemQunatity,itemPrice));
			System.out.println(itemAdd + " added successfully.");
			break;
			
		case 2: 
			if(!cart.isEmpty()) {
			System.out.println("Enter Item name to Remove: ");
			String itemRemove  = scan.nextLine();
		    boolean isRemove = cart.removeIf(item ->item.name.equalsIgnoreCase(itemRemove) );
		    if (isRemove) {
				System.out.println(itemRemove + "Removed from the Cart.");
			}
		    else {
		    	System.out.println(itemRemove + "Not Found");
		    }
		}
			else {
				System.out.println("Cart is Empty.");
		}
			break;
		
		case 3:
			System.out.println("Enter the item name to update : ");
			String updaeName = scan.nextLine();
			boolean isFound = false ;
			for(Item item : cart) {
				if (item.name.equals(updaeName)) {
					System.out.println("Enter update Quantity : ");
					item.quantity = scan.nextInt();
					System.out.println("Enter update Price : ");
					item.price = scan.nextDouble();
					scan.nextLine();
					System.out.println("Item updated successfully.");
					isFound = true;
					break;
				}
			}
			if(!isFound) {
				System.out.println("Entered item is not found. ");
			}
			break;
			
		case 4: 
			if (!cart.isEmpty()) {
				System.out.println("First added item is : " + cart.getFirst());
			}
			else {
				System.out.println("Cart is Empty.");
			}
			break;
			
		case 5:
			if (!cart.isEmpty()) {
				System.out.println("Last added item is : " + cart.getLast());
			}
			else {
				System.out.println("Cart is Empty.");
			}
			break;
		
		case 6:
			if (cart.isEmpty()) {
				System.out.println("Cart is Empty.");
			}
			else {
				double total = 0;
				System.out.println("items is the Cart : "+ cart);
				for(Item item : cart) {
					System.out.println(item);
					total += item.getTotal();
				}
				System.out.println("Total Bill : " + total);
				
			}
			break;
			
		case 7:
			cart.clear();
			System.out.println("All the item Cleared from  the Cart");
			break;
			
		case 8:
			System.out.println("....Thank you for shopping....");
			scan.close();
			return;
		 
	    default:
	    	System.out.println();
		
	     }
	 
	   }
	
	 }	
  
  }


