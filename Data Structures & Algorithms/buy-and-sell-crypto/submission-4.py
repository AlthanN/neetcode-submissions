class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 0:
            return 0
        bestReturn = 0
        bestBuy = prices[0]
        for i in range(1, len(prices)):
            if prices[i] - bestBuy > bestReturn:
                bestReturn = prices[i] - bestBuy
            if bestBuy > prices[i]:
                bestBuy = prices[i]
            
        return bestReturn

            

        