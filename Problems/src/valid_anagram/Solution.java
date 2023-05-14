package valid_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i) - 'a']--;
        }
        for (int letter : letters) {
            if (letter != 0) {
                return false;
            }
        }
        return true;
    }
}
