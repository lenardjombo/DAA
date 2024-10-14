package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted Array:");
        printArray(array);
        System.out.println();

        // Call the bubble sort method
        sort(array);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }
    //method to perform the bubble sort
    public static void sort(int arr[]){
        int n = arr.length;
        //Outer loop for each count
        for(int i=0;i < n-1;i++){
            boolean swapped = false;
            //Inner loop for comparing adjacent elements
            for(int j = 0;j < n - i -1;j++){
                //compare the current element with the next one
                if(arr[j] > arr[j+1]){
                    //swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    //set swapped to true if it occurred
                    swapped = true;
                }
            }
            //If no swapping occurred,means that the array was already sorted
            if(!swapped)break;
        }
    }
    //method to print the sorted array
    public static void printArray(int arr[]){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}




/* **********Bubble Sort Algorithm in Java******
*Bubble sort is one of the simplest sorting algorithms.
*It works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order.
*This process is repeated until the list is sorted. 
*Steps of Bubble Sort:
1.Compare adjacent elements: Start with the first two elements of the array and compare them.
2.Swap if necessary: If the first element is greater than the second, swap them.
3.Move to the next pair: Continue to the next pair of adjacent elements, compare, and swap if necessary.
4.Repeat: This process repeats until the entire array is sorted.
*/

/*Bubble sort Pseudocode
 * bubbleSort(array)
  for i from 0 to length(array) - 1
    for j from 0 to length(array) - i - 1
      if array[j] > array[j + 1]
        swap(array[j], array[j + 1])

 */