//import java.util.*;

class Sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
    public static void main(String args[]){
        int arr[]={10,8,4,2,1};
        //time complexity O(^2)
        //bubble sort
        for(int i=0; i<arr.length-1; i++){ //n-1=5-1=4

            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        printArray(arr);
    }
}