class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        int leng = prices.length;
        for(int i = 1;i<leng; i++){
            if(min < prices[i]) max += prices[i] - min;
            min = prices[i];
        }
        return max;
    }
}