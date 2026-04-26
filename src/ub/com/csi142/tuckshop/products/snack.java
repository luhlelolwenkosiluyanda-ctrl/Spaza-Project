package ub.com.csi142.tuckshop.products;

public class Snack extends Item {
  private String type;

  public Snack(String name, double price, int quantity, String type) {
    super(name, price, quantity);
    this.type = type;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public String describeItem() {
    String description = "Snack: " + getName();
    description += " | Type: " + type;
    description += " | Price: " + getPrice();
    description += " | Quantity: " + getQuantity();
    return description;
  }
}
  
