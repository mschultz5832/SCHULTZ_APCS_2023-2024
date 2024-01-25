public class Menu {
   
    public static void main(String[] args) {
        //item one name and description 
        MenuItem item1 = new MenuItem();
        
        item1.itemName = "cheesebuger";
        item1.itemDescription = "two buns, cheese, lettuce, tomato, patty";
          
        item1.printItem();

        // item 2 name and description 

        MenuItem item2 = new MenuItem();
    
        item2.itemName = "fries";
        item2.itemDescription = "potatoes sliced";

        //item three name an description 
    
       item2.printItem();
    
        MenuItem item3 = new MenuItem();
    
        item3.itemName = "choclate shake";
        item3.itemDescription = "chocolate and milk blended";
    
        item3.printItem();
          
          
       }
       
    }
          
    
    
