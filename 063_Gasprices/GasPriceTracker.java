public class GasPriceTracker {

String name;
double price;
 
  
public GasTracker(String name, double price) {
 
this.name = name;
this.price = price;
 }
//method printing out gasbame and current price 
public void nameAndPrice(){
    System.out.println("this is" + name + "gas, and it cost" + price);
}
//method for gas price increase, kind of confused on increaig by .10
public void newGasPrice(double newPrice){
    System.out.println("this is the gas new price " + (price + newPrice));
} 
 // getting name 
public String getName(){
    return this.name;
}
//setting name
public void setName(String name){
    this.name = name;
}
//setting price
public double getPrice(){
    return this.price;
}
//setting price
public double setPrices(){
    this.price = price;
 
    }
 
 }
 

