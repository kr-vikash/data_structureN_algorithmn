package HackerEarth.videoMusicCheck;

import java.util.Scanner;

class Main{

    /*
        You can declare the other variables or functions here
    */
    public static boolean isName(String a){
        boolean name=false;
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                name=true;
                break;
            }
        }
        return name;
    }
    public static void process_data(String a, String b){
        /*
            Complete this function to check if the data is a music or not.
        */
        boolean name=false;
        boolean number=false;

        if(isName(a)){
            name=true;
        }else
            number=true;
        if(isName(b)){
            name=true;
        }else
            number=true;

        if(number && name){
            System.out.println("M");
        }else {
            System.out.println("N");
        }
    }

    public static void process_data(String a, String b, String c){
        boolean name=false;
        boolean number=false;
        boolean number1=false;

        if (isName(a)){
            name=true;
        }else{
            number=true;
        }

        if (isName(b) && name){
            System.out.println("N");
            return;
        }else if (isName(b)){
            name=true;
        }else{
            if(number){
                number1=true;
            }else
                number=true;
        }
        if (isName(c) && name){
            System.out.println("N");
            return;
        }else if (isName(c)){
            name=true;
        }else{
            if(number){
                number1=true;
            }else
                number=true;
        }
        if (name && number && number1){
            System.out.println("V");
        }else {
            System.out.println("N");
        }
    }

    public static void main(String[] args) throws Exception {
        /*
            Read the input here. Now based on the count of words in each line of input, you need to call the process_data function
        */
        Scanner sc= new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String str=sc.nextLine();
            String str1[]=str.split("\\s");
            int count=0;
            String str2[]=new String[3];
            for (int i=0;i<str1.length;i++){
                if(str1[i].length()>0){
                    if (count<3){
                        str2[count]=str1[i];
                    }else {
                        System.out.println("N");
                        return;
                    }
                    count++;
                }
            }
            if(count==2){
                process_data(str2[0],str2[1]);
            }else if(count==3){
                process_data(str2[0],str2[1],str2[2]);
            }else{
                System.out.println("N");
            }

        }
    }
}