package RemoveDuplicatesFromSortedArray;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int maxVal = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    nums[++i] = nums[j];
                    if (nums[i] == maxVal)
                        return i + 1;
                }
            }
        }
        return 1;
    }
}
