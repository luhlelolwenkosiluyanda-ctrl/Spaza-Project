 dev-Nsizwa
package ub.com.csi142.tuckshop.app;
import ub.com.csi142.tuckshop.service.Inventory;
import ub.com.csi142.tuckshop.service.SalesService;
import ub.com.csi142.tuckshop.utils.InputValidator;
import java.util.Scanner;
import ub.com.csi142.tuckshop.products.Item;
import ub.com.csi142.tuckshop.products.Sale;
import ub.com.csi142.tuckshop.products.Snack;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        Inventory inventory = new Inventory();
        SalesService salesService = new SalesService(inventory);
        Item item1 = new Snack("Chips", 10.00, 50, null);

         inventory.defaultData();
        
        while (running) {
            
            System.out.println("======================================================");
            System.out.println("        INSIZWA TUCKSHOP — MANAGEMENT SYSTEM          ");
            System.out.println("                Gaborone, Botswana                 ");
            System.out.println("======================================================");
            System.out.println("  Welcome to the inventory system! Please select an option:  ");
            System.out.println("======================================================");
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
                    inventory.displayDetails();
                    
                    break;
                case 2:
                    System.out.println("\n---Add New Item---");

                    String name = InputValidator.getNonEmptyString("Enter item name: ");
                    double price = InputValidator.getValidPrice("Enter item price: P");
                    int qty = InputValidator.getValidInt("Enter quantity: ");

                    Item newItem = new Snack(name, price, qty, null); // create new object
                    inventory.addItem(newItem);

    System.out.println("--Successfully added item into the system!");
    break;
                case 3:
                    System.out.println("\n---Record Sale---");

                    String saleItemName = InputValidator.getNonEmptyString("Enter item name: ");
                    int saleQty = InputValidator.getValidInt("Enter quantity: ");

                    Item item = inventory.findItemByName(saleItemName);
                    Sale newSale = new Sale(item, saleQty); // create a new Sale object

                    if (item != null) {
                        salesService.processSale(newSale, item, saleQty);
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;
                case 4: 
                    salesService.printAllSales();
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

package ub.com.csi142.tuckshop.app;
import ub.com.csi142.tuckshop.service.Inventory;
import ub.com.csi142.tuckshop.service.SalesService;
import ub.com.csi142.tuckshop.utils.InputValidator;
import java.util.Scanner;
import ub.com.csi142.tuckshop.products.Item;
import ub.com.csi142.tuckshop.products.Sale;
import ub.com.csi142.tuckshop.products.Snack;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        Inventory inventory = new Inventory();
        SalesService salesService = new SalesService(inventory);
        Item item1 = new Snack("Chips", 10.00, 50, null);

         inventory.defaultData();
        
        while (running) {
            
            System.out.println("======================================================");
            System.out.println("        INSIZWA TUCKSHOP — MANAGEMENT SYSTEM          ");
            System.out.println("                Gaborone, Botswana                 ");
            System.out.println("======================================================");
            System.out.println("  Welcome to the inventory system! Please select an option:  ");
            System.out.println("======================================================");
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
                    inventory.displayDetails();
                    
                    break;
                case 2:
                    System.out.println("\n---Add New Item---");

                    String name = InputValidator.getNonEmptyString("Enter item name: ");
                    double price = InputValidator.getValidPrice("Enter item price: P");
                    int qty = InputValidator.getValidInt("Enter quantity: ");

                    Item newItem = new Snack(name, price, qty, null); // create new object
                    inventory.addItem(newItem);

    System.out.println("--Successfully added item into the system!");
    break;
                case 3:
                    System.out.println("\n---Record Sale---");

                    String saleItemName = InputValidator.getNonEmptyString("Enter item name: ");
                    int saleQty = InputValidator.getValidInt("Enter quantity: ");

                    Item item = inventory.findItemByName(saleItemName);
                    Sale newSale = new Sale(item, saleQty); // create a new Sale object

                    if (item != null) {
                        salesService.processSale(newSale, item, saleQty);
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;
                case 4: 
                    salesService.printAllSales();
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
} main
