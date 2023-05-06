package missing_positive;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
//    public int findKthPositive(int[] arr, int k) {
//        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        List<Integer> collect1 = IntStream.range(1, arr[arr.length - 1] + 1001).boxed().collect(Collectors.toList());
//        collect1.removeAll(collect);
//        return collect1.get(k - 1);
//    }
//    176 ms

//    private int findKthPositive(int[] arr, int k) {
//        int [] missingInts = new int[2000];
//        int missingIntIndex = 0;
//        int cursor = 0;
//        for (int i = 0; i < 2000; i ++) {
//            missingIntIndex = Arrays.binarySearch(arr, i + 1);
//
//            if (missingIntIndex >= 0) {
//                continue;
//            }
//
//            missingInts[cursor++] = i + 1;
//        }
//        return missingInts[k - 1];
//    }
//    6 ms

    private int findKthPositive(int[] arr, int k) {
        int [] missingInts = new int[2001];
        for (int value : arr) {
            missingInts[value] = value;
        }
        int counter = 0;
        for (int j = 1; j < 2001; j++) {
            if (missingInts[j] == 0) {
                counter++;
            }
            if (counter == k) {
                return j;
            }
        }
        return 0;
    }
//    1 ms

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(s.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }
}
