/*
 * Binary Search using 2D Arrays
 */
import java.util.Arrays;
public class BinarySearch2DArray {
    public static void main(String args[]) {
        int arr [][] = {
                     {4,8,12,16},
                     {10,20,30,40},
                     {15,20,25,30},
                     {30,31,32,33}

        };
        System.out.println(Arrays.toString(binarysearch(arr,40)));
    }
    static int[] binarysearch(int [][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            }

            if(matrix[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }
        return new int []{-1,-1};
    }
}
