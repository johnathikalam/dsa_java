# Check if a number is prime or not

Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

Example 1:
Input:N = 2

Output:True

Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).

Example 2:
Input:N =10                

Output: False

Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.

### Algorithm / Intuition
- We can optimise the algorithm by only iterating up to the square root of n when checking for factors. This is because if n has a factor greater than its square root, it must also have a factor smaller than its square root.
- This property is symmetric about the square root of n by traversing just the first half we can avoid redundant iteration and computations improving the efficiency of the algorithm.

- Algorithm
1) Check whether the number is greater that or equal to 2.
2) Begin a loop from 1 to the square root of n. This loop iterates through possible factors of n. For each value of i within the loop:
    - Check if n is divisible by i without any remainder.
    - If n is divisible by i, it means i is a factor of n, so return false.
3) After the loop, return true.

### Complexity Analysis

- Time Complexity: O(sqrt(N))where N is the input number. The loop iterates up to the square root of n performing constant time operations at each step.

- Space Complexity : O(1) as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variables.