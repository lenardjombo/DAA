package ArrayOperations;
public class MaxValueInArray{
public static void main(String[] args) {
    //Step 1:Initialize an array
    int [] numbers = {100,11,130,1111,1,11111};
    //Step 2:Assume the first element is the maximum value
    int max = numbers[0];
    //Step 3:Iterate through the list and check for maximum value
    for(int i = 1;i < numbers.length; i++){
        if(numbers[i] > max){
            //update the maximum value if found
            max = numbers[i];
        }
    }
    System.out.println("The maximum number is: "+max);
}
}