package com.practice.test.mergerSort;


public class MergeSortClass {

    void merge(int arr[], int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int j=0,i=0;

        int left[]=new int[n1];
        int right[]=new int[n2];
        for (i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for (i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        i=0;
        j=0;
        int k=l;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
    void partition(int arr[],int l, int r){

        if(r>l){
            int mid = l + (r - l) / 2;
            partition(arr,l,mid);
            partition(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }
    void print(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5, 2, 3, 1, 6, 7, 2, 9};
        MergeSortClass mergeSortClass=new MergeSortClass();
        mergeSortClass.partition(arr,0,arr.length-1);
        mergeSortClass.print(arr);
    }
}
