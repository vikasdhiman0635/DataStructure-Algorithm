package Questions;

import java.util.Arrays;

public class Q88 {

    public static void main(String[] args) {

        int[] arr1 = { 1,2,3,0,0,0 };
        int[] arr2 = { 2,5,6 };
        merge(arr1, 3, arr2, 3);

    }

    public static void merge(int[] num1, int m, int[] num2, int n) {

        // int[] combineArray = new int[m + n];
        // int index = 0;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (num1[i] > num2[j]) {
                int temp = num1[i];
                num1[i] = num2[j];
                num2[j] = temp;
                if (num2[j] == 0) {
                    j++;
                }
            } else {
                i++;
            }
        }

        while (j < n) {
            int temp = num1[i];
            num1[i] = num2[j];
            num2[j] = temp;
            j++;
            i++;
        }
        System.out.println(Arrays.toString(num1));
        
        // ------------------------------------------------
        // while (i < m && j < n) {
        // if (num1[i] < num2[j]) {
        // combineArray[index] = num1[i];
        // index++;
        // i++;
        // } else {
        // combineArray[index] = num2[j];
        // index++;
        // j++;
        // }
        // }

        // while (i < m) {
        // combineArray[index] = num1[i];
        // index++;
        // i++;
        // }

        // while (j < m) {
        // combineArray[index] = num2[j];
        // index++;
        // j++;
        // }
        // num1 = combineArray;
        // System.out.println(Arrays.toString(num1));
    }

}
