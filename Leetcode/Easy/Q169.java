import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Q169 {
    public static void main(String[] args) {
        int res = majorityElement(new int[] { 2, 2 });
        System.out.println(res);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int cal = map.get(nums[i]);
                map.put(nums[i], (Integer) (cal + 1));
            } else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        int value = 0;
        Set<Integer> s = map.keySet();
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            int val = map.get(key);
            if (val > max) {
                max = val;
                value = key;
            }
        }
        return value;
    }
}