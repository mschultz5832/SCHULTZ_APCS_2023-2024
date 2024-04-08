import java.util.ArrayList;

public class FavoriteTVShowsTwo {

public static void main(String[] args) {
 // array list  with the string for favorite books
ArrayList<String> fts = new ArrayList <String>();
        
    fts.add(0,new String("the walking dead "));
    fts.add(1,new String("avatar the last airbender"));
    fts.add(2,new String( "NANA"));
        
// for loop thatprints out the favorite books in list 
    for (int i = 0;  i < fts.size(); i++) {
        System.out.println("my favorite tv shows are " + fts.get(i));
        }
                
        }
    }

  
    
