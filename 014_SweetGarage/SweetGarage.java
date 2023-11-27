public class SweetGarage {
    public static void main(String[] args ) {

    Car coolCar = new Car( 2017, 132_000, "subaru", " outback");
    Car coolCar2 = new Car();
    Car coolCar3 = new Car (2003, 20_000, "BMW", "RollsRoyce", true);
    Car coolCar4 = new Car( 2013, 200_000, "Toyota", "Highlander");
    Car coolCar5 = new Car( 2023, 1_000, "Acuras", "MDX");

    System.out.println("the firts car is a " + coolCar.year + " with " + coolCar.milesDriven + " miles, A " + coolCar.manufacturerName + coolCar.modelName);
    System.out.println( "my " + coolCar2.year + " with " + coolCar2.milesDriven + " miles, is a " + coolCar2.manufacturerName + " , " + coolCar2.modelName);
    System.out.println( " my " + coolCar3.year + " with " + coolCar3.milesDriven + " miles,  is a " +  coolCar3.manufacturerName + "," + coolCar3.modelName );
    System.out.println( " my " + coolCar4.year + " with " + coolCar4.milesDriven + " miles,  is a " +  coolCar4.manufacturerName + "," + coolCar4.modelName );
    System.out.println( " last car is a " + coolCar5.year +  " with " + coolCar5.milesDriven + " miles, a  " + coolCar5.manufacturerName + ","  + coolCar5.modelName);

    coolCar3.engageTurbo();
    coolCar.revEngine();
   }
}

<<<<<<< HEAD
// learned using methods seperatly and going with the variables like certain car being or not being able to rev or having turbo
=======
/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/
>>>>>>> d1a9d5c6aa5ca3699338660748fb4b4d70367db8
