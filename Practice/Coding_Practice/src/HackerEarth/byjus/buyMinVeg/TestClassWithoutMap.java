package HackerEarth.byjus.buyMinVeg;

import java.util.Arrays;
import java.util.Scanner;

public class TestClassWithoutMap {

    static int getCount(int ar[], int n, long sum, int count){
        int j=0;
        long total=0;
        while(count<=ar[n-1]){
            j=0;
            total=0;
               while(total!=sum && j<n ){
                    if(ar[j]<=count){
                        total+=ar[j];
                    }else{
                        total+=count;
                    }

                    j++;
                }
                if(total>=sum) {
                    return count;
                } else {
                    count++;
                }
            }


        return count;
    }

    static int[] getQunatityVeg(int ar[], int n, long Q[], int q, long maxSum){
        Arrays.sort(ar);
        int result[]=new int[q];
        int j=0;
        for(int i=0;i<q;i++){
            if(maxSum<Q[i]){
                result[i]=-1;
            }else{
                result[i]=getCount(ar,n,Q[i],(int) Q[i]/n+1);
            }
        }
        return result;
    }
    static void printCount(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        long startTime = System.currentTimeMillis();



        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        long maxSum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maxSum+=arr[i];
        }
        int q=sc.nextInt();
        long Q[]=new long[q];
        for(int j=0;j<q;j++){
            Q[j]=sc.nextLong();
        }

        int a[]=getQunatityVeg(arr,n,Q,q,maxSum);
        printCount(a,q);
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        // Write your code here

    }

}
