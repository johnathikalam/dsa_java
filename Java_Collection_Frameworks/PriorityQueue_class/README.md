# PriorityQueue Class

Method & Description :

- *boolean add(E e)* : This method inserts the specified element into this priority queue.

- *void clear()* : This method removes all of the elements from this priority queue.

- *Comparator<? super E> comparator()* : This method returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.

- *boolean contains(Object o)* : This method returns true if this queue contains the specified element.

- *void forEach(Consumer<? super E> action)* : This method performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.

- *Iterator<E> iterator()* : This method returns an iterator over the elements in this queue.

- *boolean offer(E e)* : This method inserts the specified element into this priority queue.

- *boolean remove(Object o)* : This method removes a single instance of the specified element from this queue, if it is present.

- *boolean removeAll(Collection<?> c)* : This method removes all of this collection's elements that are also contained in the specified collection (optional operation).

- *boolean removeIf(Predicate<? super E> filter)* : This method removes all of the elements of this collection that satisfy the given predicate.

- *boolean retainAll(Collection<?> c)* : This method retains only the elements in this collection that are contained in the specified collection (optional operation).

- *Spliterator<E> spliterator()* : This method creates a late-binding and fail-fast Spliterator over the elements in this queue.

- *<T> T[] toArray(T[] a)* : This method returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array.