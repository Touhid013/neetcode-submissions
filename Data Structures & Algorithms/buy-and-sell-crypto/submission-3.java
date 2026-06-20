class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
       int L=0;
       int R=1;
       while(L<n && R<n){
        if(prices[L]>prices[R]){
            L=R;
            R++;

        }
        
        else{
            profit=Math.max(profit,prices[R]-prices[L]);
            R++;
        }

       }
       return profit;
    }
}
