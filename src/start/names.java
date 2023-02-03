package start;

import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст Антона: ");
        int Anton = scanner.nextInt();
        System.out.print("Введите возраст Бориса: ");
        int Boris = scanner.nextInt();
        System.out.print("Введите возраст Виктора: ");
        int Victor = scanner.nextInt();

        if(Anton>Boris & Anton > Victor){
            System.out.println("Антон старше всех");
        }
        if(Boris> Anton & Victor> Anton){
            System.out.println("Борис старше всех");
        }
        if(Victor> Boris & Victor> Anton){
            System.out.println("Виктор старше всех");
        }
        if(Anton==Boris & Boris> Victor){
            System.out.println("Антон и Борис старше всех");
        }
        if(Boris == Victor & Boris> Anton){
            System.out.println("Борис и Виктор старше всех");
        }
        if(Victor== Anton & Victor> Boris){
            System.out.println("Виктор и Антон старше всех");
        }
    }
}

