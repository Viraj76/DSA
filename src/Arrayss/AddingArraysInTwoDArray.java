package Arrayss;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddingArraysInTwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][4]; // creates a 3x4 2D array
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] array3 = {9, 10, 11, 12};

        System.arraycopy(array1, 0, twoDArray[0], 0, array1.length);
        System.arraycopy(array2, 0, twoDArray[1], 0, array2.length);
        System.arraycopy(array3, 0, twoDArray[2], 0, array3.length);

        System.out.println(Arrays.toString(twoDArray[2]));

    }
}
