public class Food {

String name;
int getCalories;
 
 
public Food(String name, int gerCalories) {
    this.name = name;
    this.getCalories = gerCalories;
}
 
 
public int getCalories() {
    return getCalories;
    }
 
 
public void describe() {
        System.out.println("Name: " + name);
        System.out.println("amount of calories are: " + getCalories);
    }
 }
 
 
 
