
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
                    System.out.println("\n--Current Inventory--");
                    if (inventory.isEmpty) {
                        System.out.println("Inventory is empty");
                    } else {
                        for (Item item : Inventory) {
                            item.displayDetails();
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n---Add New Item---");
                    String name = InputValidator.getNoneEmptyString("Enter item name: ");
                    double price = InputValidator.getValidPrice("Enter item price: P");
                    int quantity = InputValidator.getValidInt("Enter quantity level: ");
                    //Logic to create a new Item
                    Item newItem = new Item(name, price, quantity);
                    System.out.println("--Successfully added " +  name + "into system!");
                    Inventory.add(newItem);
                    break;
                case 3:
                    // Logic to find product and reduce quantity
                    System.out.println("Enter sale: ");
                    String saleItem = input.next();

                    for (Item item : Inventory) {
                        if (item.getName().IgnoreCase()) {
                            found = true;
                            System.out.println("Enter quantity: ");
                            int qty = InputValidator.getValidInput("");

                            if (item.getStock() >= qty) {
                                item.reduceStock(qty);
                                double cost = item.getPrice() * qty;
                                totalRevenue += cost;
                                System.out.println("Sale successful! Total: P" + cost);
                            } else {
                                System.out.println("Error: Not enough stock.");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    /* Logic to iterate through saleSummary
                    System.out.println("\n---Sales Summary---");
                    System.out.println("Total Sales Made: P" + totalSales);
                    */
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
