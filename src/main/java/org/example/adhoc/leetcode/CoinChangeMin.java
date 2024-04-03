package org.example.adhoc.leetcode;

import java.util.Arrays;

public class CoinChangeMin {
    public static void main(String[] args) {
        CoinChangeMin obj = new CoinChangeMin();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(obj.coinChange(coins, 11));
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int ans = help(coins, coins.length-1, amount);
        if(ans +1 == Integer.MAX_VALUE){
            return -1;
        }
        return ans-1;
    }

    public int help(int[] coins, int n, int amount){
        if (amount < 0){
            return Integer.MAX_VALUE-1;
        }
        if(amount == 0){
            return 0;
        }
        if(n == 0){
            return Integer.MAX_VALUE-1;
        }

        if (coins[n] > amount){
            return help(coins, n-1, amount);
        }
        else{
            int take = 1 + help(coins, n, amount - coins[n]);
            int notTake = help(coins, n-1, amount);
            return Math.min(take, notTake);
        }
    }
}
