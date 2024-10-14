package BinarySearchAlgorithm.BinarysearchIn2DArray;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int target = 8;
        int [] ans = search(nums,target);
        System.out.println("Output: "+Arrays.toString(ans));
    }
    public static int [] search(int [][] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //iterate through the array
        for(int row = start;row < arr.length; row++){
            for(int col = start; col < arr[row].length;col++){
                int mid = start + (end - start)/2;
                if(arr[row][mid] < target){
                    start = mid + 1;
                }else if(arr[row][mid] > target){
                    end = mid - 1;
                }else{
                    return new int[] {mid};
                };
            }
        }
        return new int[]{-1,-1};
    }
}
