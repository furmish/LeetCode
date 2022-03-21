package DublicateZeros;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 3, 2, 3, 6, 4, 0, 1};
        duplicateZeros(test1);
        System.out.println(Arrays.toString(test1));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i != arr.length - 1) {
                int[] subArray = Arrays.copyOfRange(arr, i + 1, arr.length - 1);
                int k = 0;
                arr[++i] = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j] = subArray[k++];
                }
            }
        }
    }
}
