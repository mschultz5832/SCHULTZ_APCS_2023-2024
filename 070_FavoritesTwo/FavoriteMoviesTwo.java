import java.util.ArrayList;

public class FavoriteMoviesTwo {

public static void main(String[] args) {
// array list  with the string for favorite movies
    ArrayList<String> fm = new ArrayList <String>();

    fm.add(0,new String("hunger games"));
    fm.add(1,new String("howls moving castle"));
    fm.add(2,new String( "silence of the lambs"));

// for loop thatprints out the favorite movies in list 
    for (int i = 0;  i < fm.size(); i++) {
        System.out.println("my favorite movies are " + fm.get(i));
    }
    }
        }
        
 

    

