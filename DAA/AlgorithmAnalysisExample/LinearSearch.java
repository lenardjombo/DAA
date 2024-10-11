package AlgorithmAnalysisExample;
public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println("Element found at index:  "+findKey(nums, target));
    }
    public static int findKey(int arr[],int target){
        int index = 0;
        for(int i = index;i < arr.length;i++){
            if(arr[i] == target){
                target = arr[i];
                return i;
            }
        }
        return -1;
    }
}
/*Linear Search Algorithm
 * Linear Search ALgorithm searches for targeted elements linearly/sequentially
 * 1.start
 * 2.Initialize input as an array and targeted element as an integer
 * 3.Iterate from index 0 and compare target element with every array element
 * 4.if an element matching the target is found then the index of target is found
 * 5.Return index of target
 * 6.stop
 */