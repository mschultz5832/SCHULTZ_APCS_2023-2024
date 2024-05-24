public class TierList {

public static void main(String [] args) {
//2D array of movie tier
String [][] studioGihbliMovies = { 

    {"tier 1 :", "howls moving castle","ponyo","spirited away", "kikis delivery service "},
    {"tier 2 :", "my neighbor totoro","the cat returns","the tale of the princess kaguya", "princess mononoke"},
    {"tier 3 :", "the boy and the heron ","the secret world of arriety","the wind rises", "when marnie was there"},
    {"tier 4 :", "porco rosso","from up on a poppy hill","ocean waves", "tales from earthsea"},
    {"tier 5 :", "pom poko","whisper of the heart","castle in the sky", "grave of the fireflies"},
};
// priting out beginning senetce of studio gihbli movies
System.out.println("the best studioghibli movies ranked in order :");
//for loop that prints out row and colum of movies
for(int row = 0; row < studioGihbliMovies.length; row++) {

    for (int column = 0; column < studioGihbliMovies[row].length; column++) {
        System.out.print(studioGihbliMovies[row][column] + " " + " | " + "");
    }

    System.out.println();
    System.out.println();
}   

}
}

 