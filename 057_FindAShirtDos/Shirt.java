public class Shirt {
    
string color;
string brand; 
string type; 
boolean isClean;
         

     
    public Shirt() {
        color = "pink";
        brand = "carhart";
        type = "shirt";
        isClean = true;

    public Shirt(String brand) {
        color = "pink";
        this.brand = brand;
        type = "shirt";
        isClean = true;


    public Shirt(boolean isClean, String color, String brand, String type) {
       
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.isClean = isClean;
    
    }

    public static void main(String[] args) {}
    
    public void selfDescription() {
        System.out.println(color + " " + brand + "" + type);
    }

    public void fold(){
      
    System.out.println("the shirt folded");
            
    }

    public void cleanStatus(){
       
        if (isClean = true){

            System.out.println(" The shirt is clean");
        }
        else if (isClean = false ){
            System.out.println( "the shirt is very dirty, maybe wash it");

        }

        }
    
  }
}




    







