class Icecream  {
    
    private String flavor;
    private boolean isMelted;
 
 
    public Icecream(String name, int getCalories, String flavor, boolean isMelted) {
       
        this.flavor = flavor;
        this.isMelted = isMelted;
    }
 
 
    public void displayCharacteristics() {
        System.out.println(name + " is " + flavor + " " + "of icecream.");
        System.out.println("the ice cream" + isMelted );
    }
 }
 
    

