package is_subsequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "axcgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isBlank()) {
            return true;
        }

        char[] sub = s.toCharArray();
        char[] str = t.toCharArray();
        int j = 0;

        for (char c : str) {
            if (sub[j] == c) {
                j++;
            }
            if (j == sub.length) {
                return true;
            }
        }
        return false;
    }
}
