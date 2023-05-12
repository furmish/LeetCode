package longest_common_prefix;


public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int commonPrefixCharCounter = 0;
        int charPointer = 0;

        while (charPointer < strs[0].length()) {
            for (int j = 1; j < strs.length; j++) {
                if (charPointer == strs[j].length() || strs[0].charAt(charPointer) != strs[j].charAt(charPointer)) {
                    return commonPrefixCharCounter > 0 ? strs[0].substring(0, commonPrefixCharCounter) : "";
                }
            }
            commonPrefixCharCounter++;
            charPointer++;
        }
        return commonPrefixCharCounter > 0 ? strs[0].substring(0, commonPrefixCharCounter) : "";
    }
}
