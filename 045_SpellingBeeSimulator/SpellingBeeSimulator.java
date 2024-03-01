import java.util.Scanner;

public class SpellingBeeSimulator {

public static void main(String[] args) {
    //having user enter in word for spelling bee
    Scanner scan = new Scanner(System.in); 
    System.out.println("Pick your word for the spellin bee ");
    String choiceWord = scan.nextLine();
    scan.close();
    // prints out word of choice
    System.out.println(choiceWord);
    //prints out choice word again
    System.out.println(choiceWord); 
    System.out.print(choiceWord + " is spelled like ");
        for (int i= 0; i< choiceWord.length(); i++) {
            System.out.print(choiceWord.substring(i,i +1)); { 
        if (i < choiceWord.length()-1) { 
            System.out.println("-");
        }
            }
        }
    }
}

// added comments tried to fix formatting 
/*

1/1 - Compiles
1/1 - Content
0/1 - Formatting
-The way this is printing out is not how it was requested.
0/1 - Comments

*/
