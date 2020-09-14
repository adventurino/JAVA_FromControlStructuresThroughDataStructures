package GasPrices;
/*
In the student sample for this book you will find a text file named 1994 weekly gas averages.txt. The file contains 52 lines of text that represent average weekly gas. Line one contains average price for week one and line 2 contains the average price for week 2 etc.
Write a program that reads the gas prices from the file into an array of an ArrayList. The program should do the following.

Display the lowest average price of the year, along with the week number for that price, and the name of the month which it occurred.
Display the highest average price of the year, along with the week number for that price, and the name of the month which it occurred.
Display the average gas price for each month.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GasPriceProgram {
    public static void main(String[] args) {
        File Price1994 = new File("D:\\School\\FA2020\\Java244\\Code\\Week4Practice\\src\\GasPrices\\Prices.txt");
        ArrayList<Double> gasPrices1994 = new ArrayList<>();

        gasPrices1994 = getPriceList(Price1994);
        System.out.println("Lowest " + getLowestPrice(gasPrices1994));
        System.out.println("Highest " + getHighestPrice(gasPrices1994));

        System.out.println("Monthly averages " + Arrays.toString(monthlyAverages(gasPrices1994)));

    }

    public static ArrayList<Double> getPriceList(File Prices) {

        ArrayList<Double> GasPrices = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(Prices);
            while (myReader.hasNextLine()) {
                double data = myReader.nextDouble();
                GasPrices.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return GasPrices;
    }

    public static String getLowestPrice(ArrayList<Double> list){
        double lowest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (lowest > list.get(i)){
                lowest = list.get(i);
            }
        }
        return "Lowest price was " + lowest + " dollars, at week " + list.indexOf(lowest);
    }

    public static String getHighestPrice(ArrayList<Double> list){
        double highest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (highest < list.get(i)){
                highest = list.get(i);
            }
        }
        return "Lowest price was " + highest + " dollars, at week " + list.indexOf(highest);
    }

    public static double[] monthlyAverages(ArrayList<Double> list) {
        ArrayList<Double> asDays = new ArrayList<>();
        double[] monthlyAverages = new double[12];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 7; j++) {
                asDays.add(list.get(i));
            }
        }

        for (int i = 0; i < monthlyAverages.length ; i++) {
            double sum = 0;
            double average = 0;
            for (int j = 0; j < daysInMonth(i) ; j++) {
                sum+= asDays.get(j);
            }
            average = sum/daysInMonth(i);
            monthlyAverages[i] = average;
        }
        return monthlyAverages;
    }

    public static int daysInMonth(int month) {
        switch (month) {
            //case 0, 2, 4, 6, 7, 9, 11: return 31;
            case 0: return 31;
            case 1: return 28;
            case 2: return 31;
            case 4: return 31;
            case 6: return 31;
            case 7: return 31;
            case 9: return 31;
            case 11: return 31;
            case 3: return 30;
            case 5: return 30;
            case 8: return 30;
            case 10: return 30;
        }
        return -1;
    }
}
