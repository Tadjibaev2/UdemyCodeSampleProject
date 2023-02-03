package start;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first value :");
        int firstValue = scanner.nextInt();
        System.out.println("Input second value :");
        int secondValue = scanner.nextInt();
        System.out.println("Input third value :");
        int thirdValue = scanner.nextInt();
        System.out.println("Input fours value :");
        int foursValue = scanner.nextInt();
        System.out.println("Input fives value :");
        int fivesValue = scanner.nextInt();
        if (firstValue > secondValue & firstValue > thirdValue & firstValue > foursValue & firstValue > fivesValue) {
            System.out.println("This value max ->" + firstValue);
        }
        if (secondValue > thirdValue & secondValue > firstValue & secondValue > foursValue & secondValue > fivesValue) {
            System.out.println("This value max ->" + secondValue);
        }
        if (thirdValue > secondValue & thirdValue > firstValue & thirdValue > foursValue & thirdValue > firstValue) {
            System.out.println("This value max ->" + thirdValue);
        }
        if (foursValue > secondValue & foursValue > firstValue & foursValue > thirdValue & foursValue > fivesValue) {
            System.out.println("This value max ->" + foursValue);
        }
        if (fivesValue > secondValue & fivesValue > thirdValue & fivesValue > foursValue & fivesValue > firstValue) {
            System.out.println("This value max ->" + fivesValue);
        }

    }
}

