package ArraysQuestion;

public class Max_Profit_Share {
    public static void main(String[] args) {
        int[] price = {50,90,130,155,20,267,347};
        System.out.println(MaxProfit(price));
    }


    public static int MaxProfit(int[] price) {
        int profit = 0;

        int i = 0;
        int j = 1;
        while(j < price.length) {

            if(price[i] > price[j]) {
                int curr_Profit = price[j - 1] - price[i];
                profit += Math.max(profit, curr_Profit);
                i = j;
            }
            if (j == price.length - 1) {
                int curr_Profit = price[j] - price[i];
                profit += Math.max(profit, curr_Profit);
            }
            j++;
        }
        return profit;
    }
}
