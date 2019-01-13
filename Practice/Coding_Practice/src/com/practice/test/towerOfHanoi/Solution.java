package com.practice.test.towerOfHanoi;

import java.util.*;
public class Solution {

    //s4 to
    //s5 from
    private static int convert3rdTower(Stack<Integer> s1, Stack<Integer> s2, Stack<Integer> s3, Stack<String> s4, Stack<String> s5, int n, int count){
        if (s3.size()==n){
            return count;
        }
        if (!s1.isEmpty() && s4.peek().equals("s1")){
            String str=s5.peek();
            if (!str.equals("s2")){
                if(s2.isEmpty()) {
                    s2.push(s1.peek());
                    s1.pop();
                    s4.push("s2");
                    s5.push("s1");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if (s2.peek()>s1.peek()){
                    s2.push(s1.peek());
                    s1.pop();
                    s4.push("s2");
                    s5.push("s1");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
            if(!str.equals("s3") ){
                if (s3.isEmpty()) {
                    s3.push(s1.peek());
                    s1.pop();
                    s4.push("s3");
                    s5.push("s1");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if (s3.peek()>s1.peek()){
                    s3.push(s1.peek());
                    s1.pop();
                    s4.push("s3");
                    s5.push("s1");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
        }
        else if(!s1.isEmpty()){
            if (s2.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
                s4.push("s2");
                s5.push("s1");

                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);

            }
             if(s2.peek()>s1.peek()){
                 s2.push(s1.peek());
                 s1.pop();
                 s4.push("s2");
                 s5.push("s1");
                 return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
             }
             if (s3.isEmpty()){
                 s3.push(s1.peek());
                 s4.push("s3");
                 s5.push("s1");
                 s1.pop();
                 return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
             }
             if(s3.peek()>s1.peek()){
                 s3.push(s1.peek());
                 s4.push("s3");
                 s5.push("s1");
                 s1.pop();
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
             }
        }
        if (!s2.isEmpty() && s4.peek().equals("s2")){
            String str=s5.peek();
            if (!str.equals("s1")){
                if (s1.isEmpty()) {
                    s1.push(s1.peek());
                    s2.pop();
                    s4.push("s1");
                    s5.push("s2");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if (s1.peek()>s2.peek()){
                    s1.push(s1.peek());
                    s2.pop();
                    s4.push("s1");
                    s5.push("s2");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
            if(!str.equals("s3")){
                if (s3.isEmpty()) {
                    s3.push(s2.peek());
                    s2.pop();
                    s4.push("s3");
                    s5.push("s2");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if ( s3.peek()>s2.peek()){
                    s3.push(s2.peek());
                    s2.pop();
                    s4.push("s3");
                    s5.push("s2");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
        }
        else if(!s2.isEmpty()){
            if (s3.isEmpty()){
                s3.push(s2.peek());
                s2.pop();
                s4.push("s3");
                s5.push("s2");

                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);

            }
            if(s3.peek()>s2.peek()){
                s3.push(s2.peek());
                s2.pop();
                s4.push("s3");
                s5.push("s2");
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
            if (s1.isEmpty()){
                s1.push(s2.peek());
                s4.push("s1");
                s5.push("s2");
                s2.pop();
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
            if(s1.peek()>s2.peek()){
                s1.push(s2.peek());
                s4.push("s1");
                s5.push("s2");
                s2.pop();
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
        }

        if (!s3.isEmpty() && s4.peek().equals("s3")){
            String str=s5.peek();
            if (!str.equals("s1")){
                if (s1.isEmpty()) {
                    s1.push(s3.peek());
                    s3.pop();
                    s4.push("s1");
                    s5.push("s3");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if (s1.peek()>s3.peek()){
                    s1.push(s3.peek());
                    s3.pop();
                    s4.push("s1");
                    s5.push("s3");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
            if(!str.equals("s2") ){
                if (s2.isEmpty()) {
                    s2.push(s3.peek());
                    s3.pop();
                    s4.push("s2");
                    s5.push("s3");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
                if (s2.peek()>s3.peek()){
                    s2.push(s3.peek());
                    s3.pop();
                    s4.push("s2");
                    s5.push("s3");

                    return convert3rdTower(s1, s2, s3, s4, s5, n, count + 1);
                }
            }
        }
        else if(!s3.isEmpty()){
            if (s1.isEmpty()){
                s1.push(s3.peek());
                s3.pop();
                s4.push("s1");
                s5.push("s3");

                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);

            }
            if(s1.peek()>s3.peek()){
                s1.push(s3.peek());
                s3.pop();
                s4.push("s1");
                s5.push("s3");
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
            if (s2.isEmpty()){
                s2.push(s3.peek());
                s4.push("s2");
                s5.push("s3");
                s3.pop();
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
            if(s2.peek()>s3.peek()){
                s2.push(s3.peek());
                s4.push("s2");
                s5.push("s3");
                s3.pop();
                return convert3rdTower(s1,s2,s3,s4,s5,n,count+1);
            }
        }
        return convert3rdTower(s1,s2,s3,s4,s5,n,count);

    }

    private static int hanoiTower3rdRod(Stack<Integer> s1, int n){
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        Stack<String> s4=new Stack<>();
        Stack<String> s5=new Stack<>();
        s4.push("a");
        s5.push("b");
        return convert3rdTower(s1,s2,s3,s4,s5,n,0);
    }
    private static int hanoiTower(int n){
        Stack<Integer> s1=new Stack<>();

        for(int i=n;i>=1;i--){
            s1.push(i);
        }

        return hanoiTower3rdRod(s1,n);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            System.out.println(hanoiTower(n));
        }
    }
}
