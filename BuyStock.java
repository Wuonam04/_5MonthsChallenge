public class BuyStock {

    /*You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/


    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;
                                        //Method is too slow
        for(int i = 0; i < n; i++){
            for(int j = i+1; j<n; j++){
                if(prices[j] - prices[i] > profit){
                    profit = prices[j] - prices[i];

                }
            }

        }
        return profit;

    }

    public static void main(String[] args) {

        int [] a = {67,9};
        System.out.println(maxProfit(a));

    }

}
