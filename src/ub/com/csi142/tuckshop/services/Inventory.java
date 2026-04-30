package ub.com.csi142.tuckshop.services;
import ub.com.csi142.tuckshop.products;
import java.util.ArrayList;

public Class Inventory {

        private ArrayList<Item> items = new ArrayList<>();
    
    public void addProduct(Item item) {
        items.add(item);
    }
    public void displayDetails() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("---Current Invetory---");
            for (Item i | items) {
                System.out.println(i);
            }
        }
    }
}
