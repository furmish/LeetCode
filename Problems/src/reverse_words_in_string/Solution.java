package reverse_words_in_string;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i > -1 ; i--) {
            if (!s1[i].isEmpty()) {
                sb.append(s1[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
