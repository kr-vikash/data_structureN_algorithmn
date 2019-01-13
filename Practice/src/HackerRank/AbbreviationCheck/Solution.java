package HackerRank.AbbreviationCheck;

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
       return getAbbrevMatch(a,b);
    }
    static String getAbbrevMatch(String a, String b){
        int m=a.length();
        int n=b.length();// to match
        
        int dp[][]=new int[n+1][m+1];
        int count=0;
//        a=a.toUpperCase();
//        b=b.toUpperCase();
        for(int i=1;i<=n;i++){
            count=0;
            for(int j=1;j<=m;j++){
                if(b.charAt(i-1)==Character.toUpperCase(a.charAt(j-1))){
                    dp[i][j]=dp[i-1][j-1]+1;
                    count++;
                }else if(Character.isLowerCase(a.charAt(j-1))){
                    dp[i][j]=dp[i][j-1];
                }else{
                    count++;
                    dp[i][j]=dp[i][j-1];
                }
            }
            if(dp[i][m]!=i || count>0){
                return "NO";
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);
            System.out.println(result);
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
