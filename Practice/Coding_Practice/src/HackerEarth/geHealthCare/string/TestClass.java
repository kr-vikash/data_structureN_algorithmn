package HackerEarth.geHealthCare.string;
/**
 * working fine
 */

import java.util.Scanner;

class TestClass {
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
    private static String testStringFor2Parts(String str){
        String left="";
        String right="";
        int l=str.length();
        for (int i=0;i<l;i++){
            left+=str.charAt(i);
            right=str.substring(i+1,l);
            if (checkPlandrome(right+left))
                return "YES";
        }
        return "NO";
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        while (T-->0){
            String str=sc.nextLine();
            System.out.println(testStringFor2Parts(str));
        }
    }
}
