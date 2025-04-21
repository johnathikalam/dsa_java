Method & Description

*void add(int index, Object obj)* : Inserts obj into the invoking list at the index passed in the index. Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, no elements are overwritten.

*boolean addAll(int index, Collection c)* : Inserts all elements of c into the invoking list at the index passed in the index. Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, no elements are overwritten. Returns true if the invoking list changes and returns false otherwise.

*Object get(int index)*: Returns the object stored at the specified index within the invoking collection.

	
*int indexOf(Object obj)*: Returns the index of the first instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.

	
*int lastIndexOf(Object obj)*: Returns the index of the last instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.

*ListIterator listIterator( )*: Returns an iterator to the start of the invoking list.

*ListIterator listIterator(int index)*: Returns an iterator to the invoking list that begins at the specified index.

*Object remove(int index)*: Removes the element at position index from the invoking list and returns the deleted element. The resulting list is compacted. That is, the indexes of subsequent elements are decremented by one.

*Object set(int index, Object obj)*: Assigns obj to the location specified by index within the invoking list.

*List subList(int start, int end)*: Returns a list that includes elements from start to end.1 in the invoking list. Elements in the returned list are also referenced by the invoking object.