package AlgorithmAnalysisExample;

public class BinarySearch {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        System.out.println("Key found at index: "+findKey(nums,key));
    }
    public static int findKey(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //calculate the middle value
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
/*Binary Search Algorithm
 * Binary search algoithm divides the array into two halves and compares the target element with middle value iteratively until a match is found
 * 1.start
 * 2.Initialize input as an array and targeted element as an integer
 * 3.Iterate from index 0 and calculate the middle value
 * 4.if the middle value matches the target Return index of target
 * 5.If middle value is greater than the target ,drop the left side of the array
 * 6.If the middle value is less than the target,drop the right side of the array
 * 7.if no match is found return -1
 * 7.Return index of target
 * 6.stop
 */