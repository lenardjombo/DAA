package ArrayOperations;
public class ReversedArray {
    public static void main(String[] args) {
        //Step 1:Initialize an array
        int [] numbers   = {1,2,3,4,5,6,7,8,9,10};
        //Step 2:Use Two-Pointer Approach to swap the elements so as to reverse the array
        int start = 0;
        int end = numbers.length - 1;
        //Step 3:Iterate through the list and swap the elements using the pointers
        for(int i = 0;i < numbers.length; i++){
            //swap the elements
            if(start < end){
                int temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;

            //move the pointers to the middle 
            start++;
            end--;
            }
            
        }
        //Step 4:Print the reversed array
        System.out.println("The reversed array is: ");
        for(int i:numbers){
            System.out.print(i+ " ");
        }
    }
}
