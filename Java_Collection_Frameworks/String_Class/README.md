# String Methods

- *char charAt(int index)* : This method returns the char value at the specified index.

- *int codePointAt(int index)* : This method returns the character (Unicode code point) at the specified index.

- *int codePointBefore(int index)* : This method returns the character (Unicode code point) before the specified index.

- *int codePointCount(int beginIndex, int endIndex)* : This method returns the number of Unicode code points in the specified text range of this String.

- *int compareTo(String anotherString)* : This method compares two strings lexicographically.

- *int compareToIgnoreCase(String str)* : This method compares two strings lexicographically, ignoring case differences.

- *String concat(String str)* : This method concatenates the specified string to the end of this string.

- *boolean contains(CharSequence s)* : This method ceturns true if and only if this string contains the specified sequence of char values.

- *boolean contentEquals(CharSequence cs)* : This method compares this string to the specified CharSequence.

- *static String copyValueOf(char[] data)* : This method returns a String that represents the character sequence in the array specified.

- *boolean endsWith(String suffix)* : This method tests if this string ends with the specified suffix.

- *boolean equals(Object anObject)* : This method compares this string to the specified object.

- *boolean equalsIgnoreCase(String anotherString)* : This method compares this String to another String, ignoring case considerations.

- *static String format(String format, Object... args)* : This method returns a formatted string using the specified format string and arguments.

- *byte[] getBytes()* : This method encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.

- *void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)* : This method copies characters from this string into the destination character array.

- *int hashCode()* : This method returns a hash code for this string.

- *int indexOf(int ch)* : This method returns the index within this string of the first occurrence of the specified character.

- *String intern()* : This method returns a canonical representation for the string object.

- *boolean isEmpty()* : This method returns true if, and only if, length() is 0.

- *int lastIndexOf(int ch)* : This method returns the index within this string of the last occurrence of the specified character.

- *int length()* : This method returns the length of this string.

- *boolean matches(String regex)* : This method tells whether or not this string matches the given regular expression.

- *String replace(char oldChar, char newChar)* : This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

- *String replaceAll(String regex, String replacement)* : This method replaces each substring of this string that matches the given regular expression with the given replacement.

- *String replaceFirst(String regex, String replacement)* : This method replaces the first substring of this string that matches the given regular expression with the given replacement.

- *String[] split(String regex)* : This method splits this string around matches of the given regular expression.

- *boolean startsWith(String prefix)* : This method tests if this string starts with the specified prefix.

- *CharSequence subSequence(int beginIndex, int endIndex)* : This method returns a new character sequence that is a subsequence of this sequence.

- *String substring(int beginIndex)* : This method returns a new string that is a substring of this string.

- *char[] toCharArray()* : This method converts this string to a new character array.

- *String toLowerCase()* : This method converts all of the characters in this String to lower case using the rules of the default locale.

- *String toString()* : This method returns the string itself.

- *String toUpperCase()* : This method converts all of the characters in this String to upper case using the rules of the default locale.

- *String trim()* : This method returns a copy of the string, with leading and trailing whitespace omitted.

- *static String valueOf(boolean b)* : This method returns the string representation of the boolean argument.