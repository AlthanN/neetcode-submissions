class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        bestBuy = prices[0]
        for i in range(1, len(prices)):
            if prices[i] - bestBuy > maxProfit:
                maxProfit = prices[i] - bestBuy
            elif prices[i] < bestBuy:
                bestBuy = prices[i]
        return maxProfit
        