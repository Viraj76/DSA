package Sorting;

// We can use it when we have 3 elements in an array in we have to sort in one pass

import javax.script.ScriptEngine;
import java.lang.reflect.Array;
import java.util.Arrays;

public class DutchFlagALgorithm {
    public static void main(String[] args) {
        int [] nums={2,2};
        DNF(nums);
    }
    private static void DNF(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int currentIndex=0;
        while(currentIndex<=end){
            switch (nums[currentIndex]){
                case 0 -> {
                    int temp=nums[start];
                    nums[start]=nums[currentIndex];
                    nums[currentIndex]=temp;
                    currentIndex++;
                    start++;
                }
                case 1 -> currentIndex++;
                case 2 -> {
                    int temp=nums[currentIndex];
                    nums[currentIndex]=nums[end];
                    nums[end]=temp;
                    end--;            //only end because what if mid = end = 2  ? think about it ?
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
