import java.util.Scanner;

public class CommonDigit {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        //WrapperClass objectName = WrapperClass.valueOf(value);
            int numberOne = 0;
            int numberTwo = 0;
      
         // String one = Interger.toString(numberOne);
        //  String two = Interger.toString(numberTwo);
           
            
        System.out.println("insert a value between 25 and 75" + numberOne);
            numberOne = scan.nextInt();
        
        System.out.println( "insert second value between 25 and 75" + numberTwo);
            numberTwo = scan.nextInt();


            Integer numberOneObject = Integer.valueOf(numberOne);
            Integer numberTwoObject = Integer.valueOf(numberTwo);

            String numberOneString = numberOneObject.toString();
            String numberTwoString = numberTwoObject.toString();
        
                        
            if (numberOneString.substring(2).equals(numberTwoString.substring(2)))
            {
            System.out.println( "they have the same second digit and it is " + numberTwoString.substring(2));
            }
            else
             {
            System.out.println("no");
            }
        

        }
}
            




// Interger i = 123;
// i.toString();


//     System.out.println(sentence.substring(30, 31));
  //  System.out.println(sentence.substring(14, 18));
   // System.out.println(sentence.substring(34));

/*

The prompts on a correct entry are wrong, but these assignments are pretty rough right now,
so I'm going to be merciful and give you full credit.

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/