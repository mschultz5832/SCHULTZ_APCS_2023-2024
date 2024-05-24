public class Food {

    String name;
    int getCalories;
     
    //method for nameand calories
    public Food(String name, int getCalories) {
        this.name = name;
        this.getCalories = getCalories;
    }
     
     
    public int getCalories() {
        return getCalories;
        }
     
     //to print out the foods name and calories
    public void describe() {
            System.out.println("Name: " + name);
            System.out.println("amount of calories: " + getCalories);
        }
     }
     
     
     
    
    

