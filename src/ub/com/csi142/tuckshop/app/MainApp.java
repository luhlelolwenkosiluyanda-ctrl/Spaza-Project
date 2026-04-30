
package com.ub.csi142.tuckshop;
import ub.com.csi142.tuckshop.utils.InputValidator;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Tuckshop Management System ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Add New Item");
            System.out.println("3. Record a Sale");
            System.out.println("4. View Sales Summary");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = InputValidator.getValidInt("Select an option: ");
            switch (choice) {
                case 1:
                    // Call inventory.displayDetails().
                    System.out.println("Displaying Inventory...");
                    System.out.println("\n--Current Inventory--");
                    Inventory.displayItems();
                    
                    break;
                case 2:
                    System.out.println("\n---Add New Item---");
                    String name = InputValidator.getNoneEmptyString("Enter item name: ");
                    double price = InputValidator.getValidPrice("Enter item price: P");
                    int qty = InputValidator.getValidInt("Enter quantity: ");
                    //Logic to create a new item.
                    Inventory.addItem();
                    System.out.println("--Successfully added item into the system!");
                    break;
                case 3:
                    // Logic to find product and reduce quantity.
                    System.out.println("Enter item name: ");
                    String saleItem = input.next();
                    System.out.println("Enter quantity: ");
                    int saleQty = InputValidator.getValidInt("");

                    boolean success = inventory.processSale(saleName, saleQty);

                    if (success) {
                        double itemPrice = inventory.getItemPrice(saleName);
                        totalSales += (itemPrice * saleQty);
                        System.out.println("Sale Recorded!");
                    } else {
                        System.out.println("Sale failed: Item not found or insufficient stock");
                    }
                    break;
                case 4:
                    // Logic to iterate through saleSummary.
                    System.out.println("\n---Sales Summary---");
                    System.out.println("Total Sales Made: P" + totalSales());
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
