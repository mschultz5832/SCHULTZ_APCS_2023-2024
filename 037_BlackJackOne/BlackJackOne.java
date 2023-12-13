import java.util.Scanner;

public class BlackJackOne {

public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random card = new Random();

    int cardValue = (int)(Math.Random( 52));
    int cardValueTwo = (int)(Math.Random (52));
    int cardValueThree = (int)(Math.Random(52));
    //dealing plyer cards 

    System.out.print("your firts card is " + cardValue ) ;
    System.out.println( "your second card value is " + cardValueTwo );

     int cardTotal = cardValue + cardValueTwo ; 
     int cardtotalTwo = cardValue + cardValueTwo + cardValueThree ; 
        
    // players two cards with card total


       System.out.println("First Cards: " + cardValue + ", " + cardValueTwo);
       System.out.println("Total: "+ cardTotal);

       System.out.println("would you like to hit or stay ");

       int hit = cardValueThree;

       if ()
{
    System.out.print( cardtotalTwo);
}
else 
{
    System.out.print( cardTotal);
}

    
 if (Math.random = 1)
    {
        System.out.println("your card is ace and the value is 1 ");
    }
    else if(Math.random = 2)
    {
        System.out.println("your card value is two  ");
    }
    else if (Math.random = 3)
    {
        System.out.println("your card value is three ");
    }
    else if (Math.random = 4)
    {
     System.out.println("your card value is four ");
    }
    else if ( Math.random = 5 )
    {
        System.out.println( " your card value is five  ");
    }
    else if(Math.random = 6)
    {
        System.out.println("your card value is six  ");
    }
    else if (Math.random = 7)
    {
        System.out.println("ypur card value is seven ");
    }
    else if (Math.random = 8)
    {
     System.out.println("your card value is eight ");
    }
    else if ( Math.random = 9)
    {
        System.out.println( " your card value is nine  ");
    }
    else if( Math.random = 10 )
    {
        System.out.println(  "your card value is 10" );
     }


 
    }
}