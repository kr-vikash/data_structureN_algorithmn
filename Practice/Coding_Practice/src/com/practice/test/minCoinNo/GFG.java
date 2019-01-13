package com.practice.test.minCoinNo;

import java.util.Scanner;

/**
 * get min coin and the coin detail from the  results data (it is implimentation of recursion to remove overlapping)
 */
class GFG {

    static int getMinCoinForSum(int[] c, int n, int s){
        int result[][]=new int[n+1][s+1];
        for (int i=1;i<=s;i++){
            result[0][i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                if(c[i-1]<=j && result[i][j-c[i-1]]!=Integer.MAX_VALUE){
                    result[i][j]=Math.min((result[i-1][j]),((result[i][(j-c[i-1])])+1));

                }else{
                    result[i][j]=result[i-1][j];
                }
            }

        }
        if (result[n][s]!=Integer.MAX_VALUE)
            return result[n][s];
        else
            return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int sum= sc.nextInt();
            int n=sc.nextInt();
            int[] c=new int[n];
            for(int i=0;i<n;i++){
                c[i]=sc.nextInt();
            }

            System.out.println(getMinCoinForSum(c,n,sum));
        }
    }

}