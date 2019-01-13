package com.practice.test.minCoinNo;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static String offerCheck(int[] c, int n){
        Arrays.sort(c);
        for(int s=c[n-1]+1;s<c[n-1]+3;s++){
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
            if (result[n][s]==Integer.MAX_VALUE)
                return s+"";
        }

        return "Fake Offer!";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }

        System.out.println(offerCheck(c,n));

    }
}