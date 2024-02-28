import java.util.Scanner;
public class DoubloonWords{

public class DoubloonWordChecker {
   public static boolean isDoubloonWord(String word) {
       // Convert the word to lowercase for case-insensitive comparison
       word = word.toLowerCase();

       // Create a frequency map to store the count of each letter
       Map<Character, Integer> frequencyMap = new HashMap<>();

       // Iterate through each character in the word
       for (char c : word.toCharArray()) {
           // Increment the count of the character in the frequency map
           frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
       }

       // Check if every letter appears exactly twice
       for (int count : frequencyMap.values()) {
           if (count != 2) {
               return false;
           }
       }

       return true;
   }

   public static void main(String[] args) {
       // Accept user input of a single word
       String userInput = "example";

       // Check if the word is a doubloon word
       boolean isDoubloon = isDoubloonWord(userInput);

       // Print the result
       if (isDoubloon) {
           System.out.println(userInput + " is a doubloon word.");
       } else {
           System.out.println(userInput + " is not a doubloon word.");
       }
   }
}


