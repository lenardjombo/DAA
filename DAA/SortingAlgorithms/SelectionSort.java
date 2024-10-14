package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 15, 9, 1, 22, 11};
        
        System.out.println("Unsorted Array:");
        printArray(array);

        // Call the selection sort method
        selectionSort(array);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Method to perform the selection sort algorithm
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        
        // Outer loop to iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIndex = i;
            
            // Inner loop to find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                // Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
