package happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(7));
    }

        private static Set<Integer> repeated = new HashSet<>();

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        int sumOfSquaredDigits = 0;
        while (n > 0) {
            int i = n % 10;
            sumOfSquaredDigits += i * i;
            n /= 10;
        }
        if (repeated.contains(sumOfSquaredDigits)) {
            repeated.clear();
            return false;
        } else {
            repeated.add(sumOfSquaredDigits);
        }
        return isHappy(sumOfSquaredDigits);
    }
}
