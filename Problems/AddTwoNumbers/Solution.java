package AddTwoNumbers;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {

        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> firstNumber = new ArrayDeque<>();
        Deque<Integer> secondNumber = new ArrayDeque<>();

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                firstNumber.offerFirst(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                secondNumber.offerFirst(l2.val);
                l2 = l2.next;
            }
        }
        String firstStringNumber = firstNumber.stream().map(String::valueOf).collect(Collectors.joining());
        String secondStringNumber = secondNumber.stream().map(String::valueOf).collect(Collectors.joining());

        String result = new BigInteger(firstStringNumber).add(new BigInteger(secondStringNumber)).toString();

        char[] chars = result.toCharArray();
        ListNode firstInresultListNode = new ListNode();
        ListNode currentListNode = firstInresultListNode;

        for (int i = chars.length - 1; i >= 0; i--) {
            currentListNode.val = Character.getNumericValue(chars[i]);
            if (i != 0) {
                currentListNode.next = new ListNode();
                currentListNode = currentListNode.next;
            }
        }

        return firstInresultListNode;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        s.addTwoNumbers(l1, l2);
        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));
        s.addTwoNumbers(l3, l4);
    }
}
