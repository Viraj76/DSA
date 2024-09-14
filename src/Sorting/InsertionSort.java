package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {3,4,2,1,5};
        insertionSort(nums);
    }
    static public void insertionSort(int []nums){
        int n = nums.length;
        for (int i=1; i<n; i++){
            int j = i-1;
            int currentNum = nums[i];

            while(j>=0 && nums[j] > currentNum){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] =currentNum;
        }
        System.out.println(Arrays.toString(nums));
    }

}
