/*
 * Implementation of binary search using Array 
 * Time complexity:-O(logn)
 */
public class BinarySearch {
    //binarySearch
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end   = arr.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if ( target > arr[mid]) {
                start = mid + 1;
            }else{
                //element found
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String args []){
        //
        int []arr = {-20,10,0,10,20,30,40,50,60};
        int target = 50;
        int elementFound= binarySearch(arr, target);
        System.out.println(elementFound);
    }
}

