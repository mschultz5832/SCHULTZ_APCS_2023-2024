import java.util.Scanner;
public class FactorialRecursion {

public static int factorial(int n) {
            
    if (n == 0) {
        return 1;
    } else {
    return n * factorial(n - 1);
            }
        }
     
     
public static void main(String[] args) {
        System.out.println(" 6 is " + factorial(6));
            
        System.out.println("10 is " + factorial(10));
            
            System.out.println("88 is " + factorial(88));
            
        }
     }
     
    