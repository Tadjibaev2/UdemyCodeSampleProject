package fors;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int start = 0;
        int finish = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите диапазон чисел");
        start = in.nextInt();
        finish = in.nextInt();

        int i = start;

        while (i <= finish) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Сумма нечетных чисел в диапазоне = " + sum);
    }
}