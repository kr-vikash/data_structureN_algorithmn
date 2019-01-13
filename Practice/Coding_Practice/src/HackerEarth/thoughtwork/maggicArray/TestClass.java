package HackerEarth.thoughtwork.maggicArray;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    private static boolean isPrime(int p){
        if (p==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(p);i++){
           if (p%i==0){
               return false;
           }
        }
        return true;
    }
    private static int getMinStep(int x){
        int sq= (int) Math.sqrt(x);
        int tmp=sq;
        int lcount=0,rcount=0;
        while (!isPrime(tmp)){
            if (tmp==1){
                lcount=Integer.MAX_VALUE;
                break;
            }
            tmp--;
        }
        sq++;
        while (!isPrime(sq)){
            if (x-tmp*tmp<(sq*sq-x) && tmp!=1){
                break;
            }
            sq++;
            rcount++;
        }
        if(tmp!=1){
            return x-tmp*tmp >= (sq*sq -x) ? (sq*sq -x):x-tmp*tmp;
        }else{
            return (sq*sq -x);
        }
    }
    private static int minStep(int[] ar, int n, int k){
        int mintotal=0;
        int minSTep=0;
        int step[]=new int[n];
        for (int i=0;i<n;i++){
            double sqt=Math.sqrt(ar[i]);
            if(isPrime((int) Math.sqrt(ar[i])) && (sqt-Math.floor(sqt))==0){
               continue;
            }else {
                step[i]=getMinStep(ar[i]);
            }
        }
        Arrays.sort(step);
        for (int i=0;i<k;i++){

                mintotal+=step[i];

        }
        return mintotal+n-k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minStep(arr, n, k));
    }
}
