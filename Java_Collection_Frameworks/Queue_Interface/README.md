The Queue interface is provided in java.util package and it implements the Collection interface. The queue implements FIFO i.e. First In First Out. This means that the elements entered first are the ones that are deleted first. A queue is generally used to hold elements before processing them. Once an element is processed then it is removed from the queue and next item is picked for processing.

Method & Description

*boolean add(E e)* : This method inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

*E element()* : This method retrieves, but does not remove, the head of this queue.

*boolean offer(E e)* : This method inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.

*E peek()* : This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

*E poll()* : This method retrieves and removes the head of this queue, or returns null if this queue is empty.

*E remove()* : This method retrieves and removes the head of this queue.

The following are the classes that implement a Queue to use the functionalities of a Queue
- LinkedList
- ArrayDeque
- PriorityQueue

The following are the interfaces that extend the Queue interface -

- Deque
- BlockingQueue
- BlockingDeque