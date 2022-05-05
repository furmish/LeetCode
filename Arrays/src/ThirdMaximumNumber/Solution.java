package ThirdMaximumNumber;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2}));
    }
    public static int thirdMax(int[] nums) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int num : nums)
            treeSet.add(num);
        if (treeSet.size() < 3)
            return (int) treeSet.toArray()[treeSet.size() - 1];
        return (int) treeSet.toArray()[treeSet.size() - 3];
    }
}
