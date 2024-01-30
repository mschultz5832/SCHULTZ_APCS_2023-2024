import java.util.Scanner;
public class BasicNestedPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter your character: ");
        String userCharacter = scan.nextLine();

         if (userCharacter.length() != 1) {
            System.out.println("this does not work, please enter only a single character.");
            // user must putin a single letter/number 
        }
        System.out.println("Enter the number of rows you want, ls than 20 : ");
        int howManyRows = scan.nextInt();
        // if its more than 1, it uses firts letter as charcter
        
       
        System.out.print("Enter the number of columns you want, less than 20: ");
        int howManyColumns = scan.nextInt();

        for (int i = 0; i < howManyRows; i++) {
            for (int x = 0; x < howManyColumns; x++) { 
                System.out.print(userCharacter.substring(0, 1));
            }
            System.out.println(); 
        }
        scan.close();
    }
}

// user inputs there characters, and it sues that withthe number of rows and colums they choose tomakeinto a table for them. 

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/