package HackerEarth.secloretest.maxSumCoPrime.approach2;

import java.util.*;
import static java.util.Arrays.sort;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }else{
            
            return gcd(b,a%b);
        }
    }
//
//    public static int getGcd(int a, int b){
//        if(a>b){
//            return gcd(a,b);
//        }else {
//            return gcd(b,a);
//        }
//    }
    
    public static int getMaxSumCoPrime(int[] A, int[] B,int n){
        int max=-1;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int tmp=A[i]+B[j];
                if(max<tmp){
                    if(gcd(A[i],B[j])==1){
                        max=tmp;
                    }
                }else if(max>tmp && i==j){
                    return max;
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
