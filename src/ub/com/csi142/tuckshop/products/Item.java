package ub.com.csi142.tuckshop.products;

public class Item
{
    private String name;
    private double price;
    private int stockLevel;

    // Constructor to set up our snack/item
    public Item(String name, double price, int stockLevel) {
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockLevel() { return stockLevel; }

    // Method to manually set or update the stock level
    public void setStockLevel(int stockLevel) 
    {
       this.stockLevel = stockLevel;
    }

    // Logic to reduce stock when a sale happens
    public void reduceStock(int quantity) {
        if (quantity <= stockLevel) {
            this.stockLevel -= quantity;
        } else {
            System.out.println("Error: Not enough " + name + " in stock!");
        }
    }

    @Override
    public String toString() {
        return name + " (Price: P" + price + ", Stock: " + stockLevel + ")";
    }


  
}
