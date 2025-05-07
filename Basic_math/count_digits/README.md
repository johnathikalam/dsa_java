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