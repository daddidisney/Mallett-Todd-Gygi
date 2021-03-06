/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import app.Main;
import model.SupplyType;

/**
 *
 * @author wesmallett
 */
public class PurchaseSuppliesView extends View{
    SelectSupplyQuantityToPurchaseView quantityView;
    
   public PurchaseSuppliesView(){
       super(displaySupplies());
   }
   
   private static String displaySupplies(){
        String message = "What would you like to purchase?\n"
                         + "You have $" + Main.getGame().getTeam().getMoneyInPocket() + "\n";
        int selector = 1;
        for(SupplyType type: SupplyType.values()){
            String supplyName = type.getKey();
            int supplyPrice = type.getValue();
            message += selector + ". " + supplyName + " ..... $" + supplyPrice + "\n";
            selector++;
        }
        
        message += "Enter a number to purchase a supply or enter E to leave.";
        return message;
    }
   
   @Override
    public boolean doAction(String input){
        switch(input){
            case"1":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.OXEN);
               quantityView.display();
               return false;
            case"2":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.FOOD);
               quantityView.display();
               return false;
            case"3":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.WATER);
               quantityView.display();
               return false;
            case"4":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.CLOTHING);
               quantityView.display();
               return false;
            case"5":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.AMMUNITION);
               quantityView.display();
               return false;
            case"6":
               quantityView = new SelectSupplyQuantityToPurchaseView(SupplyType.SPARE_PARTS);
               quantityView.display();
               return false;
            case"E":
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Please enter a valid selection.");
                return true;
        }
    }
    
}
