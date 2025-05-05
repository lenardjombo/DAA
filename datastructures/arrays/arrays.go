// Package arrays provides implementations of basic array operations
// to help with understanding array manipulation and behavior in Go.

package arrays

// Defining array - syntax
var ages  = [10]int{1,2,3,4,5,6,7,8,9,10}


// An array is a fixed-size, ordered collection of elements of the same type,
// stored in contiguous memory locations. Slices are more commonly used in Go,
// as they offer dynamic sizing and greater flexibility.

// Sample array operations 
// 1. Reversing an array 
func ReverseArray(arr []int ) []int{
	start , end := 0, len(arr)-1
	for start < end{ // No need to swap the middle element
		arr[start],arr[end] = arr[end],arr[start]
		start++
		end--
	}
	return arr
}

// 2.Insert an element at a specific position 
// works for slices due to the increase of 
// data type size after insertion
func InsertElement(arr []int,pos int,value int)[] int {
	// Check if position is less than or greater than array size 
	if pos < 0 || pos > len(arr){
		panic("Pos out of bonds")
	}
	//create space for the new element
	arr = append(arr, 0)

	//shift the elements to the right starting from the end
	for i := len(arr)-1;i < pos;i--{
		if arr[pos] == arr[i]{
			arr[i] = arr[i-1]
		}
	}
	return arr
}

// 3.Delete an element
func Delete(arr []int,value int)[] int{
	
	 return arr
}