import java.util.Scanner;

public class SimpleCounter {
   
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int  number = 0;
   
        //user entering number 
        System.out.println( "enter a number : " );
        int i = 0;
        number = scan.nextInt();
    // counting up from number to inputed number 
        while ( i < number){
            System.out.println ( i);
            i++;
               scan.close();
        }
    }
}

/*

0/4 incomplete

*/