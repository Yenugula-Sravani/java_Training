package Tasks;

/** Display Fibonacci Series
 The Fibonacci series is a series where the next term is the sum of
 the previous two terms. The first two terms of the Fibonacci
 sequence are 0 followed by 1.
 Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34**/
public class Fibonacci_Series {

    public static void main(String[] args) {
        fibonacciSeries();
    }

    public  static  void fibonacciSeries(){

        int prev1=0;
        int prev2=1;
        System.out.print(prev1 +" " +prev2 +" ");
        for (int i = 0; i < 10; i++) {
            int fs=prev1+prev2;
            if (fs>40) break;
            System.out.print(" " +fs);
            prev1=prev2;
            prev2=fs;
        }

    }
}
