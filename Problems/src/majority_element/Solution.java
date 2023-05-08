package majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            if (frequencyMap.containsKey(n)) {
                frequencyMap.put(n, frequencyMap.get(n) + 1);
            } else {
                frequencyMap.put(n, 1);
            }
            if (frequencyMap.get(n) > nums.length / 2) {
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
