package seven;

public class izi {
    public static void main(String[] args) {
        int i,j;
        boolean isprime;
        for (i=2;i<1000;i++){
            isprime=true;

            for(j=2;j<=i/j;j++)
                if ((i%j)==0)
                    isprime=false;
            if(isprime)
                System.out.println(i+"-простое число");
        }
    }
}
