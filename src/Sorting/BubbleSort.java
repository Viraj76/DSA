package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []nums={5,3,2,1,4};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
   static public void bubble(int []nums){
        boolean swapped;  // if the array is already sorted then j will only run for j=0 and keep swapped as false hence entire loop will break
        for (int i = 0; i < nums.length-1; i++) {   //this is pass , in every pass we will get one sorted element at respective index
            swapped=false;
            for(int j=0; j< nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    swapping(nums,j);
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    private static void swapping(int[] nums, int j) {
        int temp=nums[j];
        nums[j]=nums[j+1];
        nums[j+1]=temp;
    }

}
