class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        int n = prices.length;
        while(r<n){
            if(prices[l] < prices[r]){
                int curr = prices[r] - prices[l];
                max = Math.max(curr, max);
            }else{
                l = r;
            }
            r++;
        }
        return max;
    }
}
