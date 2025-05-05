// Package arrays provides implementations of basic array operations
// to help with understanding array manipulation and behavior in Go.

package arrays

import (
	"fmt"
)
// Defining array - syntax
var ages  = [10]int{1,2,3,4,5,6,7,8,9,10}


// An array is a fixed-size, ordered collection of elements of the same type,
// stored in contiguous memory locations. Slices are more commonly used in Go,
// as they offer dynamic sizing and greater flexibility.

// Sample array operations 
// 1. Accessing an Element at a Specific Position
func GetElement(arr []int, pos int) int {
	if pos < 0 || pos >= len(arr) {
		panic("index out of bounds")
	}
	return arr[pos]
}

// 2. Updating an Element at a Specific Position
func UpdateElement(arr []int, pos int, value int) []int {
	if pos < 0 || pos >= len(arr) {
		panic("index out of bounds")
	}
	arr[pos] = value
	return arr
}

// 3. Traversing the Array
func TraverseArray(arr []int) {
	for i, val := range arr {
		fmt.Printf("Index %d: %d\n", i, val)
	}
}

// 4. Searching for a Value (Linear Search)
func SearchElement(arr []int, target int) int {
	for i, val := range arr {
		if val == target {
			return i // return index of found element
		}
	}
	return -1 // not found
}

// 5. Sorting the Array (Ascending)
// To Do
