public class StaticShoeRack {

        public static void main(String[] args) {
            //shoen one name and description 
            StaticShoes shoe1 = new StaticShoes();
            
            shoe1.shoeBrand = "adidas";
            shoe1.shoeSize = 7;
            shoe1.shoeColor = "pink";
              
            
            // shoe 2  name and description 
            StaticShoes shoe2 = new StaticShoes();
            
            shoe2.shoeBrand = "converse";
            shoe2.shoeSize = 7;
            shoe2.shoeColor = "red";
            
            
            //item three name an description 
            StaticShoes shoe3 = new StaticShoes();
            
            
            shoe3.shoeBrand = "timberland";
            shoe3.shoeSize = 8;
            shoe3.shoeColor = "tan";
            
            
            shoe1.printShoe();
            shoe2.printShoe();
            shoe3.printShoe();
            
            
           }
        
    }

    // updated 

    
/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/