public abstract class Item{
    private String name;
    private double price;
    private int stockLevel;

    public Item(String name, double price, int stockLevel) {
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }
    
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

    public abstract String toString();


  
}

