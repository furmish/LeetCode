package ReplaceElementsWithGreatestElementOnRightSide;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            } else arr[i] = max;
        }
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length - 1] = -1;
        return arr;
    }
}
