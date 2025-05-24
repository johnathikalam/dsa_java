# Find the Largest element in an array

Problem Statement: Given an array, we have to find the largest element in the array.

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 

### Approch

- Create a max variable and initialize it with arr[0].
- Use a for loop and compare it with other elements of the array
- If any element is greater than the max value, update max value with the element’s value
- Print the max variable.

### Complexity Analysis

Time Complexity: O(N)

Space Complexity: O(1)