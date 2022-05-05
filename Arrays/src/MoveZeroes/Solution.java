package MoveZeroes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, temp, j;
        for (j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

