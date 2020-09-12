package LargerThanN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargerThanN {

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42, 108, 49, 531, 94, 226,  239, 88};
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will show all numbers in the array larger than a number of your choice: ");
        int n = scan.nextInt();
        System.out.println("Numbers larger than " + n + " " + largerThanN(numbers, n));
    }

    public static ArrayList<Integer> largerThanN (int[] numbers, int n) {
        ArrayList<Integer> largerThanN = new ArrayList<>();
        for (int i = 0; i < numbers.length ; i++) {
            if (n < numbers[i]){
                largerThanN.add(numbers[i]);
            }
        }
        return largerThanN;
    }
}
