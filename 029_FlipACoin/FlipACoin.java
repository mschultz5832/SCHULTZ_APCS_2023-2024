public class FlipACoin {

public static void main(String [] args);{

    Random randomNum = new Random();
    
    int result = randomNum.nextInt(2);
    
    if (Math.random() < 0.5){
         System.out.println(" Its Heads");
     }   
     else{
        System.out.println("Its Tails");
        }
   
    }
}

//using maht.random in which if its 1 its heads and if not its tails using if else statments
