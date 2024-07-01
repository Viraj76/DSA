package leetcodes;

import java.util.Arrays;
import java.util.HashSet;

public class ClassMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = {
                {5,7},
                {1,3},
                {9,10}
        };

        int [] arrrr = {
                2,2,2,1
        };

        System.out.println(solution.minIncrementForUnique(arrrr));
    }
}


class Solution {
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                if(set.contains(nums[i])){
                    int num = nums[i];
                    while(set.contains(num)){
                        num++;
                        count++;
                    }
                    set.add(num);
                }
            }

        }
        return count;
    }
}
