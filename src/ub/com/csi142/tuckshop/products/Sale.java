package ub.com.csi142.tuckshop.products;

public class Sale {
    private  Product product;
    private int quantity;

    public Sale(Product product, int quantity){
        this.product =product;
        this.quantity =quantity;
    }

    public Product getProduct() {
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalPrice(){
        return product.getPrice() * quantity; 
    }
}
