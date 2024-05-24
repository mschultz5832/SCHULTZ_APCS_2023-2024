<<<<<<< HEAD
import java.util.Scanner;
import java.util.Random;

public class SelectionSortSomeIntegers {

public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    // user entering there number
    System.out.print("Enter number: ");
    int numIntegers = scanner.nextInt();
   

    int[] randomIntegers = new int[numIntegers];
    
        for (int i = 0; i < numIntegers; i++) {
        randomIntegers[i] = random.nextIn();
    
    
    int[] randomIntegers = new int[numIntegers];
    
        for (int i = 0; i < numIntegers; i++) {
            randomIntegers[i] = random.nextInt(1000) + 1;
        }
       
   
    System.out.print("The random ints are: ");
        for (int num : randomIntegers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        selectionSort(randomIntegers);
        System.out.print("Sorted Integers: ");
        for (int num : randomIntegers) {
            System.out.print(num + " ");
    }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
                }
            }
        }
    }
 
 
    
    
   


    
}
 
}
=======
/* 0/5 incomplete */
>>>>>>> b82768116e123ba204017021c4737f9074fdb10d
