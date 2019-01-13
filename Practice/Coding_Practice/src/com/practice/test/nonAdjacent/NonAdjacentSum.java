package com.practice.test.nonAdjacent;

public class NonAdjacentSum {
    public static int getMaxNonAdjSubArraySum(int[] arr, int n){
        int inc, exc=0,temp=0;
        inc=arr[0];
        for(int i=0;i<arr.length;i++){
            temp=exc +arr[i];
            exc=Math.max(exc,inc);
            inc=temp;

        }
        return Math.max(exc,inc);
    }

    public static void main(String[] args) {
           String st="sjhbd";
           char a=Character.toUpperCase(st.charAt(0));
    }
}
