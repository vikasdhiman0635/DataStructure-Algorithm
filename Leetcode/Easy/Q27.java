package Leetcode.Easy;

import java.util.Arrays;

public class Q27 {

    public static void main(String[] args) {
        int k = removeElement(new int[] { 3, 2, 2, 3 }, 3);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        System.out.println();
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }

}
