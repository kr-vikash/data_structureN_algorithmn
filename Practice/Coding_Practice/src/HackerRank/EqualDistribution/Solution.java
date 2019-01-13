package HackerRank.EqualDistribution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equal function below.
    static int equal(int[] A) {
        int minVal = A[0];
        int N=A.length;
            for(int i = 1; i < N; ++i){
                if (A[i] < minVal){
                    minVal = A[i];
                }
            }
            
            int minCount = Integer.MAX_VALUE;
         if(N==1){
             return 0;
         }
            for(int i = 0; i <= 5; ++i){
                int count = 0;
                for(int j = 0; j < N; ++j){
                    int V = (A[j] - (minVal - i));
                    count += V/5 + (V %= 5)/2 + (V & 1);
                }
                if (count < minCount){
                    minCount = count;
                }
            }
        return minCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);


            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
