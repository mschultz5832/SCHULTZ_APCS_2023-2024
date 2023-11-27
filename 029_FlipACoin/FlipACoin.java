public class FlipACoin {

<<<<<<< HEAD
    public static void main(String[] args);

    int h = 2;
    int t = 1;
  
    int count = 0;
    int result;

      while (count<=4)
      {
   
        result = (int)Math.random()*2;
        if (result == 2)
        {
        count++;
        System.out.print("H ");
        }
        else if (result == 1)
        {
        count=0;
        System.out.print("T ");
        }
=======
public static void main(String [] args) {

    // Random randomNum = new Random();
    
    int result = randomNum.nextInt();
    
    if (Math.random() < 0.5){
         System.out.println(" Its Heads");
     }   
     else{
        System.out.println("Its Tails");
        }
   
    }
}

//using maht.random in which if its 1 its heads and if not its tails using if else statments

/*

0/1 - Compiles
This isn't quite right. Are you testing as you're doing it?
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/
>>>>>>> 3bd773af1e2bc23670b684f0010410d2c9606e9c
