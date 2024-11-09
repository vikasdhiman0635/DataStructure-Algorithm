import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;

class Q80 {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int count = 1;
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty()) {
                stack.push(nums[i]);
                arr[j] = nums[i];
                j++;
            } else if (stack.peek() == nums[i] && count < 2) {
                stack.push(nums[i]);
                count++;
                arr[j] = nums[i];
                j++;
            }
            if (stack.peek() != nums[i]) {
                count = 1;
                stack.push(nums[i]);
                arr[j] = nums[i];
                j++;
            }
        }
        int k = stack.size();
        Enumeration<Integer> itr = stack.elements();
        int i = 0;
        while (itr.hasMoreElements()) {
            nums[i] = itr.nextElement();
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(stack.toString());
        System.out.println(Arrays.toString(nums));
    }
}