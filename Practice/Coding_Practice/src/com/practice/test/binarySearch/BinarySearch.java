package com.practice.test.binarySearch;

/**
 * Count no of dublicate found for a number in the array
 * Assumptions: Array should be sorted or first sort the array
 * Approach:- According to the boolean param searchFirst find first occurrence of
 * the number from left side and then find first occurrence of the number from right
 * side. This will provide you the range of the index where duplicates of the number
 * found
 * */
public class BinarySearch {

    int binarySearchAValue(int arr[],int key,int l, int r, boolean searchFirst ){
        int result=-1;
        while (r>=l) {
            int mid= l + (r-l)/2;

            if (arr[mid] == key) {
                result = mid;
                if (searchFirst) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            } if (arr[mid] > key) {
                r = mid - 1;
            } if(arr[mid] < key) {
                l = mid + 1;
            }
            binarySearchAValue(arr, key, l, r, searchFirst);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,4,4,5,5,6,6,6,6,6,6,7,8,8,9}; // Sorted array

        BinarySearch binarySearch=new BinarySearch();
        int left=binarySearch.binarySearchAValue(arr,5,0,arr.length-1,true);
        int right=binarySearch.binarySearchAValue(arr,5,0,arr.length-1,false);

        System.out.println(right-left+1);

    }
}
