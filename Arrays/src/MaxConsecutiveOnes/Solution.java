package MaxConsecutiveOnes;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int countOnes = 0;
        int maxConsecutive = 0;
        for (int num : nums) {
            if (num == 1)
                countOnes++;
            else countOnes = 0;
            if (countOnes > maxConsecutive)
                maxConsecutive = countOnes;
        }
        return maxConsecutive;
    }
}
