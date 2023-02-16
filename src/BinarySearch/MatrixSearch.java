package BinarySearch;

import java.util.Arrays;
// TIME COMPLEXITY O(N)
public class MatrixSearch {
    public static void main(String[] args) {
        int [][]matrix={
                {10,20,30,40},
                {23,25,36,60},
                {33,35,55,70},
                {43,45,75,80}
        };
        int target=75;
        System.out.println(Arrays.toString(searchRowColumn(matrix, target)));
    }
    static int[] searchRowColumn(int [][]matrix, int target){
        int row=0;
        int column=matrix.length-1;
        while (row< matrix.length && column>=0){
            if(matrix[row][column]==target)
                return new int[]{row,column};
            if(matrix[row][column]>target)
                column--;
            else
                row++;
        }
        return new int[]{-1,-1};
    }
}
