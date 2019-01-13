package com.practice.test.binarySearchOnRotatedArray;

/**
 *
 */

public class BinarySearchOnRotatedArray {
       public int binarySearchImp(int arr[], int l,int r, int k ){

           if (r>=l){
               int mid=(l+r)/2;
               if (arr[mid]==k){
                   return mid;
               }else if (arr[mid]>k){
                   r=mid-1;
                   return binarySearchImp(arr,l,r,k);
               }else {
                   l=mid+1;
                   return binarySearchImp(arr,l,r,k);

               }
           }
           return -1;
       }
       public int binarySearch(int arr[], int i, int k){
           int n=arr.length-1;
           if (arr[n]>k){
               return binarySearchImp(arr,n-i,n-1,k);
           }if (arr[n]<k){
               return binarySearchImp(arr,0,n-i+1,k);
           }
           return n;
       }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,1,2,3};
        BinarySearchOnRotatedArray binarySearchOnRotatedArray =new BinarySearchOnRotatedArray();

        int p=binarySearchOnRotatedArray.binarySearch(arr,3,9);

        System.out.println(p);
    }
}
