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
        int k;
        int j;

        for (int i = 0; i <= h.length - n.length; i++) {
            if (h[i] == n[0] && h[i + n.length - 1] == n[n.length - 1]) {
                if (n.length < 2) {
                    return i;
                }
                k = i + 1;
                j = 1;
                while (j != n.length - 1) {
                    if (h[k] != n[j]) {
                        break;
                    }
                    k++;
                    j++;
                }
                if (j == n.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
