public class Array122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] > prices[i]){
                maxProfit += (prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Array122 result = new Array122();
        int[] arr = {7,6,5,3,2,1};
        int profit;
        profit = result.maxProfit(arr);
        System.out.println("The maximum profit gained is " + profit);
    }
}
