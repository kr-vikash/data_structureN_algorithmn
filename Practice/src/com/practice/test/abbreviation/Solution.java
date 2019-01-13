package com.practice.test.abbreviation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {        
       return getAbbrevMatch(a,b,0);
    }
    static String getAbbrevMatch(String a, String b, int p){
        int m=a.length();
        int n=b.length();// to match
        int i=0,j=0,flag=0;
        if(p==m){
             return "NO";
        }
        while(m>i){
            if(n>j){
                if(Character.toUpperCase(a.charAt(i))==b.charAt(j)){
                     flag++;
                     i++;
                     j++;
                     continue;
                }
            }
            if(Character.isUpperCase(a.charAt(i)))
               return "NO";
            i++;
        }
        if(flag==n)
            return "YES";
        else
           return getAbbrevMatch(a,b,p+1);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

           // bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}
