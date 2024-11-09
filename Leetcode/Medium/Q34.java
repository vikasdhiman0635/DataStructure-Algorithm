
import java.util.Arrays;

public class Q34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] res = new int[2];
        int start = 0;
        int len = nums.length;
        int i = 0;
        if (len > 1) {
            while (start <= len) {
                int mid = start + (len - start) / 2;

                if (nums[mid] == target) {
                    res[i] = mid;
                    start = mid + 1;
                    i++;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    len = mid - 1;
                }
            }
        }
        if (start == nums.length - 1) {
            if (res[1] == 0) {
                res[1] = res[0];
            }
        }
        if (i == 0) {
            res[0] = -1;
            res[1] = -1;
        }
        System.out.println(i);

        // int[] res = new int[2];
        // int start = 0, len = nums.length - 1;
        // int i = 0;
        // while (start <= len) {
        //     int mid = start + (len - start) / 2;
        //     if (nums[mid] == target) {
        //         // res[i] = mid;                
        //         if(i==0){
        //             res[0] = start;
        //             i++;
        //         }
        //         else if(i>0){
        //             res[1] = start;
        //             i++;
        //         }
        //         start++;
        //     } else if (nums[mid] < target) {
        //         start = mid + 1;
        //     } else if (nums[mid] > target) {
        //         len = mid - 1;
        //     }
        // }
        // if (start == nums.length - 1) {
        //     if (res[1] == 0) {
        //         res[1] = res[0];
        //     }
        // }
        // if (i == 0) {
        //     res[0] = -1;
        //     res[1] = -1;
        // }
        System.out.println(Arrays.toString(res));

    }

}
