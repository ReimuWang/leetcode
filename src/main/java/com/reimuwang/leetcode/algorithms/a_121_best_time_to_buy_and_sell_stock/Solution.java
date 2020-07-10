package com.reimuwang.leetcode.algorithms.a_121_best_time_to_buy_and_sell_stock;

public class Solution {

  public int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int minPrice = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      int profit = prices[i] - minPrice;
      if (profit > maxProfit) {
        maxProfit = profit;
      }
    }
    return maxProfit;
  }
}
