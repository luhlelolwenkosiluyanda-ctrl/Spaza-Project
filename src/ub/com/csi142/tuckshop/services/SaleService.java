package ub.com.csi142.tuckshop.services;

import  java.util.ArrayList;
import ub.com.csi142.tuckshop.products.Sale;
//import ub.com.csi142.tuckshop.products.Item; (Waiting for the Item.java to be ready first)


public class SaleService
{
    private ArrayList<Sale> saleHistory;  //This ArrayList stores all the sales made.
    private Inventory tuckshopInventory;  //Accesses stock levels from the inventory class.

      public SaleService(Inventory tuckshopInventory)
            {
                this.saleHistory = new ArrayList<>();
                this.tuckshopInventory = tuckshopInventory;
            }
      
      public void processSale(Sale newSale, Object itemBought, int quantityBought) //Main method that handles the sell logic. Object to be replaced by Item
            {
              /*if(itemBought.getStockLevel() >= quantityBought)  //check if there is enough stock in the inventory.
                {
                    int updatedStock = itemBought.getStockLevel() - quantityBought; //We subtract the bought amount from the item's current stock
                    itemBought.setStockLevel(updatedStock);

                    saleHistory.add(newSale);
                    System.out.println("Sale succesful :) Remaining Stock: " + itemBought.getStockLevel());
                }
              else
              {
                System.out.println("Sale failed!! Not enough stock available.");
              }

            }
      public void printAllSales()
            {
                System.out.println("---Total Sale History---");
                       for(Sale s : saleHistory)
                          {
                            System.out.println(s.displaySale())
                          }
            */}          
    
}
