class Solution {

    public static int minCoins(int[] coins, int amount, int[] dp) {

      

        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;

        if(dp[amount] != -1) return dp[amount];

        // logic 
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            int ans = minCoins(coins, amount - coins[i], dp);

            if(ans != Integer.MAX_VALUE) {
            minimum = Math.min(minimum, ans + 1);
            }
        }
        return dp[amount] = minimum;
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = minCoins(coins, amount, dp);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;

    }
}