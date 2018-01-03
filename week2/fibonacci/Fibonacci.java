import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    int [] result  = new int[n+1];

    result[0] = 0;
    result[1] = 1;

    for(int i = 2; i < n + 1; i++){
      result[i] = result[i-1] + result[i-2];
    }
    return result[n];
  }
  
  public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        /*while (true) {
            System.out.println("Enter n :");
            long n = scanner.nextLong();
            if (n >= 0) {
                long beginTime = System.currentTimeMillis();
                long fibo = fibonacciFast(n);
                long endTime = System.currentTimeMillis();

                long delta = endTime - beginTime;

                System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
            } else {
                break;

            }
        }*/
        int n = scanner.nextInt();
        System.out.println(calc_fib(n));
        
    }
}
