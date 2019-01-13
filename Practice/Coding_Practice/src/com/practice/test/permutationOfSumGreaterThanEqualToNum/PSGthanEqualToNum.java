package com.practice.test.permutationOfSumGreaterThanEqualToNum;
import java.io.*;
public class PSGthanEqualToNum {

        // Return number of ways to which numbers
        // that are greater than given number can
        // be added to get sum.
        static int numberofways(int n, int m)
        {
            int dp[][]=new int[n+2][n+2];

            dp[0][n + 1] = 1;

            // Filling the table. k is for numbers
            // greater than or equal that are allowed.
            for (int k = n; k >= m; k--) {

                // i is for sum
                for (int i = 0; i <= n; i++) {

                    // initializing dp[i][k] to number
                    // ways to get sum using numbers
                    // greater than or equal k+1
                    dp[i][k] = dp[i][k + 1];

                    // if i > k
                    if (i - k >= 0)
                        dp[i][k] = (dp[i][k] + dp[i - k][k]);
                }
            }

            return dp[n][m];
        }

        // Driver Program
        public static void main(String args[])
        {
            int n = 3, m = 1;
            System.out.println(numberofways(n, m));
        }


}
