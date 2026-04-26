
package com.ub.csi142.tuckshop;
import ub.com.csi142.tuckshop.utils.InputValidator;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("--- Tuckshop Management System ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Add New Item");
            System.out.println("3. Record a Sale");
            System.out.println("4. View Sales Summary");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = InputValidator.getValidInt("Select an option: ");
            switch (choice) {
                case 1:
                    // Call inventory.displayDetails()
                    System.out.println("Displaying Inventory...");
                    break;
                case 2:
                    System.out.println("\n---Add New Item---");
                    String itemName = InputValidator.getNoneEmptyString("Enter item name: ";
                    double itemPrice = InputValidator.getValidPrice("Enter item price: P");
                    int itemStock = InputValidator.getValidInt("Enter stock level: ");
                    //Logic to create a new Item
                    Item newItem = new Item(itemName, itemPrice, itemStock);
                    System.out.println("--Successfully added " + itemName + "into system!");
                    break;
                case 3:
                    // Logic to find product and reduce quantity
                    break;
                case 4:
                    // Logic to iterate through saleSummary
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
