import java.util.*;
import java.io.*;

public class MaxPairWise{
    static int  getMaxPairWise(int[] numbers){
        int result = 0;
        int n = numbers.length;
        for(int i = 1; i< n; ++i){
            for(int j= i+1; j<n;++j){
                if((numbers[i] * numbers[j])> result){
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    static long getMaxPairWiseFast(int [] numbers){
        int n = numbers.length;

        int maxIndex1 = -1;
        for(int i = 0 ; i< n;++i){
            if(maxIndex1 == -1 || numbers[i] > numbers[maxIndex1]){
                maxIndex1 = i;
            }
        }

        int maxIndex2 = -1;
        for(int j =0; j < n; ++j){
            if((j != numbers[maxIndex1]) && (maxIndex2 == -1 || numbers[j] > numbers[maxIndex2])){
                maxIndex2 = j;
            }
        }

        return ((long)(numbers[maxIndex1])) * numbers[maxIndex2];
    } 

    public static void main(String[] args) {
       FastScanner scan = new FastScanner(System.in);
       int n  = scan.nextInt();
       int [] numbers = new int[n];
       for(int i= 0; i< n;i++){
           numbers[i] = scan.nextInt();
       }

       System.out.println(getMaxPairWiseFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}