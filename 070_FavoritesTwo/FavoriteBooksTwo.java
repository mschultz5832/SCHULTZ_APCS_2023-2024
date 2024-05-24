import java.util.ArrayList;

public class FavoriteBooksTwo {

public static void main(String[] args) {
// array list  with the string for favorite books
    ArrayList<String> fb = new ArrayList <String>();
// favorite books woth string 
    fb.add(0,new String("little women"));
    fb.add(1,new String("the glass castle"));
    fb.add(2,new String( "pride and prejudice"));

// for loop that prints out the favprite books in list 
    for (int i = 0;  i < fb.size(); i++) {
        System.out.println("my favorite books are " + fb.get(i));
    }
        }
        
        }


    /*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/