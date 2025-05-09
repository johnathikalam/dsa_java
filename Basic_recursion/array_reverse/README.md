# Reverse a given Array

Problem Statement: You are given an array. The task is to reverse the array and print it. 

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.


Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.

Create a function that takes an array, start index, and end index of the array as parameters.
Swap the elements present  at the start and end index, 
The portion of the array left to be reversed is arr[start+1,end-1]. Make a recursive call to reverse the rest of the array. While calling recursion pass start +1  and ends - 1 as parameters for the shrunk array. Repeat step 2.
Continue recursion as long as the ‘start < end’ condition is satisfied. This is the base case for our recursion.