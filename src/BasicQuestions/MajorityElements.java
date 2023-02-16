package BasicQuestions;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,1,1,2,2};
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
        int maxValue = Collections.max(map.values());  // Will print the maximum value from the map

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue)
                System.out.println(entry.getKey());
        }
    }
}
