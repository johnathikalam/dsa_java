# Count digits in a number

Problem Statement: Given an integer N, return the number of digits in N.

Example 1:
Input:N = 12345

Output:5

Explanation:  The number 12345 has 5 digits.

Example 2:
Input:N = 7789                
                
Output: 4

Explanation: The number 7789 has 4 digits.

### Solution 

- Brute Force approch
- Algorithm:
1) Initialize a counter to store number of digits.
2) While N is greater than 0, execute following steps:
    - Increment the counter.
    - Divide N with 10 to remove the last digit.
3) Value of the counter is the result.

### Complexity Analysis

- Time Complexity : O(log10N + 1) where N is the input number. 
The time complexity is determined by the number of digits in the input integer N. 
In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.
    - In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
    - In each iteration of the while loop we perform constant time operations like division and increment the counter.
- Space Complexity : O(1) as only a constant amount of additional memory for the counter regardless of size of the input number.