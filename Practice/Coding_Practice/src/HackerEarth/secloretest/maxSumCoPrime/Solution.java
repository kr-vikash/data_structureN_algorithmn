package HackerEarth.secloretest.maxSumCoPrime;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Solution {

    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }else{

            return gcd(b,a%b);
        }
    }

    public static int getGcd(int a, int b){
        if(a>b){
            return gcd(a,b);
        }else {
            return gcd(b,a);
        }
    }

    public static int getMaxSumCoPrime(int[] A, int[] B,int n){
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tmp=A[i]+B[j];
                if(getGcd(A[i],B[j])==1 && max<tmp){
                    max=tmp;
                }
            }
        }
        return max;
    }
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int A[]=new int[N];
        int B[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=s.nextInt();
        }
        System.out.println(getMaxSumCoPrime(A,B,N));
    }
}
