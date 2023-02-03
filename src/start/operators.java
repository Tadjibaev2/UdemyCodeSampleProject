package start;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first value :");
        int firstValue = scanner.nextInt();
        System.out.println("Input second value :");
        int secondValue = scanner.nextInt();
        System.out.println("Input third value :");
        int thirdValue = scanner.nextInt();
        if (firstValue > secondValue && firstValue > thirdValue) {
            System.out.println("This value max ->" + firstValue);
        }
        if (secondValue > thirdValue & secondValue > firstValue) {
            System.out.println("This value max ->" + secondValue);
        }
        if (thirdValue > secondValue & thirdValue > firstValue) {
            System.out.println("This value max ->" + thirdValue);
        }

    }
}