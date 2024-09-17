import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] array = { 4, 6, 1, 7, 3, 2, 5 };
        quickSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = pivot(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    public static int pivot(int[] array, int start, int end) {
        int swapIndex = start;

        for (int i = start + 1; i < end; i++) {
            if (array[i] < array[start]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, start, swapIndex);
        return swapIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}