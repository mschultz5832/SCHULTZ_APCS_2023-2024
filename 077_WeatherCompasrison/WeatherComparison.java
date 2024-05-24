public class WeatherComparison {

    public static void main(String[] args) {
//array list for weather from each day in a week for five years
        boolean[][] averageWeather = {
            {"April 2015:", 60.25, 60.00, 39.92, 46.63, 47.75, 44.89, 41.38 },
            {"April 2016:", 37.13, 33.91, 49.58, 35.46, 34.58, 41.09, 39.07 },
            {"April 2017:", 48.00, 48.72, 48.73, 51.24, 48.83, 46.08, 47.17 },
            {"April 2018:", 25.08, 32.42, 31.67, 25.40, 28.80, 28.13, 24.52 },
            {"April 2019:", 42.33, 42.28, 43.79, 34.21, 43.38, 48.29, 53.71 },
            {"April 2020:", 45.50, 56.08, 37.69, 34.21, 43.38, 48.29, 53.71 }
        };

 	
//printing out the average from all years combined
system.out.println("the average tempertaure from april 1-7 for 2015-2020 is:");
    double totalAverage = caculateTOtalAverage(averageWeather);
    public static double calculateTotalAverage(double[][] arr) {


    double sum = 0;
    int count = 0;
for (double[] yearTemperatures : arr) {
    for (double temperature : yearTemperatures) {
            sum += temperature;
            count++;
        }
    }
    return sum / count;

    }


system.out.println( "here is the average  for each week in april");






system.ou.println("the avergage for each week in april");











public static double calculateAverage(double[] temperatures) {
    double sum = 0;
    for (double temperature : temperatures) {
        sum += temperature;
    }
    return sum / temperatures.length;
}
}
