package HackerEarth.newLanguage;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static final int arr[]={0,1,2,3,4,5,6,7,9};
    static String addition(int a, int b){
        int count=a/10;
        count=a+b;

        String str="";
        while(b!=0){
            str=arr[b%9]+str;
            b=b/9;
        }
        int c=Integer.parseInt(str);
        c=a+c;

        return c+"";
    }
    static String subtract(int a, int b){
        int count=a/10;
        int count2=b/10;
        count=a-b;
        count2=b%10;
        String str="";
        while(b!=0){
            str=arr[b%9]+str;
            b=b/9;
        }
        b=Integer.parseInt(str);
        str=a-b+"";
        StringBuilder strb=new StringBuilder();
        for (int i=0;i<str.length();i++){

            if(str.charAt(i)=='8'){
                strb.append('7');
            }else
                strb.append(str.charAt(i));
        }
        return strb.toString();
    }
    static String multiplication(int a, int b){
        int count=a/10;
        int count2=b/10;
        String str=a*b+"";
        StringBuilder strb=new StringBuilder();
        for (int i=0;i<str.length();i++){

            if(str.charAt(i)=='8'){
                strb.append('7');
            }else
                strb.append(str.charAt(i));
        }

        return strb.toString();
    }
    static String division(int a, int b){
        int count=a/10;
        int count2=b/10;
        count=a/b;
        String str="";
        while(a!=0){
            if(a%10==9){
                str="8"+str;
            }else
                str=a%10+str;
            a=a/10;
        }
        a=Integer.parseInt(str);


        return a/b+"";
    }

    static boolean checkOperator(char ch){
        if(ch=='/'|| ch=='*'|| ch=='+' || ch=='-'){
            return true;
        }
        return false;
    }
    static String getValue(int a, int b,char ch){
        String c="";
        if(ch=='+'){
            c=addition(a,b);
        }else if(ch=='-'){
            c=subtract(a,b);
        }else if(ch=='*'){
            c=multiplication(a,b);
        }else if(ch=='/'){
            c=division(a,b);

        }else{
            System.out.println("invalide operator");
        }
        return c;

    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        */
        Scanner sc = new Scanner(System.in);
        int Q=sc.nextInt();
        sc.nextLine();
        while(Q-->0){
            String str=sc.nextLine();
            int a=0;
            int index=0;
            int b=0;
            char ch;
            for(int i=0;i<str.length();i++){
                if(checkOperator(str.charAt(i))){
                    index=i;
                }
            }
            String s=str.substring(0,index);
            String s1=str.substring(index+1, str.length());
            a=Integer.parseInt(s);
            b=Integer.parseInt(s1);
            ch=str.charAt(index);
            System.out.println(getValue(a,b,ch));
        }


        // Write your code here

    }
}
