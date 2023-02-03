package start;

import java.util.Scanner;

public class ravenstvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first value :");
        int firstValue = scanner.nextInt();
        System.out.println("Input second value :");
        int secondValue = scanner.nextInt();
        System.out.println("Input third value :");
        int thirdValue = scanner.nextInt();
        if (firstValue != secondValue && firstValue != thirdValue) {
            System.out.println("Нет одинаковых чисел" );
        }
        if (secondValue == thirdValue & secondValue == firstValue) {
            System.out.println("Все числа одинаковые");
        }
        if (firstValue == secondValue & firstValue!= thirdValue) {
            System.out.println("Два числа одинаковые" );
        }
        if (secondValue == thirdValue & secondValue!= firstValue) {
            System.out.println("Два числа одинаковые" );
        }
        if (firstValue == thirdValue & firstValue!=secondValue) {
            System.out.println("Два числа одинаковые" );
        }



    }
}

