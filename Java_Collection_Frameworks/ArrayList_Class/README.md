# ArrayList

Method & Description:

- *boolean add(E e)* : This method appends the specified element to the end of this list.

- *boolean addAll(Collection<? extends E> c)* : This method appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.

- *void clear()* : This method removes all of the elements from this list.

- *Object clone()* : This method returns a shallow copy of this ArrayList instance.

- *boolean contains(Object o)* : This method returns true if this list contains the specified element.

- *void ensureCapacity(int minCapacity)* : This increases the capacity of this ArrayList.

- *E get(int index)* : This method returns the element at the specified position in this list.

- *int indexOf(Object o)* : This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

- *boolean isEmpty()* : This method returns true if this list contains no elements.

- *Iterator<E> iterator()* : This method returns an iterator over the elements in this list in proper sequence.

- *int lastIndexOf(Object o)* : This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

- *ListIterator<E> listIterator()* : This method returns an list iterator over the elements in this list in proper sequence.

- *E remove(int index)* : This method removes the element at the specified position in this list.

- *boolean removeAll(Collection<?> c)* : Removes from this list all of its elements that are contained in the specified collection.

- *protected void removeIf(int fromIndex, int toIndex)* : This method Removes all of the elements of this collection that satisfy the given predicate.

- *boolean retainAll(Collection<?> c)* : Retains from this list all of its elements that are contained in the specified collection.

- *E set(int index, E element)* : This method replaces the element at the specified position in this list with the specified element.

- *int size()* : This method returns the number of elements in this list.

- *Spliterator<E> spliterator()* : This method creates a late-binding and fail-fast Spliterator over the elements in this list.

- *List<E> subList(int fromIndex, int toIndex)* : This method returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

- *Object[] toArray()* : This method returns an array containing all of the elements in this list in proper sequence (from first to last element).

- *void trimToSize()* : This method trims the capacity of this ArrayList instance to be the list's current size.