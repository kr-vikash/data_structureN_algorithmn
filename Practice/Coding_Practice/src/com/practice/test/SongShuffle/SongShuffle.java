package com.practice.test.SongShuffle;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SongShuffle {

    public static void shuffleSong(@NotNull ArrayList<String> str){

        int l=str.size();
        int i=0;
       for (i=l;i>=1;i--){
           double random =Math.random()*(i);
           Collections.swap(str,i-1, (int) random);
       }
    }

    public static void main(String[] args) {
        ArrayList<String> songs=new ArrayList<>();
        songs.add("Abc");
        songs.add("bcd");
        songs.add("cde");
        songs.add("def");
        songs.add("efg");
        shuffleSong(songs);
            System.out.println(songs);
    }

}
