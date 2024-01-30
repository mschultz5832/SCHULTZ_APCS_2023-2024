import java.util.Random;

public class PowerAttack {

public static void main(String[] args){

    Random random = new Random();

    int strength = 3;
    int armorClass = 11;
    int hitPoints = 13;
    int minDamage = 4;
    int maxDamage = 6;
              
    while (hitPoints > 0) {
     int attackRoll = random.nextInt(10) + 1 + strength;
                
    if (attackRoll >= armorClass) {
    int damage = random.nextInt(maxDamage - minDamage + 1) + minDamage;
    hitPoints -= damage;
    System.out.println("You hit the monster with " + damage + " damage!");
                    
     if (hitPoints <= 0) {
         System.out.println("wow you defeated the monster ");
         }
     else {
        System.out.println("not quite yet");
         }


            }
        }
    }



    
}


/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/