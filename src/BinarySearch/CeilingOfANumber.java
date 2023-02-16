package BinarySearch;


public class CeilingOfANumber {
    public static void main(String[] args) {
        int []array={23,45,65,67,78,89,90};
        int target=888;
        int ans=ceilingNumber(array,target);
        if(ans!=-1)
            System.out.println("Ceiling Number is "+array[ans]);
        else
            System.out.println("Not exist in array");
    }
    static int ceilingNumber(int []arr, int target){
        if(target>arr[arr.length-1])
            return -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
            else
                return mid+1;
        }
        //while loop will get violated when end<start
        return start;  // for floor return end
    }
}
