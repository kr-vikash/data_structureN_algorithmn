package com.practice.test.Interviews.sameFirstLastDigit;

import java.util.Scanner;

public class Solution {

        public static int getCount(int l, int r){

            int count=0;
            for(int i=l;i<=r;i++){
                String s=Integer.toString(i);
                if(s.charAt(0)==s.charAt(s.length()-1)){
                    count++;
                }
            }
            return count;
        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            while(T-->0){
                int lf=sc.nextInt();
                int rt=sc.nextInt();
                System.out.println(getCount(lf,rt));
            }

        }
}
