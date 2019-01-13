package HackerEarth.arrayRotationOnquery;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;


class TestClass {
    
    static int roTateArray(int a1[],int p, int q, int i){
           if(p==1){
                   return (i+q)%a1.length;
               }
               else{
                   q=q%a1.length;
                   return (i-q+a1.length)%a1.length;
               }
           }
    static void getQueryValue(int ar[],int a[],int b[]){
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=3){
               index=roTateArray(ar,a[i],b[i],index); 
            }else{
                if(index+b[i]<ar.length){
                     System.out.println(ar[b[i]+index]);
                }else{
                    System.out.println(ar[b[i]-(ar.length-index)]);
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {

        Scanner sc= new Scanner(System.in);
         int T=sc.nextInt();
         while(T-->0){
             int n=sc.nextInt();
             int ar[]=new int[n];
             for(int i=0;i<n;i++){
                 ar[i]=sc.nextInt();
             }
             int q=sc.nextInt();
             int a[]=new int[q];
             int b[]=new int[q];
             for(int i=0;i<q;i++){
                 a[i]=sc.nextInt();
                 b[i]=sc.nextInt();
             }
             getQueryValue(ar,a,b);
             System.out.println();
         }

        // Write your code here

    }
}
