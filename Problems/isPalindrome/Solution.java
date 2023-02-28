package isPalindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int y = 0;

        while (temp != 0) {
            y = y * 10 + (temp % 10);
            temp /= 10;
        }

        return x == y;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(212));
    }
}
