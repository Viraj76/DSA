package Recursion;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class FIndAllIndex {
    public static void main(String[] args) {
        /*
        Although it's not better to use because it's creating objects again and again
        i.e. passing list in the argument is the better approach where we are only concerned with the
        many reference variable but the single object.
         */
        ArrayList<Integer> ans = findAllIndex(new int []{1,2,3,4,5,6,6,7}, 6, 0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length) return list;

        if(arr[i] == target) list.add(i);

        ArrayList<Integer> allAnsBelowFunctions = findAllIndex(arr,target,i+1);

        list.addAll(allAnsBelowFunctions);

        return list;
    }
}
