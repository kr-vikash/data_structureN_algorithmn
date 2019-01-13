package com.practice.test.nearestPlandrome.bestapproach;
/**
 * Three case we can take for this problem
 */

import java.util.Scanner;

public class NearestPlandrome {
    //9s
    private static boolean allNine(String str){
        //String str= Integer.toString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='9'){
                return false;
            }
        }
        return true;
    }
    private static int leftMirror(String str){
          int l=0,r=str.length()-1;
          StringBuilder stringBuilder=new StringBuilder(str);
          while (r>l){
             stringBuilder.setCharAt(r,stringBuilder.charAt(l));
             l++;
             r--;
          }
          return  Integer.parseInt(stringBuilder.toString());
    }
    private static int rightMirror(String str) {
        int l = 0, r = str.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(str);
        while (r > l) {
            stringBuilder.setCharAt(l, stringBuilder.charAt(r));
            l++;
            r--;
        }
        return Integer.parseInt(stringBuilder.toString());
    }
    private static int getNearestPlandrome(int n){
        //if all no is 9
        String str= Integer.toString(n);

        if (allNine(str)){
               return n+2;
           }else{

           }
       return 0;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int n=sc.nextInt();
            System.out.println();
        }
    }
}
