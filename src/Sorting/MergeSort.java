
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
        int[] numbers = { 0,45,-4,-1,3,2,6,3,7,5 };
        int start = 0;
        int end = numbers.length - 1;


        mergeSorting(numbers, start, end);
        System.out.println(Arrays.toString(numbers));


    }

    private static void mergeSorting(int[] numbers, int start, int end) {

        if(start == end) return;
        int mid = (start + end ) / 2;
        mergeSorting(numbers,start,mid);
        mergeSorting(numbers,mid+1,end);

        merging(numbers,start,mid,end);


    }

    private static void merging(int[] numbers, int start, int mid, int end) {
        int [] temp = new int[end - start + 1];
        int i = 0;
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end){

            if(numbers[left] <= numbers[right]){
                temp[i++] = numbers[left];
                left++;
            }
            else{
                temp[i++] = numbers[right];
                right++;
            }
        }
        while(left <= mid){
            temp[i++] = numbers[left];
            left++;
        }

        while (right <= end){
            temp[i++] = numbers[right];
            right++;
        }
        for (int k = start; k<=end; k++){
            numbers[k] = temp[k-start];
        }
    }
}