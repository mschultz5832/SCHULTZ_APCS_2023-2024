public class ReturningCalculator{
public static void main(String[] args){

double ninePointFive = 9.5;
double fourPointFive = 4.5;
double twoPointFive = 2.5;
double three = 3;
double threePointFive = 3.5;
double fortyFivePointFive = 45.5

returningCaculator calc = new ReturningCalculator();

double firtsEquation = calc.doubleMultiplier(ninePointFive, fourPointFive);
double secondEquation = calc.doubleMultiplier(twoPointFive, three);
double thirdEquation = calc.doubleMultiplier(fortyFivePointFive, threePointFive);
double firtsEquationMinussecondEquation = calc.doubleSubtractor(firtsEquation, secondEquation);
double firtsEquationMinussecondEquationDividedBythirdEquation = calc.divider(firtsEquationMinussecondEquation, thirdEquation);

    public int integerAdder(int x, int y)
    {
        return x+y;
    }

    public double doubleAdder(double x, double y)
    {
        return x+y;
    }
    
    public int integerSubtractor(int x, int y)
    {
        return x-y;
    }

    public double doubleSubtractor(double x, double y)
    {
        return x-y;
    }

    
    public int integerMultiplier(int x, int y)
    {
        return x*y;
    }

    public double doubleMultiplier(double x, double y)
    {
        return x*y;
    }

    public double divider(double x, double y)
    {
        return x/y;
    }
<<<<<<< HEAD
  }
}

// adding on from compute expression 1, but using returning cacualtor and multiplier in java for euqation. 
=======


/*

0/4 - incomplete

*/
>>>>>>> d1a9d5c6aa5ca3699338660748fb4b4d70367db8
