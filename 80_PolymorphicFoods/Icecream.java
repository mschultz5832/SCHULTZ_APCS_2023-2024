class Icecream  {
    //varibales for ice ceram 
    private String flavor;
    private boolean isMelted;
 
    //method for two children attributes
    public Icecream(String name, int getCalories, String flavor, boolean isMelted) {
       
        this.flavor = flavor;
        this.isMelted = isMelted;
    }
 
 //method for priting the childresn/individuals attributes
    public void displayCharacteristics() {
        System.out.println(name + " is " + flavor + " " + "of icecream.");
        System.out.println("the ice cream" + isMelted );
    }
 }
 
    

