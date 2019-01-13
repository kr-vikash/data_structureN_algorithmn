package com.practice.test.quickSort;

public class QuickSortClass {

    int quickSortMethod(int arr[],int l, int r){
        int i=l-1;
        //int j;
        int temp;
        int pivot=arr[r];
        for(int j=l;j<r;j++){
            if (pivot>=arr[j]){
                i++;
               temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp= arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;
        return i+1;
    }
    void partion(int arr[]){
        partitionImp(arr,0,arr.length-1);
    }
    void partitionImp(int arr[], int l, int r){

        if(r>l){
            int m=quickSortMethod(arr,l,r);
            partitionImp(arr,l,m-1);
            partitionImp(arr,m+1,r);
        }
    }
    void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        QuickSortClass quickSortClass =new QuickSortClass();
                int arr[]= new int[]{2, 5, 6, 10, 15, 8, 2, 1};
                quickSortClass.partion(arr);
                quickSortClass.print(arr);
    }
}
