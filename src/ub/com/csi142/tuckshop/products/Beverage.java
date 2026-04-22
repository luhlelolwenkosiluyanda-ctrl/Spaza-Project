package ub.com.csi142.tuckshop.products;

public class Beverage extends Item{
  private String id;
  
  public Beverage(String name, double price, int quantity, String id){
    super(name, price, quantity);
    this.id = id;
  }
  
    public string getID(){
      return id;
    }
  
  @Override 
  public string describeItem(){
    return "Drink details: " + getName() + " || P" + getPrice() + " || " + getQuantity() + " units || ID: " +  getID();
  
}
