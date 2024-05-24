public class Pizza {

        private String toppings;
        private boolean isCheesy;
     
     
        public Pizza(String name, int getCalories, String toppings, boolean isCheesy) {
     
            this.toppings = toppings;
            this.isCheesy = isCheesy;
        }
     
     
        public void displayToppings() {
            System.out.println("Toppings on " + name + ": " + toppings);
            System.out.println("Is it cheesy? " + (isCheesy ? "Yes" : "No"));
        }
     }
     
    

