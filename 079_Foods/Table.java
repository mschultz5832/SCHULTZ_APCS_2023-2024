public class Table {
   
public static void main(String[] args) {
          
    Icecream cream = new Icecream("ice cream", 137, "mint chocolate chip", true);
    Pizza pepperoniPizza = new Pizza("Pepperoni Pizza", 50, "Pepperoni, Cheese", true);
     
     
    System.out.println("iceCream description:");
        cream.describe();
        cream.displayCharacteristics();
     
     
    System.out.println("Pizza description:");
        pepperoniPizza.displayToppings();
        }
     }
     

