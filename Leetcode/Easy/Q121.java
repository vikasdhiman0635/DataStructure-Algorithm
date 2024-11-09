class Q121 {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int buy = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i] && prices[i] != 0) {
                buy = prices[i];
            }
            if (buy < prices[i] && sell < prices[i]) {
                sell = prices[i];
            }
        }
        System.out.println(sell - buy);
    }
}