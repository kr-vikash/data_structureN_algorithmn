package com.practice.test.maxDiffAncestorChild;

public class Solution {
    static int maxl = Integer.MIN_VALUE;

    static int getMaxDiff(Node node){
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int left = getMaxDiff(node.left);
        int right=getMaxDiff(node.right);

        maxl=Math.max(maxl,node.data-Math.min(left,right));

        return Math.min(node.data,Math.min(left,right));
    }
    int maxDiff(Node node) {
        getMaxDiff(node);
        int maxDiff=maxl;
        maxl=Integer.MIN_VALUE;
        return maxDiff;
    }

}
