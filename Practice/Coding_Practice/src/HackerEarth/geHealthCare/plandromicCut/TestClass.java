package HackerEarth.geHealthCare.plandromicCut;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TestClass {
    private static long count=0;
    private static Set<String> set=new HashSet<>();
    private static boolean checkPlandrome(String str){
        int l=0;
        int r=str.length()-1;
        while (r>l){
            if (str.charAt(l)!=str.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
    private static void getTotalSubstringKCut(String str, int k, int n,int start){
        String tmp = "";
        if (k==0){
               tmp=str.substring(start,n);
                if (set.contains(tmp)) {
                    count++;
                    return;
                }
                if(checkPlandrome(tmp)){
                    set.add(tmp);
                    count++;
                }
            return;
        }
        for (int i=start;i<n-k;i++) {
            tmp+=str.charAt(i);
            if (set.contains(tmp))
                count = (long) (count + Math.pow(n-k-i, k - 1) % 1000000007);
            else if(checkPlandrome(tmp)){
                set.add(tmp);
                count = (long) (count + Math.pow(n-k-i, k - 1) % 1000000007);
            }
            getTotalSubstringKCut(str,k-1,n,i+1);
        }
    }
    private static long kCutSubstring(String str, int k, int n){

        getTotalSubstringKCut(str,k,n,0);
        return count;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String str =sc.nextLine();
        System.out.println(kCutSubstring(str,k,n));
    }
}
