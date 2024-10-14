package LinearSearchAlgorithm;

public class SearchForAnElement {
    public static void main(String[] args) {
        //Step 1:Initialize an array and target
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }
    static int LinearSearch(int [] arr,int target){
        //Check for the length of the array
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        //run a for loop
        for(int i = 0;i < arr.length; i++){
            //check for element at every index if it is equal to target
            int element = arr[i];
            if(element == target){
                System.out.println("Element found at index: ");
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
