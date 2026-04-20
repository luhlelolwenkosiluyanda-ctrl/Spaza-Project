package ub.com.csi142.tuckshop.products;

public class Sale 
{
    private Item item;
    private int quantity;
    private double totalAmount;

    // Constructor
    public Sale(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        // This assumes your Item class has a getPrice() method
        this.totalAmount = item.getPrice() * quantity;
    }

    // This is the method that clears the red line!
    public void displaySale() {
        System.out.println("==== TUCKSHOP RECEIPT ====");
        System.out.println("Item:     " + item.getName());
        System.out.println("Qty:      " + quantity);
        System.out.println("Total:    P" + totalAmount);
        System.out.println("==========================");
    }

}
