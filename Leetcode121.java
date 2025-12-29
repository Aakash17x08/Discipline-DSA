class Leetcode121 {
    public int maxProfit(int[] prices) {
        // Brute force
        /*int maxProfit = 0;
        for(int i = 0; i < prices.length ; i++){
            for(int j = i + 1; j < prices.length; j++){
                int profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;*/
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - min;
            //check prfit
            if (profit > max) {
                max = profit;
            }  //ckeck day
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return max;
    }
}