# Arrays Class Methods

- *static <T> List<T> asList(T... a)* : This method returns a fixed-size list backed by the specified array.

- *static int binarySearch(byte[] a, byte key)* : This method searches the specified array of bytes for the specified value using the binary search algorithm. This can be byte, char, double, float, int, long, object, short.

- *static int compare(boolean[] a, boolean[] b)* : This method compares two boolean arrays lexicographically. This can boolean, byte, char, double, float, int, long, short.

- *compareUnsigned(byte[] a, byte[] b)* : This method compares two byte arrays lexicographically, numerically treating elements as unsigned. This can be byte, int, long, short.

- *static boolean[] copyOf(boolean[] original, int newLength)* : This method copies the specified array, truncating or padding with false (if necessary) so the copy has the specified length. This can be boolean[], byte[], char[], double[], float[], int[], long[], short[].

- *static boolean[] copyOfRange(boolean[] original, int from, int to)* :  This method copies the specified range of the specified array into a new array. This can be boolean[], byte[], char[], double[], int[], long[], short[].

- *static boolean equals(boolean[] a, boolean[] a2)* : This method returns true if the two specified arrays of booleans are equal to one another. This can be boolean, byte, char, double, float, int, long, short, object.

- *static int hashCode(boolean[] a)* : This method returns a hash code based on the contents of the specified array.

- *static void sort(byte[] a)* : This method sorts the specified array of bytes into ascending numerical order.

- *	
static String toString(boolean[] a)* : This method returns a string representation of the contents of the specified array of boolean.
