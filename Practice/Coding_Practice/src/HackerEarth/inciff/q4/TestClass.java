package HackerEarth.inciff.q4;

import java.util.*;

class TestClass {

    private static long averageProduct(int arrayList[],int k, int n){

        long sum=0, value=0;
        long prodR=1,prodL=1;
        int i=1;
        int count=1;
        sum=arrayList[0];
        while (i<n){
            count++;
            sum+=arrayList[i];
            if(count==k){
                count=1;
                value=sum/k;
                prodR=prodR*(value)%1000000007;
                sum=value;
            }
            i++;
        }
        sum=arrayList[n-1];
        i=n-2;
        count=1;
        while (i>=0){
            count++;
            sum+=arrayList[i];
            if (count==k){
                count=1;
                value=sum/k;
                prodL=prodL*value%1000000007;
                sum=value;
            }
            i--;
        }

        return prodL>prodR ?prodL :prodR;
    }
    public static void main(String args[] ) throws Exception {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(k>1)
            System.out.println(averageProduct(arr,k,n));

    }
}
