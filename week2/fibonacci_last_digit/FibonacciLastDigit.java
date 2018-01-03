import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        int [] result  = new int[n+1];

        result[0] = 0;
        result[1] = 1;

        for(int i = 2; i < n + 1; i++){
            result[i] = (result[i-1] + result[i-2]) % 10;
        }
        return result[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /* while (true) {
            System.out.println("Enter n :");
            int n = scanner.nextInt();
            if (n >= 0) {
                long beginTime = System.currentTimeMillis();
                int fibo = getFibonacciLastDigit(n);
                long endTime = System.currentTimeMillis();

                long delta = endTime - beginTime;

                System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
            } else {
                break;

            }
        }*/

        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

