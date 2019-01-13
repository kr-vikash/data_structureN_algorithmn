package com.practice.test.threeNumberSumInArray;

import java.util.Arrays;

public class ThreeNumberSumInArray {

    public void sumOfThreeNumber(int arr[], int sum){
           int i,n,p=0;
           int result[];
           int head, tail;
           Arrays.sort(arr);
           n=arr.length;
           tail=n-1;
           for (i=0;i<n;i++){
               head=i+1;
               while (head<tail){
                   if(arr[i] +arr[head]==sum-arr[tail]){
                       System.out.println(arr[i] + " + " + arr[head] + " + " + arr[tail] + "  = " + sum);
                       break;
                   }
                   else if (arr[i] +arr[head] <sum-arr[tail]){
                       head++;
                   }else {
                       tail--;
                   }
               }
           }
    }

    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        ThreeNumberSumInArray threeNumberSumInArray =new ThreeNumberSumInArray();
        threeNumberSumInArray.sumOfThreeNumber(arr,8);
    }

}
