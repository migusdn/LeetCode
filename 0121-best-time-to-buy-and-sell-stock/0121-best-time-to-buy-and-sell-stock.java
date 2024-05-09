
class Solution {
    public int maxProfit(int[] prices) {
        int[] dayMin = new int[prices.length];
        int maxProfit=0;
        dayMin[0] = prices[0];
        for(int i=1; i<prices.length; i++){
            dayMin[i] = Math.min(dayMin[i-1], prices[i]);
        }
        for(int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-dayMin[i]);
        }
        return maxProfit;
    }
}
//싼 날에 사서 비싼날에 팔아라