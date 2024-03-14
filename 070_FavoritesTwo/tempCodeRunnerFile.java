import java.util.ArrayList;

public class FavoriteBooksTwo {

public static void main(String[] args) {
// array list  with the string for favorite books
    ArrayList<String> fb = new ArrayList <String>();

    fb.add(0,new String("little women"));
    fb.add(1,new String("the glass castle"));
    fb.add(2,new String( "pride and prejudice"));

// for loop thatprints out the favprite books in list 
    for (int i = 0;  i < fb.length; i++) {
        System.out.println("my favorite books are " + fb[i]);
        }
        
        }
    }

    