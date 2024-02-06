import java.util.Scanner;
public class unethicalRPS {

   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       // User input
       System.out.print("Enter your choice: ");
       String userInput = "";
       userInput = scan.nextLine();


       String rock = "Rock";
       String scissors = "Scissors";
       String paper = "Paper";
       scan.close();

      //no matter what user inputs, computer always counter attacks with what beats their choice
       if(userInput.equals(rock))
       {
     System.out.print(" computer choose paper, you lost");

       }
       if(userInput.equals(paper))
       {
        System.out.print(" computer choose scizzors, you lost");
       }
       if(userInput.equals(scissors))
       {
        System.out.println("computer choose rock, you loose");

       }

    }
}
    
    

/*

0/4 incomplete

*/