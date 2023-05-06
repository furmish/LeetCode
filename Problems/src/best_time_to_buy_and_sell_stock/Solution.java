package best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxSell = 0;
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > maxSell) {
                maxSell = prices[i];
            }
            else {
                maxProfit = Math.max(maxSell - prices[i], maxProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
        System.out.println(solution.maxProfit(new int[] {2,5,1}));
    }
}
