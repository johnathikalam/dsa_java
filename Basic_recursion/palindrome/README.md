# Check if the given String is Palindrome or not

Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.


### Approch:

- In this approach, we check the string using functional recursion where firstly, the letters on the two ends of the string (start, end) are compared to see if they’re the same or not.
- If they’re the same then we simply call recursion for the next elements (start+1, end-1) and so on until the start becomes greater than or equal to the end. 
- If at any point the start and the end differ, we return false stating that the string is not a palindrome.
- Otherwise, if the base condition is reached, then the string is obviously a palindrome and we return true.

### Complexity Analysis

- Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements N/2 times and swap them}.

- Space Complexity: O(1) { The elements of the given array are swapped in place so no extra space is required}.