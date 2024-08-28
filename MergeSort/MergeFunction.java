import java.util.Arrays;

class MergeFunction {

    public static int[] merge(int[] leftArr, int[] rightarr) {

        int[] combineArray = new int[leftArr.length + rightarr.length];
        int index = 0;
        int i = 0, j = 0;

        while (i < leftArr.length && j < rightarr.length) {
            if (leftArr[i] < rightarr[j]) {
                combineArray[index] = leftArr[i];
                i++;
                index++;
            } else {
                combineArray[index] = rightarr[j];
                j++;
                index++;
            }
        }

        while (i < leftArr.length) {
            combineArray[index] = leftArr[i];
            index++;
            i++;
        }
        while (j < rightarr.length) {
            combineArray[index] = rightarr[j];
            index++;
            j++;
        }
        return combineArray;

    }

    public static int[] divide(int[] array) {

        if (array.length == 1)
            return array;

        int midIndex = array.length / 2;
        int[] leftarr = divide(Arrays.copyOfRange(array, 0, midIndex));
        int[] rightarr = divide(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(leftarr, rightarr);
        // return leftarr;
    }

    public static void main(String[] arg) {

        int[] arr = { 3, 5, 1, 4, 5, 7 };
        System.out.println(Arrays.toString(divide(arr)));
    }

}