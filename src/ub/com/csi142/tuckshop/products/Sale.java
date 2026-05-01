package ub.com.csi142.tuckshop.productsl;

public class Sale {
    private  Item item;
    private int quantity;

    public Sale(Item item, int quantity){
        this.item =item;
        this.quantity =quantity;
    }

    public Item getItem() {
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalPrice(){
        return item.getPrice() * quantity; 
    }

    public void displaySale() {
        // TODO Auto-generated method stub
        System.out.println("Sale details: " + getItem().getName() + " || Quantity: " + getQuantity() + " || Total Price: " + getTotalPrice());
        // throw new UnsupportedOperationException("Unimplemented method 'displaySale'");
    }
}
