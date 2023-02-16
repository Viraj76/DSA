package BinarySearch;

// Sorted array  (asc+dsc)

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,45,65};
//        int []arr={7,6,5,4,3,2,1};
        int target=5;
        int len=arr.length;
        int ans =orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int []arr, int target){
        int start =0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;  //This is optimized way to find middle one , otherwise number may exist the int range of java
            if(target==arr[mid])
                return mid;
            if(isAsc){
                if(target>arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(target>arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
