/*

* 🧩 Problem: Best Time to Buy and Sell Stock
* ---
* You are given an array `prices` where prices[i] is the price of a stock on day i.
* You want to maximize your profit by choosing a single day to buy one stock
* and choosing a different day in the future to sell that stock.
*
* Return the maximum profit you can achieve from this transaction.
* If you cannot achieve any profit, return 0.
*
* Example:
* Input: prices = [7,1,5,3,6,4]
* Output: 5
* Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
*
* ---
* Approach:
* * Use one-pass scanning with two variables:
* * `minPrice` to keep track of the minimum price so far.
* * `maxProfit` to store the maximum profit achievable.
* * For each price:
* ```
  - Update `minPrice` if current price is smaller.
  ```
* ```
  - Calculate profit = currentPrice - minPrice.
  ```
* ```
  - Update `maxProfit` if profit > maxProfit.
  ```
*
* ---
* Time Complexity: O(n)
* Space Complexity: O(1)
  */

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // update maximum profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 5
    }
}
