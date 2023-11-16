public class LorumIpsumStringMethods {

public static void main(String[] args){
    String letter = "q";
    String letterTwo = "z";
    String letterThree = "x";

    String name = "consectetur adipiscing elit ";
    System.out.println( name.length());
    String nameTwo = "consectetur adipiscing";
    System.out.println ( nameTwo.length());
    String nameUpperCase = nameTwo.toUpperCase();
    System.out.println(nameUpperCase);
    String nameLowerCase = nameTwo.toLowerCase();
    System.out.println(nameLowerCase);
    System.out.println ( "Is " + name + " equal to " + nameTwo + "? " + name.equals(nameTwo));
    System.out.println( "is " + nameTwo + " equal to " + nameTwo + "? " + nameTwo.equals(nameTwo));
    System.out.println("Does the word " + nameTwo + " have the letters " + letter + "? " + nameTwo.contains(letter));
    System.out.println (nameTwo.replace("o" , "x"));
    System.out.println("Does the word " + nameTwo + " have the letters " + letterTwo + "? " + nameTwo.contains(letterTwo));
    
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/