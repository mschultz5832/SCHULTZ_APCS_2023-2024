import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       //user is enetring name 
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
    // Custom method greeting by name
    public static void greetingPerson(String name) {
        System.out.println("Hello, " + name );

        greetingPerson(name);
        
       scanner.close();
        }
    }
}
    

