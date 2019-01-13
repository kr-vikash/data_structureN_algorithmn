//import for Scanner and other utility classes
import java.util.*;

/**
 *   Convert one string to other using following steps
 *   step(1) From Adjacent same character, one character can be deleted
 *   step(2) Same character can be added to adjacent in the string.
 *   count number of min step, if possible to convert the string 1 to string 2 else print "Not possible"
 *
 */
class TestClass {
    private static void getMinSTep(String str1, String str2){
         int minCount=0;
         int i=0,j=0;
         StringBuilder s=new StringBuilder(str1);
         StringBuilder s2=new StringBuilder(str2);
         while (i<s.length() || j<s2.length()){

             if (i==s.length()){
                 if (s2.charAt(j)==s2.charAt(j-1)){
                     minCount++;
                     s2.deleteCharAt(j);
                     continue;
                 }else {
                     break;
                 }
             }
             if (j==s2.length()){
                 if (s.charAt(i)==s.charAt(i-1)){
                     s.deleteCharAt(i);
                     minCount++;
                     continue;
                 }else {
                     break;
                 }
             }

             if(s.charAt(i)!=s2.charAt(j)){
                 if (i==0){
                     System.out.println("Not possible");
                     return;
                 }else{
                     if(s.charAt(i)==s.charAt(i-1)){
                         s.deleteCharAt(i);
                         minCount++;
                     }else if(s2.charAt(j)==s2.charAt(j-1)){
                         s2.deleteCharAt(j);
                         minCount++;
                     }
                 }
             }else {
                 i++;
                 j++;
             }
         }
         if (s.toString().equals(s2.toString())){
             System.out.println(minCount);
             return;
         }

        System.out.println("Not possible");
         
    }
    
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       String str1= sc.nextLine();
       String str2=sc.nextLine();
       //
       getMinSTep(str1, str2);
       
    }
}
