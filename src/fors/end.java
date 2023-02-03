package fors;

import java.util.Scanner;

public class end {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value;
        int i = 0;
        while (true) {
            value = scanner.nextInt();
            if (value >= 1) {
                System.out.println("Введите число");
            }
            if (value <= 0) {
                System.out.println("До свидания!");
                break;
            }
            i = i + Integer.parseInt(String.valueOf(value));
        }
        System.out.println("Сумма введеных чисел = " + i);

    }
}
