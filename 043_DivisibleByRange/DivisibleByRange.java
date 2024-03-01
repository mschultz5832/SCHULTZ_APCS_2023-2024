import java.util.Scanner;

    public class DivisibleByRange {

     public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
     //user entering number starting with
        System.out.print("Enter the starting number: ");
            int start = scan.nextInt();
     //netering ending number 
         System.out.print("Enter the ending number: ");
            int end = scan.nextInt();
     //entering number to divide by 
         System.out.print("Enter the number to divide by: ");
            int divider= scan.nextInt();
     
            int count = 0;
     
         System.out.print("Numbers divisible by " + divider + " between " + start + " and " + end + ": ");
     
            for (int i = start; i <= end; i++) {
                if (i % divider == 0) {
                    System.out.print(i);
                    count++;
                }
            }
        }
    }
    
        


