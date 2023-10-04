

public class Populationproject {
    
    public static void main(String[] args){
        int currentPopulation = 312_032_486;
        int numberOfSecondsInYear = 365 * 24 *60 * 60;
        int birthsPerYear = numberOfSecondsInYear / 7;
        int deathsPerYear = numberOfSecondsInYear / 13;   
        int immigrantsPerYear = numberOfSecondsInYear / 45;
        int ratePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        int populationYearOne = ( currentPopulation +  ratePerYear);
        int populationYearTwo =  (populationYearOne + ratePerYear);
        int populationYearThree = (populationYearTwo+ ratePerYear);
        int populationYearFour =  (populationYearThree + ratePerYear );
        int populationYearFive = (populationYearFour + ratePerYear );


        System.out.println( " firts year population is " + populationYearOne ); 
        System.out.println( " second years population is " + populationYearTwo );
        System.out.println( " third years population is "  +  populationYearThree);
        System.out.println( " fourth years population is "  + populationYearFour);
        System.out.println( " fifth years popluation is " + populationYearFive );

    }
    
}
