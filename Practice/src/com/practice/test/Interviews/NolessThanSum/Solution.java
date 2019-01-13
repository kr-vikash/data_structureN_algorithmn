package com.practice.test.Interviews.NolessThanSum;



/**
 * Find the count of pairs less than a sum
 */
public class Solution {

    static  int getCount(int[] ar, int sum){
        int l=ar.length;
        int lt=0;
        int rt=l-1;
        int count=0;
        while (lt<rt){
            if((ar[lt]+ar[rt])<sum){
                count=count+rt-lt;
                lt++;
            }else{
                rt--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] ar={1,2,3,4,5,6,7};

        System.out.println(getCount(ar,8));
    }
}
