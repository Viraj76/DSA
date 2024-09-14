package Sorting;
import java.util.Arrays;

/*
o(n^2) for worst average best cases
 */
public class SelectionSort {
    public static void main(String[] args) {
        int []nums={1,4,9,2,3,6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static public void selectionSort(int []nums){
        for(int i=0;i<nums.length-1; i++){
            int min=i;
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]<nums[min])
                    min=j;
            }
            if(min!=i){
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }
    }
}
