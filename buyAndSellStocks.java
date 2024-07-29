
public class buyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buy = prices[0];
        int profit = 0;
        for(int i: prices){
            buy = Math.min(buy,i);
            profit = Math.max(profit,i-buy);
        }
        System.out.println(profit);
    }
}
