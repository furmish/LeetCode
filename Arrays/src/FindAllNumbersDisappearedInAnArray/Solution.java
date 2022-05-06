package FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {1,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] res = new int[nums.length + 1];
        for (int num : nums) {
            res[num] = num;
        }
        for (int i = 1; i < res.length; i++) {
            if (res[i] == 0)
                result.add(i);
        }
        return result;
    }
}
