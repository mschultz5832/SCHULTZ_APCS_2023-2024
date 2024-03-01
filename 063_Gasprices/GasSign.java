public class GasSign {

public static void main(String[] args) {
        
GasTracker unleaded = new GasTracker("Unleaded", 2.49);
    unleaded.nameAndPrice();
    unleaded.newGasPrice(.10);
        
        
GasTracker plus = new GasTracker("Plus", 2.79);
    plus.nameAndPrice();
    plus.newGasPrice(.10);
        
GasTracker premium = new GasTracker("Premium", 2.99);
    premium.nameAndPrice();
    premium.newGasCost();
        
        
     }
        
}
    

