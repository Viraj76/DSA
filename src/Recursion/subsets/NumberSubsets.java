package Recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class NumberSubsets {

    public static void main(String[] args) {


        int [] nums = {1,2,3};
        List<List<Integer>> ans = subsetsHelper(nums,new ArrayList<>(), new ArrayList<>() , 0);
        System.out.println(ans);

    }


    static List<List<Integer>> subsetsHelper(int[] nums, List<List<Integer>> ans, List<Integer> current, int i) {


        if (i == nums.length) {
            ans.add(new ArrayList<>(current));
            return ans;
        }

        current.add(nums[i]);
        subsetsHelper(nums, ans, current, i + 1);
        current.removeLast();
        subsetsHelper(nums, ans, current, i + 1);

        return ans;

    }


}


