package seven;

import java.util.Random;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число");
        int size = 5;
        int[] numbers = new int[size];
        int i = 0;
        while (numbers[i] != scanner.nextInt()) {
            i++;
        }
        if (numbers[i] == scanner.nextInt()) {
            System.out.println("A[" + numbers[i] + "] =" + scanner.nextInt());
        } else System.out.println("Не нашли");
    }
}
