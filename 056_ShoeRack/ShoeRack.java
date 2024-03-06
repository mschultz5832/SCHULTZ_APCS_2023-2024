public class ShoeRack {

    public static void main(String[] args) {
        //shoen one name and description 
        Shoes shoe1 = new Shoes();
        
        shoe1.shoeBrand = "adidas";
        shoe1.shoeSize = 7;
        shoe1.shoeColor = "pink";
          
        shoe1.printShoe();

        // shoe 2  name and description 
        Shoes shoe2 = new Shoes();

        shoe2.shoeBrand = "converse";
        shoe2.shoeSize = 7;
        shoe2.shoeColor = "red";
          
        shoe2.printShoe();

        //item three name an description 
        Shoes shoe3 = new Shoes();
       
    
        shoe3.shoeBrand = "timberland";
        shoe3.shoeSize = 8;
        shoe3.shoeColor = "tan";
          
        shoe3.printShoe();
          
    }
    
}
