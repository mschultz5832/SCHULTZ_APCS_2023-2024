public class PolymorphicFoods {
   
public static void main(String[] args) {
    Food[] foods = new Food[2];
    foods[0] = new Icecream("Icecream", 250, "Vanilla");
    foods[1] = new Pizza("Pepperoni Pizza", 350, "Pepperoni");
     
     for (Food food : foods) {
        System.out.println("Name: " + food.getName());
        System.out.println("Calories: " + food.getCalories());
     
     if (food Icecream) {
        Icecream icecream = (Icecream) food;
        System.out.println("Flavor: " + Icecream.getFlavor());
        } 
        else if (food  Pizza) {
            Pizza pizza = (Pizza) food;
            System.out.println("Topping: " + pizza.getTopping());
        }
     
    System.out.println();
            }
        }
     }
     
    
