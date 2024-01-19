import java.util.Scanner;

public class DateTranslator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = scan.nextInt();
        System.out.print("Enter the month: ");
        int month = scan.nextInt();
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        
        // user choosing a date format
        System.out.print("Select either American format ( choice 1) or European (choice 2)): ");
        int choice = scan.nextInt();
        
    
        if (choice == 1) {
            printAmerican(day, month, year);
        } else if (choice == 2) {
            printEuropean(day, month, year);
        } else {
            System.out.println("error, you havw to pick 1 or 2.");
        }
      
    }
    
    // Method printing for American format
    public static void printAmerican(int day, int month, int year) {
        System.out.println("American format: " + month + "/" + day + "/" + year);
    }
    
    // Method printing for  European format
    public static void printEuropean(int day, int month, int year) {
        System.out.println("European format: " + day + "/" + month + "/" + year);
    }
}
    
