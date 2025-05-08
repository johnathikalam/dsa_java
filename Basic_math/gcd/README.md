# Find GCD or HCF of two numbers

Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.

Example 1:
Input:N1 = 9, N2 = 12
                
Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

Example 2:
Input:N1 = 20, N2 = 15

Output: 5
Explanation:Factors of 20: 1, 2, 4, 5
Factors of 15: 1, 3, 5
Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

- Algorithm
1) Initialise a variable gcd to 1. This variable will store the greatest common divisor of the input numbers n1 and n2.
2) Iterate from 1 to the minimum of n1 and n2.
    - We start from 1 because the GCD of any two numbers is at least 1, and it cannot be greater than the smaller of the two numbers.
3) At each iteration, if i is a common factor of both n1 and n2 update the gcd variable to i. We keep updating gcd as long as we find common factors.
4) After the iteration, the gcd variable will store the greatest common divisor of n1 and n2. Return this value as the output of the function.

### Complexity Analysis
- Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The algorithm iterates from 1 to the minimum of N1 and N2 and each iteration checks whether both the numbers are divisible by the current number (constant time operations).

- Space Complexity: O(1)as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variables.