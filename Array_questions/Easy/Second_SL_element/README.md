# Find Second Smallest and Second Largest Element in an array

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

### Approach:
Find the smallest and largest element in the array in a single traversal
After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
Similarly, we would find the largest element which is just smaller than the largest element we just found
Indeed, this is our second smallest and second largest element

### Complexity Analysis

Time Complexity: O(N), We do two linear traversals in our array

Space Complexity: O(1)


### Optimal Approach:
We would require four variables: small,second_small, large, and second_large. Variable small and second_small are initialized to INT_MAX while large and second_large are initialized to INT_MIN.

Second Smallest Algo:

- If the current element is smaller than ‘small’, then we update second_small and small variables
- Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
- Once we traverse the entire array, we would find the second smallest element in the variable second_small.

Second Largest Algo:

- If the current element is larger than ‘large’ then update second_large and large variables
- Else if the current element is larger than ‘second_large’ then we update the variable second_large.
- Once we traverse the entire array, we would find the second largest element in the variable second_large.

### Complexity Analysis

Time Complexity: O(N), Single-pass solution

Space Complexity: O(1)
