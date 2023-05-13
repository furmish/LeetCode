package word_pattern;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("aaaa", "dog dog dog dog"));
        System.out.println(wordPattern("e", "dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] patternChars = pattern.toCharArray();
        Set<Character> uniqCharsInPattern = new HashSet<>();
        Set<String> uniqWordsInS = new HashSet<>();

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < patternChars.length - 1; i++) {
            uniqCharsInPattern.add(patternChars[i]);
            uniqCharsInPattern.add(patternChars[i + 1]);

            uniqWordsInS.add(words[i]);
            uniqWordsInS.add(words[i + 1]);

            if (patternChars[i] == patternChars[i + 1] && !(words[i].equals(words[i + 1]))) {
                return false;
            }
            if (patternChars[i] != patternChars[i + 1] && words[i].equals(words[i + 1])) {
                return false;
            }
        }

        return uniqCharsInPattern.size() == uniqWordsInS.size();
    }
}
