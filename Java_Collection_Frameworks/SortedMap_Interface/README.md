- The SortedMap interface extends Map. It ensures that the entries are maintained in an ascending key order.

- TreeMap class implements the SortedMap interface

- SortedMap entries can be easily navigated. SortedMap provided a method entrySet() which provides all the entries in form of set.


Advantages of SortedMap:
- SortedMap ensures that the map is always sorted in ascending order of the keys. Whenever a key-value pair is added to the sortedmap, it is re-sorted
- Being sorted, sortedmap is very efficient in searches. In the case of large read-only datasets, sortedmap is an ideal choice to be implemented.
- We can customize the sorting mechanism by using a comparator on the key type.

Disadvantages of SortedMap:
- As a sortedmap has to be sorted every time an entry is added or changed, it becomes a performance bottleneck where changes are very frequent. In such cases, sortedmap is not preferred.
- As sortedMap maintains sort ability based on key, a key should be comparable and thus we cannot use a custom key if it is not implementing the comparable interface.