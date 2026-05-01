package ub.com.csi142.tuckshop.service;
import java.util.ArrayList;

import ub.com.csi142.tuckshop.products.Beverage;
import ub.com.csi142.tuckshop.products.Item;
import ub.com.csi142.tuckshop.products.Snack;

public class Inventory {

        private ArrayList<Item> items = new ArrayList<>();
    
    public void addItem(Item item) {
        items.add(item);
    }
    public void displayDetails() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("---Current Invetory---");
            for (Item i : items) {
                System.out.println(i);
            }
        }
    }
    public Item findItemByName(String saleItemName) {
            for (Item i : items) {
                if (i.getName().equalsIgnoreCase(saleItemName)) {
                    return i;
                }
            }
        throw new UnsupportedOperationException("Unimplemented method 'findItemByName'");
    }
    public void defaultData() {
        // Food items
        items.add(new Snack("Magwinya (Fat Cakes)",   2.00,  30, "S001 "));
        items.add(new Snack("Bread Loaf (Albany)",   11.50,  10, "S002"));
        items.add(new Snack("Simba Chips 30g",        4.00,  50, "S003"));
        items.add(new Snack("Vetkoek",                1.50,  20, "S004"));
        items.add(new Snack("Mapakiwa Biscuits",      5.00,  40, "S005"));

        // Drink items
        items.add(new Beverage("Coke 500ml",            8.00,  24, "B001"));
        items.add(new Beverage("Willards Freezit",      2.00,  60, "B002"));
        items.add(new Beverage("Mineral Water 500ml",   6.00,  20, "B003"));
        items.add(new Beverage("Fanta Orange 500ml",    8.00,  18, "B004"));
        items.add(new Beverage("Spar Cool Drink 2L",   15.00,  12, "B005"));

        
    }


}
