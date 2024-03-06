public class GasSign {

public static void main(String[] args) {
//gas tracker for uleaded gas        
GasTracker unleaded = new GasTracker("Unleaded", 2.49);
    unleaded.nameAndPrice();
    unleaded.newGasPrice(.10);
        
//gas tracker for plus gas
GasTracker plus = new GasTracker("Plus", 2.79);
    plus.nameAndPrice();
    plus.newGasPrice(.10);
//gas tracker for premium 
GasTracker premium = new GasTracker("Premium", 2.99);
    premium.nameAndPrice();
    premium.newGasCost();
        
        
     }
        
}
    

