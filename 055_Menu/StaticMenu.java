public class StaticMenu {
   
public static void main(String[] args) {

    StaticMenuItem item1 = new StaticMenuItem();
    //static item one and description 
   
    item1.itemName = "cheesebuger";
    item1.itemDescription = "two buns, cheese, lettuce, tomato, patty";
      
    item1.printItem();

    StaticMenuItem item2 = new StaticMenuItem();
    // static menu time two description and name 
    
    item2.itemName = "fries";
    item2.itemDescription = "potatoes sliced";

    item2.printItem();

    StaticMenuItem item3 = new StaticMenuItem();
    //static menu item three description and name 

    item3.itemName = "choclate shake";
    item3.itemDescription = "chocolate and milk blended";

    item3.printItem();
      
      
   }
   
}
      

