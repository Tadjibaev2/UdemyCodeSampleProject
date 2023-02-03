package arrayss;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ВВедите длину массива");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((190 - 160) + 1) + 160;
//            System.out.println("array [" + i + "]" + " = " + array[i]);

            if (array[i] > 180 && array[i] < 190) {
                count++;
                System.out.println("Height [" + i + "]" + "=" + array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Count = " + count);

//        System.out.println(Arrays.toString(array));


    }
}
