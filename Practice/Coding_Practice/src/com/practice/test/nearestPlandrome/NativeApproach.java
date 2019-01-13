package com.practice.test.nearestPlandrome;/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NativeApproach {

    static boolean checkPalndrome(int n){
        String str=Integer.toString(n);
        int l=0;
        int r=str.length()-1;
        while (r>l){
            if (str.charAt(l)!= str.charAt(r)){
                return  false;
            }
            r--;
            l++;
        }
        return true;
    }

    static int getNearestPalndrome(int n){
        int tmp=n;
        while(!checkPalndrome(tmp)){
            tmp--;
        }
        for(int i=n+1;i<2*n-tmp;i++){
            if(checkPalndrome(i)){
                return i;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int n=sc.nextInt();
            System.out.println(getNearestPalndrome(n));
        }
    }
}