package LinearSearchAlgorithm;

public class SearchForMinimumValue {
    public static void main(String[] args) {
        int [] numbers = {70,80,90,100};
        System.out.println(Minvalue(numbers));
        
    }
    static int Minvalue(int [] arr){
        int min = arr[0];
        //Assume the length is != 0
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("The min value in the array is"+" ");
        return min;
    }
}
