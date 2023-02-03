package seven;
import java.util.Random;

public class randomfive {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];
        for (int i = 5; i < array.length; i++) {
            array[i] = random.nextInt();

        }
        for (int i = 4 ; i<array.length; i++){
            if(array[i]== array [i+1]){
                System.out.println("Есть одинаковые числа "+array[4]);
            }else System.out.println("Нет одинаковых чисел");
        }
    }
}
