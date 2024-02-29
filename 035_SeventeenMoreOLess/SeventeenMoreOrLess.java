import java.util.Scanner;

public class SeventeenMoreOrLess {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //having user eneter firts integer 
    System.out.println("Enter the first integer: ");
    int num1 = scanner.nextInt();
    //enterig second integer 
    System.out.println("Enter the second integer: ");
    int num2 = scanner.nextInt();
    //enetering third integer
    System.out.println("Enter the third integer: ");
    int num3 = scanner.nextInt();
    // if one of the integers is 17 more or less than the other 
    if (Math.abs(num1 - num2) == 17 || Math.abs(num1 - num3) == 17 || Math.abs(num2 - num3) == 17) {
        System.out.println("One of the numbers is 17 more or 17 less than the others.");
        } else {
        //printing out if none of the numbers re 17 more or 17 less
            System.out.println("None of the numbers is 17 more or 17 less than the others.");
           }
       }
}
    




/*

0/1 - Compiles
-Doesn't compile
0/1 - Content
-Isn't complete
0/1 - Formatting
-Formatting is way off.
0/1 - Comments
-No comments.

*/