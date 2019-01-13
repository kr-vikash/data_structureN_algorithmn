package com.practice.test.FourNumberSum;

import java.lang.*;
import java.util.*;

public class Solution {
    static void checkSum(int arr[], int n, int m){
        Map<Integer,Set<Integer>> map=new HashMap<>();
        List<List<Integer>> lst=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++) {

            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                Set<Integer> st = new HashSet<>();
                if (map.containsKey(m - sum)) {
                    st = map.get(m - sum);
                    if (!st.contains(i) && !st.contains(j)) {
                        List<Integer> ls = new ArrayList<>();
                        for (Integer it : st) {
                            ls.add(arr[it]);
                        }
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        lst.add(ls);
                    }
                }
                st.clear();
                st.add(i);
                st.add(j);
                map.put(sum, st);
            }
        }
        for(int j=0;j<lst.size();j++){
            List<Integer> ls=lst.get(j);
            Collections.sort(ls);
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i)+" ");
            }
            System.out.print("$ ");

        }
        if(lst.size()==0)
            System.out.print(-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            checkSum(ar,n,m);
        }
    }
}
