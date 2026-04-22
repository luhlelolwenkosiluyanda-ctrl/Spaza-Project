package ub.com.csi142.tuckshop.services;

import java.util.ArrayList;

public Class Inventory {

        private ArrayList<Item> items = new ArrayList<>();
    
    public void addProduct(Product product) {
        items.add(product);
    }
    public void displayDetails() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("---Current Invetory---");
            for (Item i | products) {
                System.out.println(i);
            }
        }
    }
}
