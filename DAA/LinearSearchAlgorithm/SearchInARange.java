package LinearSearchAlgorithm;

public class SearchInARange {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        int ans = LinearSearch(nums, target,1,4);

        System.out.println(ans);
    }
    static int LinearSearch(int [] arr,int target,int start,int end){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        //run a for loop
        for(int i = start;i < end; i++){
            //check for element at every index if it is equal to target
            int element = arr[i];
            if(element == target){
                System.out.print("Element found at index: ");
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
