import java.util.Scanner;

public class BlackJackOne {

public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random card = new Random();

    int cardValue = (int)(Math.Random() * 10) +1;
    int cardValueTwo = (int)(Math.Random () * 10) + 1;
    int cardValueThree = (int)(Math.Random() *10) +1;
   
    //dealing plyer cards 

    System.out.print("your firts card is " + cardValue ) ;
    System.out.println( "your second card value is " + cardValueTwo );

     int cardTotal = cardValue + cardValueTwo ; 
     int cardtotalTwo = cardValue + cardValueTwo + cardValueThree ; 
        
    // players two cards with card totat


       System.out.println("First Cards: " + cardValue + ", " + cardValueTwo);
       System.out.println("Total: "+ cardTotal);

       System.out.println("would you like to hit or stay ");

       int hit = cardValueThree;


if ( hit);
{
    System.out.print( cardtotalTwo);
} 

    
 if (Math.Random = 1)
    {
        System.out.println("your card is ace and the value is 1 ");
    }
    else if(Math.Random = 2)
    {
        System.out.println("your card value is two  ");
    }
    else if (Math.Random = 3)
    {
        System.out.println("your card value is three ");
    }
    else if (Math.Random = 4)
    {
     System.out.println("your card value is four ");
    }
    else if (Math.Random = 5 )
    {
        System.out.println( " your card value is five  ");
    }
    else if(Math.Random = 6)
    {
        System.out.println("your card value is six ");
    }
    else if (Math.Random = 7)
    {
        System.out.println("ypur card value is seven ");
    }
    else if(Math.Random = 8)
    {
     System.out.println("your card value is eight ");
    }
    else if( Math.Random = 9)
    {
        System.out.println( " your card value is nine ");
    }
    else if( Math.Random = 10 )
    {
        System.out.println( "your card value is 10" );
     }


 
    }
}

/*

0/1 - Compiles
-Doesn't compile
0/1 - Content
-Isn't complete
0/1 - Formatting
-Formatting is way off.
1/1 - Comments
-One comment that's filled with spelling errors? I guess I'll take it?

*/