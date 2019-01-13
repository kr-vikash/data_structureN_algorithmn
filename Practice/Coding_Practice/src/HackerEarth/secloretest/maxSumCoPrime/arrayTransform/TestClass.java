package HackerEarth.secloretest.maxSumCoPrime.arrayTransform;//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static int getMinCost(int A, int B, int a[], int b[], int c[]){
        int cost=-1;
        int a1=A;
        int tmp=0;
        if(A==B){
            return 0;
        }
        for(int i=0;i<a.length;i++){
            if((a[i]==A && b[i]==B )|| (a[i]==B && b[i]==A)){
              cost=c[i];   
            }
        
        }
        return cost;
    }
    public static int getTotalCost(int A[],int B[],int n,int a[],int b[],int c[],int m){
        int totalCost=0;
        for(int i=0;i<n;i++){
            int p=getMinCost(A[i],B[i],a,b,c);
            if(p==-1){
                return -1;
            }else{
                totalCost+=p;
            }
        }
        return totalCost;
    }
    public static void main(String args[] ) throws Exception {

        //Scanner
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
        int m=s.nextInt();
        int a[]=new int[m];
        int b[]=new int[m];
        int c[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=s.nextInt();
            b[i]=s.nextInt();
            c[i]=s.nextInt();
        }
        System.out.println(getTotalCost(A,B,N,a,b,c,m));
         
    }
}
