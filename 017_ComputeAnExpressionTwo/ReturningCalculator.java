public class ReturningCalculator{
public static void main(String[] args){

double ninePointFive = 9.5;
double fourPointFive = 4.5;
double twoPointFive = 2.5;
double three = 3;
double threePointFive = 3.5;
double fortyFivePointFive = 45.5;

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
<<<<<<< Updated upstream
<<<<<<< HEAD
}
=======
}
/*

0/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/
>>>>>>> 3bd773af1e2bc23670b684f0010410d2c9606e9c
=======
}

/*

0/4 - incomplete

*/
>>>>>>> Stashed changes
