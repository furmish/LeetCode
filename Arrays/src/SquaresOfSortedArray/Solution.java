package SquaresOfSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
    }
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++)
            result[i] = nums[i] * nums[i];
        Arrays.sort(result);
        return result;
    }
}
