public class Pen{
    // four class variables
    String colorOfInk;
    String colorOfPen;
    int inkRemaining; 
    Boolean capOrClickey; 
    
    colorOfInk = "pink"; 
    colorOfPen = "Black";
    inkRemaining = 1;
    capOrClickey = true; 
        }
    // contructor with defualt pen
    public Pen(String inkColor, String penColor, int inkRemaining, Boolean capOrClickey){
        this.colorOfInk = colorOfInk; 
        this.colorOfPen = colorOfPen;
        this.inkRemaining = inkRemaining;
        this.capOrClickey = capOrClickey;
    
        }
    // four methods
    public static void main(String[] args) {}
    // printing out pen description with color of pen and ink
    public static void penDescription(){
    System.out.println("this pen is" + colorOfPen + "" + "and has" + "" + colorOfInk + "" + "ink");
        }
    //printing out pens ink remaing
    public static void inkRemaining(){
        System.out.println("pen has" + inkRemaining + "" + "ml left");
       }
       //method printing out words to write
    public static void wordsToWrite(){
        System.out.println("Wazzup");
        } 
        //if else statement printing out that true it is a clickey pen and false is a cap pen
    public static void capOrClickey(){
            if(capOrClickey){
                capOrClickey = true;
                System.out.println("The pen is clicked out ");
            }
            else{
                System.out.println("you have taken the cap off ");
            }
    }
