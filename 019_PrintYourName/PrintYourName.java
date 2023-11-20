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

// scanning, assigment where the person types in ther information instead of coding it to what it should say 