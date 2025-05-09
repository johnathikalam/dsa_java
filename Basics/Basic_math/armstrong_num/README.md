# Check if a number is Armstrong Number or not

Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example 1:
Input:N = 153

Output:True

Explanation: 13+53+33 = 1 + 125 + 27 = 153

Example 2:
Input:N = 371                

Output: True

Explanation: 33+53+13 = 27 + 343 + 1 = 371

### Algorithm / Intuition

- An Armstrong number, also known as a narcissistic number or plenary number, is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Number of digits: 3, 153 = 13+53+33

- We extract the digits of the number, raise each digit to the power of the total number of digits in the number. Sum up all the results obtained and check if the sum equals to the original number.

- Algorithm
1) Calculate the number of digits in the input number and store it in k. Read more about this Approach here: Count Digits

2) Initialise a variable sum to 0. This variable will store the sum of each digit raised to the power of number of digits in number.
    - Make a copy of the original number to store it in a temporary variable.
3) Run a while loop with the condition n>0 and at each iteration:

Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.
    - Add the digit ld raised to the power of k of the sum.
    - Update n by integer division with 10 effectively removing the last digit.
4) After the loop, check if the original input number is equal to the sum of the digits raised to the power of the number of digits in the number.

- If they are equal, return true indicating the number is an Armstrong number.
- If they are not equal, return false indicating that the number is not an Armstrong number.

### Complexity Analysis

- Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.

In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.
- Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.