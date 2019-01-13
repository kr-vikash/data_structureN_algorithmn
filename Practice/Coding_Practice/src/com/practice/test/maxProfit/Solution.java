package com.practice.test.maxProfit;

import java.util.ArrayList;

public class Solution {
    int maxProfit(int money, int[] ar){
        ArrayList<Integer> buy=new ArrayList<>();
        ArrayList<Integer> sell=new ArrayList<>();
        int l=ar.length;
        int i=0;
        while (i<l-1) {
            while ((i < l-1) && (ar[i+1] <= ar[i]))
                i++;
            if (i==l-1)
                break;
            buy.add(ar[i]);
            while ((i < l-1) && (ar[i+1] >= ar[i]))
                i++;
            sell.add(ar[i]);

        }
        int maxP=0;
        int n=money;
        for (int j=0;j<buy.size();j++){
            int m=n/buy.get(j);
            n+=m*(sell.get(j)-buy.get(j));
        }

        return n-money;
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,2,7,37,90,45,4};
        int money=40;
        Solution solution=new Solution();
        System.out.println(solution.maxProfit(money,ar));
    }
}
