package fors;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int i = scanner.nextInt();

        for (int j = 1; j <= 10; j++) {
            System.out.println(i + "x" + j + "=" + (i * j));
        }
    }
}

