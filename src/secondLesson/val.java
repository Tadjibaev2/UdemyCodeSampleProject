package secondLesson;

import java.util.Scanner;

public class val {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value;
        while (true) {
            value = scanner.nextInt();
            if (value >= 0) {
                System.out.println("Введите число");
            }
            if (value < 0) {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}

