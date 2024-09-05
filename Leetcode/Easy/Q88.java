import java.util.Arrays;
import java.lang.System;

class Q88 {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        // newMerge(arr1, 3, arr2, 3);
        mergeArrays(arr1, 3, arr2, 3);

    }

    public static void mergeArrays(int[] num1, int m, int[] num2, int n) {

        // int i = 0, j = 0;
        // while (i < m) {
        // if (num1[i] > num2[j]) {
        // int temp = num1[i];
        // num1[i] = num2[j];
        // num1[m] = temp;
        // j++;
        // } else {
        //// int temp = num1[i];
        //// num1[i] = num2[j];
        //// num2[j] = temp;
        // }
        // i++;
        // }
        //
        // while (j < n) {
        // int temp = num1[i];
        // num1[i] = num2[j];
        // num2[j] = temp;
        // j++;
        // i++;
        // }
        //
        // System.out.println(Arrays.toString(num1));

        int j = 0;
        while (m < num1.length && j < num2.length) {
            num1[m] = num2[j];
            m++;
            j++;
        }
        num1 = divide(num1);
        System.out.println(Arrays.toString(num1));
    }

    public static int[] divide(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int midIndex = array.length / 2;
        int[] left = divide(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = divide(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);
    }

    public static int[] newMerge(int[] num1, int m, int[] num2, int n) {
        int[] combineArray = new int[m + n];
        int index = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (num1[i] < num2[j]) {
                combineArray[index] = num1[i];
                i++;
                index++;
            } else {
                combineArray[index] = num2[j];
                j++;
                index++;
            }
        }
        while (i < m) {
            combineArray[index] = num1[i];
            i++;
            index++;
        }

        while (j < n) {
            combineArray[index] = num2[j];
            j++;
            index++;
        }
        return combineArray;
    }

    public static int[] merge(int[] left, int[] right) {

        int[] combineArray = new int[left.length + right.length];
        int index = 0;
        int i = 0, j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combineArray[index] = left[i];
                i++;
            } else {
                combineArray[index] = right[j];
                j++;
            }
            index++;
        }

        while (i < left.length) {
            combineArray[index] = left[i];
            i++;
            index++;
        }

        while (j < right.length) {
            combineArray[index] = right[j];
            j++;
            index++;
        }

        return combineArray;

    }

}
