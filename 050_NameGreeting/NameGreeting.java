import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
        
    //user is enetring name 
    System.out.print("Enter your name: ");
    String name = scan.nextLine();
        
    // Custom method greeting by name
    public static void personName(){
        System.out.println("Hello" + name );
        personName(name);
    }
    Scanner.close;
    }
}

/*

1/3 - Compile/Content
-Doesn't run.
1/1 - Formatting
1/1 - Comments

*/

