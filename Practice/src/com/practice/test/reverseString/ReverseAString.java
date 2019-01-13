package com.practice.test.reverseString;

import java.util.regex.Pattern;

public class ReverseAString {

    String reverseStringMethod(String str){
        Pattern p= Pattern.compile("\\s");

        String temp[]= p.split(str);
        str="";
        for (int i=0;i<temp.length; i++){
            if (i== temp.length-1){
                str =temp[i] +str;
            }else {
                str=" " + temp[i] +str;
            }
        }

        return str;
    }


    public static void main(String[] args) {

        String string="I dont know you dsf df s sdfs df df s dfs fsd";
        ReverseAString reverseAString =new ReverseAString();

        System.out.println(reverseAString.reverseStringMethod(string));
    }
}
