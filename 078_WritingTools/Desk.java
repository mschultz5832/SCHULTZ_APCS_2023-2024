public class Desk {
   
    public static void main(String[] args) {
    Pen pen = new Pen("ballpoint pen", "pink");
    Pencil pencil = new Pencil("mechanical", "grey");
     
     //printing ou each attribute
    System.out.println(pen.inkColor);
        pen.click();
    System.out.println(pencil.leadType);
        pencil.sharpen();
     
     
        }
     }
     
     
    
