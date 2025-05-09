# Print Fibonacci Series up to Nth term

Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Examples:

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

In this approach, instead of printing the Fibonacci series till N, we’re going to print the Nth Fibonacci number using functional recursion with multiple function calls.

Similar kinds of multiple-function calls would be used in implementing the Fibonacci series where any Nth Fibonacci number can be written as a sum of (N-1)th and (N-2)th Fibonacci numbers. So, the function result would look like this:

Fibonacci(N) = Fibonacci(N-1) + Fibonacci(N-2)

Results from both the function calls would be summed and returned to the main function call.

Approach:

Similar to all the recursion problems we’ve seen before, we need a base case in this problem too in order for recursion to not go infinitely. Here, we notice that the Fibonacci series start from N = 1, where we initialize its value as 1. 
Assume Fibonacci(0) = 0. So, Fibonacci(2) = 1+0 = 1 as the Nth Fibonacci number is the sum of the previous two Fibonacci numbers.
Similarly, we call Fibonacci(N-1) and Fibonacci(N-2) and return their sum. Both the function calls Fibonacci(N-1) and Fibonacci(N-2) would be computed individually one by one until the base condition is reached for both and then they return back to the main function.