# Linked Lists 

A **linked list** is a linear data structure where elements (called **nodes**) are connected using pointers. Each node typically contains data and a reference to the next (and sometimes previous) node in the sequence.

This project includes implementations of:

* **Singly Linked List**
* **Doubly Linked List**
* **Circular Linked List**

---

## Singly Linked List

A **singly linked list** is a unidirectional list where:

* Each node contains data and a pointer to the **next** node.
* The last node’s `next` points to `nil`, marking the end of the list.

```bash
[10 | next] → [20 | next] → [30 | next] → nil
```

**Pros**:

* Simple to implement.
* Efficient insertions at the head.

**Cons**:

* No backward traversal.
* Deleting the last node requires full traversal.

**Common Pitfalls**

* Not handling the empty list (head == nil).

* Forgetting to update next pointers when inserting/deleting.

* Losing references (which causes memory leaks or breaks the chain).
---

## Doubly Linked List

A **doubly linked list** allows two-way traversal:

* Each node contains:

  * A pointer to the **next** node.
  * A pointer to the **previous** node.
* Allows easy insertion and deletion from both ends.

**Pros**:

* Bidirectional traversal.
* More efficient deletion of arbitrary nodes.

**Cons**:

* Requires extra memory for the `prev` pointer.

---

##  Circular Linked List

In a **circular linked list**, the last node points back to the first node, forming a loop.

* Can be **singly** or **doubly** linked.
* There is no `nil` — the list is continuous.
* Useful in applications like scheduling and buffering.

**Pros**:

* No true beginning or end.
* Efficient for cyclic iterations.

**Cons**:

* More complex to manage termination conditions during traversal.

---

