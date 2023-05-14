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
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, AtomicInteger> letters = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (letters.containsKey(c)) {
                letters.get(c).incrementAndGet();
            } else {
                letters.put(c, new AtomicInteger(1));
            }
        }
        for (char c : t.toCharArray()) {
            if (letters.containsKey(c) && letters.get(c).get() > 0) {
                letters.get(c).decrementAndGet();
            } else {
                return false;
            }
        }
        return true;
    }
}
