package remove_dublicates_2;


public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }

        int k = nums.length;
        int repCount = 1;

        for (int i = 1; i < k; i++) {
            if (nums[i] == nums[i - 1]) {
                repCount++;
                if (i == k - 1 && repCount > 2) {
                    return k - (repCount - 2);
                }
            } else {
                if (repCount > 2) {
                    for (int j = 1; j <= repCount - 2; j++) {
                        shift(nums, i - j);
                        k--;
                    }
                    i -= repCount - 2;
                }
                repCount = 1;
            }
        }
        return k;
    }

    private static void shift(int[] nums, int i) {
        for (int j = i; j < nums.length - 1; j++) {
            int temp = nums[j + 1];
            nums[j + 1] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3}));
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(removeDuplicates(new int[]{1,1,1}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,2,3,3,3,4,4,4}));
        System.out.println(removeDuplicates(new int[]{-3,-1,-1,0,0,0,0,0,2}));
        System.out.println(removeDuplicates(new int[]{1}));
        System.out.println(removeDuplicates(new int[]{1, 2, 2}));
    }
}
