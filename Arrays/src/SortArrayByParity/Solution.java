package SortArrayByParity;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, temp, j;
        for (j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }
}
