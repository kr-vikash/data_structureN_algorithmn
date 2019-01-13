package com.practice.test.minimizeCandies;

import java.io.IOException;
import java.util.Scanner;

/**
 * Candies function
 * Idea to traverse through both direction, left(beginning to end) and right(end to beginning)
 * and take the sum
 */

class Solution2 {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        int leftArr[]=new int[n];
        int rightArr[]= new int[n];
        long sum=0;
        leftArr[0]=1;
        rightArr[n-1]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
                leftArr[i]=leftArr[i-1] +1;
            else
                leftArr[i]=1;
        }
        for(int j=n-2;j>=0;j--){
            System.out.println(sum);
            if(arr[j]>arr[j+1])
                rightArr[j]=rightArr[j+1]+1;
            else {
                rightArr[j] = 1;
            }
            sum+=rightArr[j]>=leftArr[j] ? rightArr[j] : leftArr[j];
        }
        sum+=rightArr[n-1]>=leftArr[n-1] ? rightArr[n-1] : leftArr[n-1];
        System.out.println(sum);

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
