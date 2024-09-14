
package Sorting;
import java.lang.*;
import java.util.Arrays;

class MergeSort {
//    static public void Merging(int[] numbers, int left, int mid, int right) {
//        int[] tempArray = new int[25];
//        int i, left_end, num_elements, tmp_pos;
//        left_end = (mid - 1);
//        tmp_pos = left;
//        num_elements = (right - left + 1);
//        while ((left <= left_end) && (mid <= right)) {
//            if (numbers[left] <= numbers[mid])
//                tempArray[tmp_pos++] = numbers[left++];
//            else
//                tempArray[tmp_pos++] = numbers[mid++];
//        }
//
//        while (left <= left_end)
//            tempArray[tmp_pos++] = numbers[left++];
//        while (mid <= right)
//            tempArray[tmp_pos++] = numbers[mid++];
//
//        for (i = 0; i < num_elements; i++) {
//            numbers[right] = tempArray[right];
//            right--;
//        }
//
//        System.out.print("Merged -: ");
//        System.out.println(Arrays.toString(numbers));
//    }
//
//    static public void mergeSort(int[] numbers, int left, int right) {
//        int mid;
//        if (right > left) {
//            mid = (right + left) / 2;
//            System.out.println("Left Sub array...");
//
//            for(int i=left; i<=mid; i++){
//                System.out.print(numbers[i]+" ");
//            }
//            System.out.println();
//            mergeSort(numbers, left, mid);
//            System.out.println("\nRight Sub array...");
//            for(int i=mid+1; i<=right; i++){
//                System.out.print(numbers[i]+" ");
//            }
//            System.out.println();
//            mergeSort(numbers, (mid + 1), right);
//            System.out.println("\nMerging... ");
//            for(int i=left; i<=mid; i++){
//                System.out.print(numbers[i]+" ");
//            }
//            System.out.println();
//            for(int i=mid+1; i<=right; i++){
//                System.out.print(numbers[i]+" ");
//            }
//            System.out.println();
//            Merging(numbers, left, (mid + 1), right);
//        }
//    }
    public static void main(String[] args) {
        int[] numbers = { 3,2,6,3,7,5,6,9,0,11,10};



    }
}