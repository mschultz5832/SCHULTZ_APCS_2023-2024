import java.util.Scanner;

<<<<<<< HEAD
    public class EvenOrOdd {

    public static void main(String[]args);{


        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = reader.nextInt();
=======
public class EvenOdd {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.print("Enter a number: ");
    
int number = scan.nextInt();
>>>>>>> 3bd773af1e2bc23670b684f0010410d2c9606e9c

        if(number % 2 == 0)
            System.out.println(number + " is even");
        else
<<<<<<< HEAD
            System.out.println(number + " is odd");
    
}

}
=======
            System.out.println(num + " is odd");
    
    }
}

// using if else staments with prompts to tell i users number is even or oddx
>>>>>>> 3bd773af1e2bc23670b684f0010410d2c9606e9c
