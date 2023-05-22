package valid_palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("aa"));
        System.out.println(isPalindrome("ab_a"));
        System.out.println(isPalindrome(".,"));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }

        char[] chars = s.toCharArray();

        for (int l = 0, r = s.length() - 1; l <= r; l++, r--) {
            while (!Character.isAlphabetic(chars[l]) && !Character.isDigit(chars[l]) && (l < r)) {
                l++;
            }
            while (!Character.isAlphabetic(chars[r]) && !Character.isDigit(chars[r]) && (l < r)) {
                r--;
            }
            if (Character.toLowerCase(chars[l])  != Character.toLowerCase(chars[r])) {
                return false;
            }
        }
        return true;
    }
}
