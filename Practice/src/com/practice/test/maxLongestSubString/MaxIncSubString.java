package com.practice.test.maxLongestSubString;

/**
 * length of the maximum substring possible in a array in increasing order
 */

public class MaxIncSubString {

    public int max_len;

    // get the length of the maximum increasing substring
    public int getMax_len(int arr[], int n){
        // when n=1 return
        if(n==1){
            return 1;
        }
        int i, res;
        int maxLenValue=0;
        for (i=1;i<n;i++){
            res =getMax_len(arr,i);
            if (arr[i-1]<arr[n-1] && res+1>maxLenValue){
                maxLenValue =res +1;
            }
        }

        if (max_len < maxLenValue)
            max_len =maxLenValue; // update to global variable  the  maxium substring
        // max substring for the case;
        return  maxLenValue;
    }
    public void len(int arr[], int n){

        getMax_len(arr, n);
        //return max_len;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        MaxIncSubString maxIncSubString = new MaxIncSubString();
        maxIncSubString.len(arr,n);

        System.out.println(maxIncSubString.max_len);

    }
}
