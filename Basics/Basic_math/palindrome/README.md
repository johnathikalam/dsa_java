# Check if a number is Palindrome or Not

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Example 1:
Input:N = 4554

Output:Palindrome Number

Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

Example 2:
Input:N = 7789                

Output: Not Palindrome

Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

- Algorithm:
1) Initialize a variable to store reversed number
2) Store the user input value to another variable for final comparison.
3) While N > 0, Execute the following:
    - revNum * 10 + last digit in the input value.
    - N / 10 to remove the last digit form the input value.
4) Check the stored variable and revNum are equal or not.

### Complexity Analysis

- Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.

    - In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
    - In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.

- Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.