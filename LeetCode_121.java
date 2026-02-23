/*
121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

Create a variable to store the minimum price and initialize it to the maximum possible integer value.
Create a variable to store the maximum profit and initialize it to 0.
Use a for loop to iterate through each price in the prices array.
In each iteration, update the minimum price if the current price is lower than the minimum price.
Calculate the potential profit by subtracting the minimum price from the current price. If this potential profit is greater than the maximum profit, update the maximum profit.
After the loop, return the maximum profit as the result.    

*/

class Solution {

    public int maxProfit(int[] prices) {
    
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update the minimum price
            maxProfit = Math.max(maxProfit, price - minPrice); // Update the maximum profit
        }
        
        return maxProfit;
    }
}