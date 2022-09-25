import java.util.Arrays;


public class quickSort {
    public static void main(String args[]){
    int [] arr ={10,8,9,7,6};  
  //sort(arr, 0, high:arr.length-1);
 // System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    }
    //best Time complexity  O(nlogn)
    static void sort(int [] nums, int low, int high){
        if(low >= high){
            return;
        }
        int start =low;
        int end =high;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        //swapping 
        while (start <= end){
            //also a reason why if its already sorted it will not swap
            while (nums[start] <pivot){
                start++;
            }
            while (nums[start] > pivot){
                end--;
            }
            if (start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
       // recursion Now my pivot is at correct index please sort two halves
        sort(nums, low, end);
        sort(nums, start, high);
    }
}
