
class Phone {
   private String brand;
   private String model;
   private int year;

   // Constructor with brand, model, and year parameters
   public Phone(String brand, String model, int year) {
       this.brand = brand;
       this.model = model;
       this.year = year;
   }

   // Constructor with brand and model parameters
   public Phone(String brand, String model) {
       this.brand = brand;
       this.model = model;
       this.year = 0; // Default year
   }

   // toString method to print basic information
   public String toString() {
       return "Phone: " + brand + " " + model + " (" + year + ")";
   }

   // Method to make a call
   public void makeCall(String number) {
       System.out.println("Calling " + number + " from " + brand + " " + model);
   }

   // Method to send a message
   public void sendMessage(String message) {
       System.out.println("Sending message: " + message);
   }
}
