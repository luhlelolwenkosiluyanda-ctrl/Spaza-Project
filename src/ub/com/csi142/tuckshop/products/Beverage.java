package ub.com.csi142.tuckshop.products;

public class Beverage extends Item{
  private String id;
  
  public Beverage(String name, double price, int stockLevel, String id){
    super(name, price, stockLevel);
    this.id = id;
  }
  
    public String getID(){
      return id;
    }
  
  @Override 
  public String toString(){
    return "Drink details: " + getName() + " || P" + getPrice() + " || " + getStockLevel() + " units || ID: " +  getID();
  
    }
}
