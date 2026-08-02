class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        bestReturn = 0
        startingIndex = 0
        for i in range(1, len(prices)):
            if prices[i] - prices[startingIndex] > bestReturn:
                bestReturn = prices[i] - prices[startingIndex]
            if prices[i] < prices[startingIndex]:
                startingIndex = i
        
        return bestReturn
            

        