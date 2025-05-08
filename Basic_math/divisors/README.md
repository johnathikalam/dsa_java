# Print all Divisors of a given Number

Problem Statement: Given an integer N, return all divisors of N.

A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Example 1:
Input:N = 36

Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]

Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.

Example 2:
Input:N =12                

Output: [1, 2, 3, 4, 6, 12]

Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12. 

### Algorithm / Intuition

- A brute force approach would be to iterate from 1 to n checking each value if it divides n without leaving a remainder. For each divisor found, store it in an array and a count of divisors is maintained. After iterating through all possible values, the size of the array is updated with the count of divisors and the array is returned.

- Algorithm:

1) Initialise an array to store the divisors.

2) Iterate from 1 to n/2 using a loop variable ‘i’. For each value of ‘i’:

    - Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).
    - If i is a divisor, store it in the array of divisors and increment the count of divisors.
3) After the loop, return the array of divisors.

### Complexity Analysis

- Time Complexity: O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check if it is a divisor.

- Space Complexity : O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check if it is a divisor.