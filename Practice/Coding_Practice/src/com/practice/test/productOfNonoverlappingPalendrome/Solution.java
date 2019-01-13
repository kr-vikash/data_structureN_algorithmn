package com.practice.test.productOfNonoverlappingPalendrome;

import java.io.*;

public class Solution {
    public static int getScore(String s) {
        // Write your code here
        int result=Integer.MIN_VALUE;
        int tmp=0;
        int l=s.length()-1;
        int ar[][]=getPalendromeArray(s);
        for(int i=0;i<l;i++){
            tmp=ar[0][i]*ar[i+1][l];
            result=result<tmp ? tmp:result;
        }
        return result;
    }
    static int[][] getPalendromeArray(String str){
        int l=str.length();
        int arr[][]= new int[l][l];

        for(int i=0;i<l;i++){
            arr[i][i]=1;
        }
        for(int i=1;i<l;i++){
            for(int j=0;j<(l-i);j++){
                if(str.charAt(j)==str.charAt(j+i) &&(j+1!=j+i)){
                    arr[j][j+i]=arr[j+1][j+i-1]+2;
                    continue;
                }else if(str.charAt(j)==str.charAt(j+i)){
                    arr[j][j+i]=2;
                    continue;
                }
                arr[j][j+i] = Math.max(arr[j][j+i-1],arr[j+1][i+j]);
            }
        }

        return arr;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int result = getScore(s);
        System.out.println(result);


        bufferedReader.close();
    }
}

