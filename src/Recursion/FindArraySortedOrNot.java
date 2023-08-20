package Recursion;

public class FindArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,3,5,12,8,9};
        System.out.println(findSortedOrNot(arr,0));
    }

    private static boolean findSortedOrNot(int[] arr, int i) {
        if(i == arr.length - 1) return true;
        return arr[i] < arr[i+1] && findSortedOrNot(arr, i+1);
    }
}
