package first_occurence_in_string;

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("mississippi", "pi"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int j;
        int k;

        for (int i = 0; i <= h.length - n.length; i++) {
            if (h[i] == n[0] && h[i + n.length - 1] == n[n.length - 1]) {
                if (n.length < 2) {
                    return i;
                }
                for (k = i + 1, j = 1; j != n.length - 1; k++, j++) {
                    if (h[k] != n[j]) {
                        break;
                    }
                }
                if (j == n.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
