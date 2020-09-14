package RainfallClass;

public class Rainfall {
    public static final double[] rainfall = {2.34, 2.29, 2.58, 2.34, 2.48, 3.19, 3.48, 3.57, 5.95, 3.56, 2.95, 2.76};

    public static void main(String[] args) {
        System.out.println("A program for every Pittsburgher's favorite: RAIN! \n\n" +
                "Figures are GREATEST DAILY PRECIPITATION BY MONTH\n" +
                "(24 hour precipitation totals), so this would represent a \n" +
                "disastrous year where every month had the highest rainfall on record!!\n\n");

        System.out.println("Total Rainfall...................." + totalYearlyRainfall() +"\"");
        System.out.println("Average Monthly Rainfall.........." + averageMonthlyRainfall() +"\"");
        System.out.println("Month with most rain.............." + mostRain());
        System.out.println("Month with least rain............." + leastRain());

        System.out.println("\nSourced from: https://www.weather.gov/media/pbz/records/prec.pdf \\n\" +");


    }

    public static double totalYearlyRainfall() {
        double totalRainFall = 0;
        for (int i = 0; i < rainfall.length; i++) {
            totalRainFall += rainfall[i];
        }

        return totalRainFall;
    }

    public static double averageMonthlyRainfall(){
        double average = totalYearlyRainfall() / rainfall.length;
        return average;
    }

    public static String mostRain(){
        int most = 0;
        double highestNumber = rainfall[0];

        for (int i = 0; i < rainfall.length; i++) {
            if (highestNumber < rainfall[i]){
                highestNumber = rainfall[i];
                most = i;
            }
        }

        return monthAsString(most);
    }

    public static String leastRain(){
        int least = 0;
        double lowestNumber = rainfall[0];

        for (int i = 0; i < rainfall.length; i++) {
            if (lowestNumber > rainfall[i]){
                lowestNumber = rainfall[i];
                least = i;
            }
        }

        return monthAsString(least);
    }

    public static String monthAsString(int month){
        month += 1;
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Invalid Month Error";
    }

}
