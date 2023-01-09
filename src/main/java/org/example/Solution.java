package org.example;

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {

        int result=0;

        for (int[] ints : grid) {

            Arrays.sort(ints);
        }

        for(int i=0;i<grid[0].length;i++){

            int max=Integer.MIN_VALUE;

            for (int[] ints : grid) {

                max = Math.max(ints[i], max);
            }

            result+=max;
        }

        return result;
    }
}