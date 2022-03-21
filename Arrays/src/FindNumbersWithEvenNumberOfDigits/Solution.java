package FindNumbersWithEvenNumberOfDigits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{437, 315, 322, 431, 686, 264, 442}));
    }

    public static int findNumbers(int[] nums) {
        int evenNumber = 0, digitCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] /= 10;
                digitCounter++;
            }
            if (digitCounter % 2 == 0)
                evenNumber++;
            digitCounter = 0;
        }
        return evenNumber;
    }
}
