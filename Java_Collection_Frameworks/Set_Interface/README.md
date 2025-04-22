- A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.

- The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.

- Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ.

Method & Description:

- *add()* : Adds an object to the collection.

- *clear()* : Removes all objects from the collection.

- *contains()* : Returns true if a specified object is an element within the collection.

- *isEmpty()* : Returns true if the collection has no elements.

- *iterator()* : Returns an Iterator object for the collection, which may be used to retrieve an object.

- *remove()* : Removes a specified object from the collection.

- *size()* : Returns the number of elements in the collection.