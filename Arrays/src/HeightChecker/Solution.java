package HeightChecker;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }

    public static int heightChecker(int[] heights) {
        int[] sortedHeights = new int[heights.length];
        System.arraycopy(heights, 0, sortedHeights, 0, heights.length);
        Arrays.sort(sortedHeights);
        int countMismatchIndexes = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i])
                countMismatchIndexes++;
        }
        return countMismatchIndexes;
    }
}
