public class Shirt {

   static string color = "pink";
   static string brand = "carhartt";
   static string type = "shirt";
   static boolean isClean = true;
    
   public static void main(String[] args){}

   public static void describeShirt(){
        System.out.println( " This is a " + color + ""  + brand + "" + type );
    }

    public static void fold(){
        System.out.println( " the shirt is folded");
    }

    public static void isClean(){
    
        if (isClean = true){

            System.out.println(" The shirt is clean");
        }
        else if (isClean = false ){
            System.out.println( "the shirt is very dirty, maybe wash it");
        }
   }
}
