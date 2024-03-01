public class Hand {
    public static void main(String[] args){
        //printing out default pen
        Pen penOne = new Pen();
        penOne.penDescription();
        penOne.inkRemaining();
        penOne.capOrClickey(); 
        penOne.wordsToWrite();
        // printing out pen two 
        Pen penTwo = new Pen("green", "green", 2 , true);
        penTwo.penDescription();
        penTwo.inkRemaining();
        penTwo.capOrClickey(); 
        penTwo.wordsToWrite();
        //printing out pen three
        Pen penThree = new Pen("black", "black", 5, false);
        penThree.penDescription();
        penThree.inkRemaining();
        penThree.capOrClickey(); 
        penThree.wordsToWrite();
        // fourth pen printing out
        Pen penFour= new Pen("purple", "red", 4, true) ;
        penFour.penDescription();
        penFour.inkRemaining();
        penFour.capOrClickey(); 
        penFour.wordsToWrite();
    }
}
// prints out from contructors order of color of ink, color of pen, ink remaining 
//cap or clickey and then words to write. words to write arent in contructpr but is a method pulled?
