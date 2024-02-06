import java.util.Scanner;

public class ZodiacCaculator {


public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
       
        System.out.print("Please enter your birth year: ");
        int birthYear = scan.nextInt();
       
        tellZodiacSign(name, birthYear);
    }
   
    public static void tellZodiacSign(String name, int birthYear) {
        if (birthYear < 1972) {
            System.out.println("Sorry, we can only determine the Zodiac sign for years after 1972.");
        } else {
            String[] zodiacSigns = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
            int index = (birthYear - 1972) % 12;
            String zodiacSign = zodiacSigns[index];
        
           
            System.out.println("Hello, " + name + "! Your Chinese Zodiac sign is: " + zodiacSign);
        }
    } 
    
}

/*

0/5 incomplete

*/