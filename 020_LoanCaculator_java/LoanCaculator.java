import java.util.Scanner;

public class LoanCaculator {

public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
int amount = scanner.nextInt();

      Double principalBalance = 0.0;
	Double annualInterestRate = 0.0;
      Double remainingMonthsOnLoan = 0.0; 

      System.out.println("please provide your principal balance");
      principalBalance= scan.nextDouble(); 

      System.out.println( " your annual interest rate" );
      annualInterestRate= scan.nextDouble(); 

      System.out.println ("your remaining months on your loan");
      remainingMonthsOnLoan = scan.nextDouble(); 
      
      double monthlyInterest = principalBalance x (annualInterestRate/remainingMonths);
      double monthlyPayment = principalBalance/remainingMonthsOnLoan + annualInterestRate;

      
System.out.println("your interest is " + monthlyInterest + " and your total is " + monthlyPayment);
      
      }
}

// using scnner to enter their inormation and double with to use their infor to caculate there montly interest and total payment

     
		
    

/*

0/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

These are looking pretty rough...

*/