package HackerRank.FairCut;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution {
    static void print(int ar[]){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
    /*
     * Complete the fairCut function below.
     */
    static int fairCut(int k, int[] arr) {
        /*
         * Write your code here.
         */
        Arrays.sort(arr);
        int minSum=0;
        int count=0;
        int l=arr.length;
        if(2*k>l){
            k=l-k;
        }
        count=k;
        int lf[]=new int[l-k];
        int rf[]=new int[k];
        int rt[]=new int[l];
        int ptl=l/2;
        int ptr=ptl+2;
        int r=0,q=0;
        while(count>0){
            if(ptl>=0){
                rt[ptl]=1;
            }
            ptl-=2;
            count--;
            if(count>0){
                if(ptr<l){
                    rt[ptr]=1;
                    count--;
                    ptr+=2;
                }
            }
        }
        print(rt);
        for(int i=0;i<l;i++){
            if(rt[i]==1){
                rf[r]=arr[i];
                r++;
            }else{
                lf[q]=arr[i];
                q++;
            }
        }
        print(rf);
        System.out.println();
        print(lf);

        for(int j=0;j<k;j++){
            for(int p=0;p<l-k;p++){
                minSum+=Math.abs(rf[j]-lf[p]);
            }
        }
        return minSum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        int result = fairCut(k, arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }
}
