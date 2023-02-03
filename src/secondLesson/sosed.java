package secondLesson;

import java.util.Scanner;

public class sosed {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        boolean flag = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Есть!");
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Нету!");
    }
}
