package ransome_note;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("misha", "asdmi"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, AtomicInteger> letters = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            if (letters.containsKey(c)) {
                letters.get(c).incrementAndGet();
            } else {
                letters.put(c, new AtomicInteger(1));
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters.containsKey(c) && letters.get(c).get() > 0) {
                letters.get(c).decrementAndGet();
            } else {
                return false;
            }
        }
        return true;
    }
}
