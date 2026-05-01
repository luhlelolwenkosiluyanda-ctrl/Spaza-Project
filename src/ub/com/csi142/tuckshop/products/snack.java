 dev-Nsizwa
package ub.com.csi142.tuckshop.products;

public class Snack extends Item{
    private String id;

    public  Snack(String name, double price, int quantity, String id){
        super(name, price, quantity);
        this.id = id;
    }
    public String getID(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Snack details: "+ getName() +"|| " + getPrice() + " || " + getStockLevel() + "units || ID: "+ getID();
    }
}

package ub.com.csi142.tuckshop.products;

public class Snack extends Item{
    private String id;

    public  Snack(String name, double price, int quantity, String id){
        super(name, price, quantity);
        this.id = id;
    }
    public String getID(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Snack details: "+ getName() +"|| " + getPrice() + " || " + getStockLevel() + "units || ID: "+ getID();
    }
}

 main
