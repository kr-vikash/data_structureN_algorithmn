package HackerEarth.subarrayperfectSqrSum;

import java.util.*;


class TestClass {
    static int getSubArrayCount(int ar[], int n){
         int count=0;
         int sum=0;
         double root=0;
         for(int i=0;i<n;i++){
            sum=0; 
             for(int j=i;j<n;j++){
               sum+=ar[j];
               root=Math.sqrt(sum);
               if(root-Math.floor(root)==0){
                   count++;
               }
             }
         }
         return count;
    }
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
         int N=sc.nextInt();
         int ar[]=new int[N];
         for(int i=0;i<N;i++){
             ar[i]=sc.nextInt();
         }
         System.out.println(getSubArrayCount(ar,N));

    }
}
