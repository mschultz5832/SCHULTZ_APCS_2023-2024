import java.util.Scanner;
public class FizzBizz{

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }
            

        }
    }

}    
/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
0/1 - Comments

*/