package com.practice.test.checkForLongestSubSequence;

import java.util.Scanner;

public class LongestSubSequence {
 static int ans=0;
    static void maxTip(int[] a, int[] b, int p, int q, int r, int sum, int n){
             if (p==n){
                ans= ans >sum ? ans:sum;
                 return;
             }
             if (q>=1)
                 maxTip(a,b,p+1,q-1,r,sum+a[p],n);
             if (r>=1)
                 maxTip(a,b,p+1,q,r-1,sum+b[p],n);
    }

    static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int t=sc.nextInt();
        //sc.nextLine();
       // for (int j=0;j<t;j++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            /*if (sc.nextInt()<n-x){
                System.out.println("not a valid input x+y>=n");
                return;
            }*/
            int y = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            int i = 0;

            while (i < n) {
                A[i] = sc.nextInt();
                i++;
            }
            sc.nextLine();
            i = 0;
            while (i<n) {
                B[i] = sc.nextInt();
                i++;
            }
           // print(A);
           // print(B);
            maxTip(A,B,0,x,y,0,n);
        //}
        System.out.println(ans);

    }
}
