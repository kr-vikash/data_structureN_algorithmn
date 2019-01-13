package subStringPlandrome;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int getLongestPalendrome(String str){
        int l=str.length();
        int arr[][]= new int[l][l];
        
        for(int i=0;i<l;i++){
            arr[i][i]=1;
        }
        for(int i=1;i<l;i++){
            for(int j=0;j<(l-i);j++){
                if(str.charAt(j)==str.charAt(j+i) &&(j+1!=j+i)){
                    arr[j][j+i]=arr[j+1][j+i-1]+2;
                    continue;
                }else if(str.charAt(j)==str.charAt(j+i)){
                    arr[j][j+i]=2;
                    continue;
                }
                arr[j][j+i] = Math.max(arr[j][j+i-1],arr[j+1][i+j]);
            }
        }
        
        return arr[0][l-1];
        
    }
	public static void main (String[] args) {
		//code 
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0){
		    String str= sc.next();
		    System.out.println(getLongestPalendrome(str));
		}
	}
}