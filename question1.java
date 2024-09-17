public class question1 {

    public static void main(String[] args) {

        // int[] arr = { 100, 300, 500, 150, 700, 200, 950, 700 };
        int[] arr = { 1200, 2000, 2200,100, 400, 1200, 800, 650 };
        int lowestValue = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (lowestValue > arr[i]) {
                lowestValue = arr[i];
            }
            if (profit < arr[i] - lowestValue) {
                profit = arr[i] - lowestValue;
            }
        }
        System.out.println();
        System.out.println(profit);

    }

}
