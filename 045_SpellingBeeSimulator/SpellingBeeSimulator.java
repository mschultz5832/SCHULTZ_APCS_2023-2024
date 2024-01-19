import java.util.Scanner;

public class SpellingBeeSimulator {

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Pick your word for the spellin bee ");
        String choiceWord = scan.nextLine();
        scan.close();

        System.out.println(choiceWord);
        System.out.println("-" + choiceWord); 
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

    
