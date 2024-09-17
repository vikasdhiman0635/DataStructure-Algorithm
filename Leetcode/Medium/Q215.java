package Leetcode.Medium;

public class Q215 {

    public static void main(String[] args) {
        int[] arr = { 3,2,3,1,2,4,5,5,6 };
        int n =findKthLargest(arr, 1);
        System.out.println(n);
    }

    public static int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length-k];
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotIndex = pivot(nums, start, end);
            quickSort(nums, start, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, end);
        }
    }

    public static int pivot(int[] nums, int pivotIndex, int end) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= end; i++) {
            if (nums[i] < nums[pivotIndex]) {
                swapIndex++;
                swap(nums, swapIndex, i);
            }
        }
        swap(nums, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
