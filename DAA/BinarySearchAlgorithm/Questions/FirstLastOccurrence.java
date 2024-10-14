//Java program to find first and last occurrence of an element in given sorted array
package BinarySearchAlgorithm.Questions;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int [] nums = {5,7,7,7,7,8,9,10};
        int target = 7;
        int [] result = searchRange(nums, target);
        System.out.println("FirstPosition: "+result[0]);
        System.out.println("LastPosition: "+result[1]);
    }
    public static int [] searchRange (int [] nums,int target){
        int [] result = new int [2];
        result[0] = findFirstPosition(nums,target);
        result[1] = findLastPosition(nums,target);
        return result;
    }
    //Function to find the position of the target
    private static int findFirstPosition(int [] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int firstPosition = -1;
        while (start <= end) {
            int mid = start + (end - start)>>1;
            if(nums[mid] == target){
                firstPosition = mid;//Record the position
                end = mid - 1;//continue searching on the left side
            }else if(nums[mid] > target){
                end  = mid - 1;
            }else{
                start = mid + 1;
            };
        }
        return firstPosition;
    }
    //Function to find the last position of the target
    private static int findLastPosition(int [] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int lastPosition = -1;
        while (start <= end) {
            int mid = start + (end - start)>>1;
            if(nums[mid] == target){
                lastPosition = mid;//record the position
                start = mid + 1;//continue searching on the right side
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return lastPosition;
    }
}
