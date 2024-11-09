import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Iterator;

class Q26 {
    public static void main(String[] args) {
        int[] nums = { -3,-1,0,0,0,3,3 };
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int inc = map.get(i);
                map.put(i, (inc + 1));
            } else {
                map.put(i, 1);
            }
        }
        int k = 0;
        int i = 0;
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int val = itr.next();
            if (val > k) {
                k++;
            }
            nums[i] = val;
            i++;
        }
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }
}