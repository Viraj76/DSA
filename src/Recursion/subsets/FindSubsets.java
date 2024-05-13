package Recursion.subsets;

import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
     whenever there is pattern like we are ignoring some elements and  taking some elements only
     then we can apply the subsets methods.
 */
public class FindSubsets {
    public static void main(String[] args) {
//        findSubsets("" , "abc");  //firs approach
//        ArrayList<String> ans = findSubsets("" , "abc");
//        System.out.println(ans);
        System.out.println(findSubsets("" , "abc" , new ArrayList<String>()));
    }

    private static ArrayList<String> findSubsets(String processed , String unProcessed , ArrayList<String> list){
        if(unProcessed.equals("")){
            list.add(processed);
            return list;
        }
         char c = unProcessed.charAt(0);
        findSubsets(processed + c , unProcessed.substring(1) , list);
        findSubsets(processed , unProcessed.substring(1) , list);

        return list;
    }

//    private static ArrayList<String> findSubsets(String processed, String unProcessed) {
//        if(unProcessed.equals("")){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//        ArrayList<String> left = findSubsets(processed + unProcessed.charAt(0) , unProcessed.substring(1));
//        ArrayList<String> right = findSubsets(processed, unProcessed.substring(1));
//
//        left.addAll(right);
//        return left;
//    }


//    private static void findSubsets(String processed, String unProcessed) {
//        if(unProcessed.equals("")){
//            System.out.println(processed);
//            return;
//        }
//        char c = unProcessed.charAt(0);
//        findSubsets(processed+c , unProcessed.substring(1));
//        findSubsets(processed, unProcessed.substring(1));
//    }  // first approach
}
