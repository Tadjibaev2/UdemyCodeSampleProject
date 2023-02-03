package secondLesson;

import java.util.Scanner;

public class valuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int value = scanner.nextInt();
        if(value== 0 & value < 10){
            System.out.println("Одна цифра");
        }
        if(value== 10 & value < 100){
            System.out.println("Две цифры");
        }
        if(value== 100 & value < 1000){
            System.out.println("Три цифры");
        }
        if(value== 1000 & value < 10000){
            System.out.println("Четыре цифры");
        }
        if(value== 10000 & value < 100000){
            System.out.println("Пять цифер");
        }
    }
}
