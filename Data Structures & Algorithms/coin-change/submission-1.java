

class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = minimum number of coins needed to make i
        int[] dp = new int[amount + 1];
        // Initially, we don't know the answers
        Arrays.fill(dp, amount + 1);
        // To make 0, we need 0 coins
        dp[0] = 0;
        // Calculate dp[1], dp[2], ..., dp[amount]
        for (int i = 1; i <= amount; i++) {
            // Try every coin
            for (int coin : coins) {
                // We can only use the coin if it is not bigger than i
                if (coin <= i) {
                    // Use this coin and keep the minimum
                    dp[i] = Math.min(
                        dp[i],
                        dp[i - coin] + 1
                    );
                }
            }
        }
        // If we couldn't make the amount
        if (dp[amount] > amount) {
            return -1;
        }
        return dp[amount];
    }
}