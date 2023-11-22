import java.util.Scanner;

public class PrintYourName{
	
public static void main(String[] args) {

		String firstName = "";
		String lastName = "";
		Scanner scan = new Scanner(System.in); 

        System.out.println("What is your full name: first name,last name?"); 
		firstName= scan.nextLine(); 
		
		System.out.println(firstName + " " + lastName); 
    } 
} 

// more about scanner and istead of printing name, the put in ther own name in 

