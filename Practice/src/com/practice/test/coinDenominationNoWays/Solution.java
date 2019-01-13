package com.practice.test.coinDenominationNoWays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
     int l=c.length-1;
       /// System.out.println("here");
        Arrays.sort(c);
        long p= countWays(c,l,n);
        return p+1;
    }
    static long countWays(long[] c,int l, long n){
        if(n==1)
            return 1;

        long[] table=new long[(int) (n+1)];
        table[0]=1;
        for (int i=1;i<=l;l++){
            for (long j = c[i]; j<=n; j++){
                //coin step back and take the value
                table[(int) j]+=table[(int) (j-c[i])];
            }
        }
        return table[(int) n];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }


        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
        System.out.println(ways);

        //bufferedWriter.close();

        scanner.close();
    }
}
