package secondLesson;

import java.util.Scanner;

public class secondlesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = scanner.nextInt();
        System.out.println("Введите второе число :");
        int b = scanner.nextInt();
        while (a <= b) {
            System.out.println(a * a);
            a++;
        }

    }

}
