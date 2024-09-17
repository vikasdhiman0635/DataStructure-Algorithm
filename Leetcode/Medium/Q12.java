package Leetcode.Medium;

import java.util.Arrays;

public class Q12 {

    public static void main(String[] args) {
        System.out.println();
        int[] arr = {5,1,1,2,0,0 };
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = pivot(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int pivot(int[] arr, int pivotIndex, int end) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= end; i++) {
            if (arr[i] <= arr[pivotIndex]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);
        System.out.println(swapIndex);
        return swapIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
