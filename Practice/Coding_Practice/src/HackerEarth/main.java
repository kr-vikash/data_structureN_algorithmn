package HackerEarth;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

///import for Scanner and other utility classes
*/
import java.util.*;
import java.lang.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static int getIndex(int T[],int count){
        for(int i=0;i<T.length;i++){
            if(T[i]==count){
                return i;
            }
        }
        return -1;
    }
    static int getDayCount(int S, int X, int N,int T[],int Y[]){
        int count=0;
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<N;i++){
            set.add(T[i]);
        }
        while(S>0){
            if(!set.contains(count)){
                S=S-X;
            }else{
                int index=getIndex(T,count);
                S=S-Y[index];
            }
            count++;
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner sc = new Scanner(System.in);
        int S=sc.nextInt();
        int X=sc.nextInt();
        int N=sc.nextInt();
        int T[]=new int[N];
        int Y[]=new int[N];

        System.out.println(getDayCount(S,X,N,T,Y));
        // Write your code here

    }
}
