package Check_If_N_and_Its_Double_Exist;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int zerosCount = 0;

        for (int i : arr) {
            if (i == 0)
                zerosCount++;

            if (zerosCount == 2)
                return true;

            map.put(i, i);
            if ((map.get(i * 2) != null || (map.get(i / 2) != null && i % 2 == 0)) && i != 0)
                return true;
        }
        return false;
    }
}
