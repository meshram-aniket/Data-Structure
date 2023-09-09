package ArraysQuestion;

public class Max_Profit_Share {
    public static void main(String[] args) {
        int[] price = {50,90,130,155,20,267,347};
        System.out.println(MaxProfit(price));
    }


    public static int MaxProfit(int[] price) {
        int profit = 0;
        for (int i = 1; i < price.length - 1; i++) {
            int curr_Profit = price[i + 1] - price[i];
            profit = Math.max(profit, curr_Profit);
        }

        return profit;
    }
}
