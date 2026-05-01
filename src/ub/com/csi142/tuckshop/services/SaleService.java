package ub.com.csi142.tuckshop.service;

import  java.util.ArrayList;

import ub.com.csi142.tuckshop.products.Item;
import ub.com.csi142.tuckshop.products.Sale;


public class SalesService
{
    private static ArrayList<Sale> saleHistory;  //This ArrayList stores all the sales made.
    private Inventory tuckshopInventory;  //Accesses stock levels from the inventory class.

      public SalesService(Inventory tuckshopInventory)
            {
                this.saleHistory = new ArrayList<>();
                this.tuckshopInventory = tuckshopInventory;
            }
      
      public static void processSale(Sale newSale, Item itemBought, int quantityBought) //Main method that handles the sell logic. Object to be replaced by Item
            {
              if(itemBought.getStockLevel() >= quantityBought)  //check if there is enough stock in the inventory.
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
                            s.displaySale();
                          }
            } 
      
 dev-Nsizwa
}
}
 main
