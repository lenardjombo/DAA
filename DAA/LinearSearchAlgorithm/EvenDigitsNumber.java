package LinearSearchAlgorithm;

public class EvenDigitsNumber {
    public static void main(String[] args) {
        //Step 1:Initialize an array
        int [] nums = {1,12,133,1444,15555,166666};
        int result = findNumbers(nums);
        System.out.println("Output: "+result);
    }
    public static int findNumbers(int [] nums){
        //Step 2:Declare a counter
        int count = 0;
        for(int num:nums){
            //Step 3:Convert the array elements to String for checking length with ease
            if(String.valueOf(num).length() % 2 == 0){
                //Step 4:Increment the counter by one if an element with even digits is found
                count ++;
            }
        }
        //Step 5:Return the count of the elements with even digits
        return count;
    } 
}
