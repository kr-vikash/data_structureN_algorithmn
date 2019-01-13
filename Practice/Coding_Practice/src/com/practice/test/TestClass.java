package com.practice.test;//import for Scanner and other utility classes
import java.util.*;
import java.util.LinkedList;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    //private static void check(int[] ar,int v,)
    private static String performCheck(int[] ar, int n,List<Integer>[] tree,int value, int node){
         if (ar[node]==value){
             return "YES";
         }
        for (int i=0;i<tree[node].size();i++){
            if(ar[tree[node].get(i)]==value){
                return "YES";
            }
            performCheck(ar,n,tree,value,tree[node].get(i));
        }
        return "NO";
    }

    private static void perFormQueryOperation(int ar[],int n,List<Integer>[] tree,int q,String[] query){

        for(int i=0;i<q;i++){
            String queryData[]=query[i].split(" ");
            int node=0,value=0;
            node=Integer.parseInt(queryData[1])-1;
            value=Integer.parseInt(queryData[2]);
            if(queryData[0].equals("1")){
                 ar[node]=value;
            }else if(queryData[0].equals("2")){
                System.out.println(performCheck(ar,n,tree,value,node));
            }
        }
    }


    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        List<Integer>[] tree = new List[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n- 1; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            tree[x].add(y);
        }
        int q=sc.nextInt();
        String query[]=new String[q];
        sc.nextLine();
        for(int i=0;i<q;i++){
            query[i]=sc.nextLine();
        }
          perFormQueryOperation(ar,n,tree,q,query);
        // Write your code here

    }
}
