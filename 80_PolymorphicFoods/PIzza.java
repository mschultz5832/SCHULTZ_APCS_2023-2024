public class Pizza {

       //pizza class variables
    private String toppings;
    private boolean isCheesy;
 
 //method for atrributes
    public Pizza(String name, int getCalories, String toppings, boolean isCheesy) {
 
        this.toppings = toppings;
        this.isCheesy = isCheesy;
    }
 
 //method for priting out the attributes
    public void displayToppings() {
        System.out.println("Toppings on " + name + ": " + toppings);
        System.out.println("Is it cheesy? " + (isCheesy ? "Yes" : "No"));
    }
 }
 
    

