package Arrayss;

import java.util.Arrays;



public class RotateLeft {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] rotate = {1, 2, 3, 4};

        int[] indices = findMaxIndicesAfterRotations(a, rotate);

        System.out.println(Arrays.toString(indices));  // Output should be [1, 0, 2, 1]
    }

    public static int[] findMaxIndicesAfterRotations(int[] a, int[] rotate) {
        int n = a.length;
        int[] indices = new int[rotate.length];

        // Find the index of the maximum element in the original array
        int maxIndex = findMaxIndex(a);

        for (int i = 0; i < rotate.length; i++) {
            int rotations = rotate[i] % n;  // Reduce unnecessary full rotations
            int newIndex = (maxIndex - rotations + n) % n;
            indices[i] = newIndex;
        }

        return indices;
    }

    public static int findMaxIndex(int[] a) {
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
