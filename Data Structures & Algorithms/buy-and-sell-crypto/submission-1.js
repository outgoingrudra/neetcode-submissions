class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
           return solve(prices)
    }
}

function solve(arr){
    let minPrice = Infinity
    let maxProfit = 0
    for(let price of arr){
           if(minPrice>price){
            minPrice = price
           }
           maxProfit = Math.max(maxProfit , price - minPrice)
    }
    return maxProfit
}