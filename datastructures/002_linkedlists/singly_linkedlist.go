package linkedlists

import "fmt"

type Node struct{
	data int
	next *Node
}

type SinglyLinkedList  struct {
  head *Node
}
// Operations
// 1.Tail insertion- inserting a node at the end
func (list *SinglyLinkedList) insert(data int){
	newNode := &Node{data: data} //1.create a new node

	if list.head == nil { // 2.check if list is empty
		list.head = newNode//3.set new node as head
		return 
	}
	current := list.head // 4.start from the head
	for current.next != nil{
		current = current.next // 5.go to the last node 
	}

	current.next = newNode // 6.attach new node at the end
}

//2.Delete the first node that contains specified data
func (list *SinglyLinkedList) Delete(data int){
	//1.check if the list is empty
	if list.head == nil{
		return // Return immediately - There's nothing to delete

	}

	// Handle deletion at head
	if list.head.data == data {
		//move the head pointer to the next node 
		// removing the first node from the list 
		list.head = list.head.next
		return
	}

	// Traverse the list to find the node before the target
	current := list.head
	for current.next != nil && current.next.data != data{
		current = current.next
	}

	// Delete the target node 
	if current.next != nil{
		current.next = current.next.next
	}
}


//3 . Display all the elements of the singly linkedlist in order
func (list *SinglyLinkedList) Display(){
	for current := list.head;current != nil;current=current.next{
		fmt.Printf("%d -> ", current.data)
		fmt.Println("nil")
	}
}