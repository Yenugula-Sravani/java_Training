package Tasks;

public class PrimeNumberBtw1to100 {
    //Finding Prime number between 1 to 100
    public static void main(String[] args) {
     primeNumbers();
    }
    public static void primeNumbers(){

        int count=0;
        for (int i = 2; i < 100; i++) {
            count=0;
            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }

    }
}
