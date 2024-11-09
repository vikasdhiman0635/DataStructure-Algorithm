import java.util.Arrays;

public class Q189 {

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int k = 3;
        int j = k;

        int n = nums.length;
        int i = k;
        while (i > 0) {
            int temp = nums[n - 1];
            nums[n - 1] = nums[i - 1];
            nums[i - 1] = temp;
            i--;
            n--;
        }
        if (nums.length % 2 != 0) {
            System.out.println("ODd");
            int mid = nums.length / 2;
            for (int x = mid; x < nums.length - 1; x++) {
                int temp = nums[x];
                nums[x] = nums[x + 1];
                nums[x + 1] = temp;
            }
        }

        // for (int i = nums.length - 1; i > k; i--) {
        // int temp = nums[j - 1];
        // nums[j - 1] = nums[i];
        // nums[i] = temp;
        // j--;
        // }
        // if (nums.length % 2 != 0) {
        // System.out.println("ODd");
        // int mid = nums.length / 2;
        // for (int i = mid; i < nums.length - 1; i++) {
        // int temp = nums[i];
        // nums[i] = nums[i + 1];
        // nums[i + 1] = temp;
        // }
        // }

        // ------------
        // for (int i = nums.length; i > k; i--) {
        // int temp = nums[j];
        // nums[j] = nums[i];
        // int test = nums[i - 1];
        // nums[i - 1] = temp;
        // nums[i] = test;
        // j++;
        // }
        System.out.println(Arrays.toString(nums));

    }
}
