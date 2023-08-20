package Arrayss;

import java.util.Arrays;

public class CloningArray {
    public static void main(String[] args) {
        int [] a = {1,36,4,523,32};
        int [] b  = a.clone();
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
