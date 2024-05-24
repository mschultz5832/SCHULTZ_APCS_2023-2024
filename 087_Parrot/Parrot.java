import java.util.Scanner;
public class Parrot {
       
    public static void repeatPhrase() {
        Scanner scanner = new Scanner(System.in);
    //to eneter the phrase to say
    System.out.print("Enter a phrase ");
    String phrase = scanner.nextLine();
    
    
        //if statemnt if person says  exit word to end  
    if (phrase.equals("exit")) {
        System.out.println("Exiting program...");
              
     }
    //printing out the sentence 
    System.out.println("Your pharse: " + phrase);
    
		repeatPhrase();

	public static void main(String[] args) {
		System.out.println("your phrase is ");
		System.out.println("Enter 'exit' at any time to end the program.");
	 
	 
			
			repeatPhrase();
		}
	 }
	 
	 
       }
    }    



