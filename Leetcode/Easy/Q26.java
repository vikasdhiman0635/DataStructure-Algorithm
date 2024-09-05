package Leetcode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Q26 {

    public static void main(String[] args) {

        int res = removeDuplicates(new int[] { 1, 1, 2 });
        System.out.println(res);
        // [1,2,_]
    }

    public static int removeDuplicates(int[] nums) {

        // System.out.println();
        // for (int i = 1; i < nums.length; i++) {
        // for (int j = i; j >= i-1; j--) {
        // if (nums[i] < nums[j]) {
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // }
        // }
        // }
        // System.out.println(Arrays.toString(nums));

        // return 0;

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        while (i < nums.length) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]));
            } else {
                map.put(nums[i], 0);
                count++;
            }
            i++;
        }

        System.out.println(map);

        Set<Integer> set = map.keySet();
        Iterator<Integer> itr = set.iterator();
        int j = 0;
        while (itr.hasNext()) {
            nums[j] = itr.next();
            j++;
        }
        System.out.println(Arrays.toString(nums));

        return count;
    }

}
