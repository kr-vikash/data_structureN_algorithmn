package com.practice.test.distictPairNumber;

import java.util.HashSet;

public class DistictPairInArr {

    void getDistictPair(int arr[],int sum){
        HashSet<Integer> s= new HashSet<>();
        int flag=0;
        int temp;
        for (int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
             temp=sum-arr[i];
             if(temp>=0 && s.contains(temp)){
                 System.out.println("sum of " + arr[i] + "and" +temp);
                 flag=1;
             }
             s.add(arr[i]);
        }
        if (flag==0){
            System.out.println("sorry did not found any pair");
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 3, 4, 10, 6, 12};
        DistictPairInArr ds= new DistictPairInArr();
        ds.getDistictPair(arr,16);

    }


}
