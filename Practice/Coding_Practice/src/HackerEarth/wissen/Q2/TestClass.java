package HackerEarth.wissen.Q2;

import java.util.*;

class TestClass {
    static int lis[];
    private static int longestIncreasingSubsequence(int arr[], int n, int p) {
            //int lis[] = new int[n];
            int max = 0;
            for ( int i = p-1; i < n; i++ )
                for (int j = 0; j < i; j++ )
                    if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)
                        lis[i] = lis[j] + 1;

            for (int i = 0; i < n; i++ )
                if ( max < lis[i] )
                    max = lis[i];

            return max;
    }
    private static int increasingSubsquence(String string, int n,int p){
        int arr[]=new int[n];
        for (int i=0;i<string.length();i++){
             arr[i]=string.charAt(i);
        }
        if(p==-1){
            p=2;
        }
           return longestIncreasingSubsequence(arr,n,p);
    }
    private static void doQuery(String string, int n, String query[], int q){
        StringBuilder stringBuilder=new StringBuilder(string);
        int p=-1;
        lis=new int[n];
        for (int i = 0; i < n; i++ )
            lis[i] = 1;

        for (int i=0;i<q;i++){
            String str[]=query[i].split(" ");
            if (str[0].equals("2")){
                System.out.println(increasingSubsquence(stringBuilder.toString(),n,p));
            }else{
                if(str[0].equals("1")){
                    int index=Integer.parseInt(str[1])-1;
                    if(p==-1){
                        p=index;
                    }else if(p>(index)){
                        p=index;
                    }
                    stringBuilder.setCharAt(index-1,str[2].charAt(0));
                }

            }
        }
    }
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         sc.nextLine();
         String str=sc.nextLine();
         int q=sc.nextInt();
         sc.nextLine();
         String query[]=new String[q];
         for (int i=0;i<q;i++){
             query[i]=sc.nextLine();
         }
         doQuery(str,n,query,q);
    }
}
