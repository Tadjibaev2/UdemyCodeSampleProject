package seven;

import java.util.Random;
import java.util.Scanner;

public class arraysss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив");
        Random random = new Random();
        int size = scanner.nextInt();
        int search = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6);
            if (search == array[i]) {
                System.out.println("array [" + array[i] + "]");
            } else System.out.println(search + " не нашли");
        }
    }
}

