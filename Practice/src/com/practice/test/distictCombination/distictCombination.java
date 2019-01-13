package com.practice.test.distictCombination;

import java.util.*;

public class distictCombination {

    public static int distinctWayCount(int n, int k){
        if(n==0)
            return 1;
        if(n<0 || k>2)
            return 0;
        int num=Integer.MAX_VALUE;
        if (k==0)
            num=3;
        else if(k==1)
            num=5;
        else if(k==2)
            num=10;
        int ans=0;
        for (int i=0;(i*num)<=n;i++){
            ans+=distinctWayCount(n-num*i,k+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            System.out.println(distinctWayCount(n,0));
        }
    }
}
