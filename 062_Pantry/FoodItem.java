public class FoodItem {
    // variables for food items, name amount and labeling(unit)
    private String name;
    private int amount;
    private String labeling;
    private String brand; // not using brand in pantry shelf 
        
     
    public FoodItem(String name, int amount, int labeling, String brand) {
     
    this.name = name;
    this.amount = amount;
    this.labeling = labeling;
    this.brand = brand;
     
    }
    // method for food item, with name 
    public void foodItem(){
        System.out.println( "in the pantry we have" + name);
     
    }
    // method for amount of food 
    public void foodAmount(){
        System.out.println("there is" + amount + labeling + "of this food");
    }
    // method for eating food, decreasing amounf of food being ate
     public static eatingFood(){
     System.out.println( "im going to eat" + amount + labeling);
      
    } 
public void setName(){
    this.name = Name;
}
public void getName(){
    return.Name;
}
public void setAmount(int amount){
    this.amount = amount;
}   
public int getAmount(){
    return amount;
}
public String getLabeling() {
    this.labeling = Labeling;
}
public String setLabeling(){
    return labeling;
}
public String getBrand(){
    this.brand = Brand;
}
public String setBrand(){
    return brand;
     
    }
}

    