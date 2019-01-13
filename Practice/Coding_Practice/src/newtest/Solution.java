package newtest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int i=0,j=0,lc,uc;
        int l=lowerLimits.length;
        int result[]=new int[l];
        Arrays.sort(scores);
        while(i<lowerLimits.length && j<upperLimits.length){
            lc=getPosition(scores,0,scores.length-1,lowerLimits[i],true,-1);
            System.out.println(lc +"lc");
            uc=getPosition(scores,0,scores.length-1,upperLimits[j],false,-1);
            System.out.println(uc +"uc");
            result[i]=uc-lc+1;
            i++;
            j++;

        }
        return result;
    }
    static int getPosition(int arr[],int l, int r, int key, boolean lowerlimit, int result ){
        //int result=-1;
        if(r>=l){
            int mid= l+(r-l)/2;
            if(lowerlimit){
                if(arr[mid]>=key){
                    result=mid;
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(key>=arr[mid]){
                    result=mid;
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
            return getPosition(arr,l,r,key,lowerlimit,result);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
       // final String fileName = System.getenv("OUTPUT_PATH");
       // BufferedWriter bw = null;
      /*  if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }*/

        int[] res;
        int scores_size = 0;
        scores_size = Integer.parseInt(in.nextLine().trim());

        int[] scores = new int[scores_size];
        for(int i = 0; i < scores_size; i++) {
            int scores_item;
            scores_item = Integer.parseInt(in.nextLine().trim());
            scores[i] = scores_item;
        }

        int lowerLimits_size = 0;
        lowerLimits_size = Integer.parseInt(in.nextLine().trim());

        int[] lowerLimits = new int[lowerLimits_size];
        for(int i = 0; i < lowerLimits_size; i++) {
            int lowerLimits_item;
            lowerLimits_item = Integer.parseInt(in.nextLine().trim());
            lowerLimits[i] = lowerLimits_item;
        }

        int upperLimits_size = 0;
        upperLimits_size = Integer.parseInt(in.nextLine().trim());

        int[] upperLimits = new int[upperLimits_size];
        for(int i = 0; i < upperLimits_size; i++) {
            int upperLimits_item;
            upperLimits_item = Integer.parseInt(in.nextLine().trim());
            upperLimits[i] = upperLimits_item;
        }

        res = jobOffers(scores, lowerLimits, upperLimits);
      /*  for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }*/

        //bw.close();
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
