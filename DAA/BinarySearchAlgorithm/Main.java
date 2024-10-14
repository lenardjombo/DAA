package BinarySearchAlgorithm;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {-18,-16,0,1,2,3,4,5,6};
        int ans = binarysearch(numbers, 6);
        System.out.print("Output: "+ans);
    }
    //return the index
    // return -1 if does not exist
    static int binarysearch(int [] arr,int target){
        int start = 0;
        int end = arr.length -1;
        // while(start <= end){
        //     //find the middle element
        //     int mid = start + (end - start)/2 ;
        //     if(target < arr[mid]){
        //         end = mid -1;
        //     }else if(target > arr[mid]){
        //         start = mid + 1;
        //     }else{
        //         return mid;
        //     }
        // }

        //Using a for loop instead
        for(int i = start;i<end;i++){
            //find the middle element
            //also
            int mid = start + (end - start)>>1;
            // int mid = start + (end -start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
