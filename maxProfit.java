class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit=0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++ ){
          if(prices[i]<min){
               min=prices[i];
}
          else{
        maximumProfit = Math.max(maximumProfit, prices[i]-min);
    }
       
        
    }
     return maximumProfit;
     }
}
   
