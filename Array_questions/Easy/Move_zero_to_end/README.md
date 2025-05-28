# Move all Zeros to the end of the array

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

### Approch

- We can optimize the approach using 2 pointers

- Start two pointers fast and slow pointers.
- Use while until fsat pointer reaches the end of array.
    - Increment fast pointer if the arr[fast] is 0.
    - else swap the element at posotions of fast and slow and increment both pointers.
- Use another while until slow reaches the end of loop.
    - set the element at slow th position as zero.

### Complexity Analysis

Time Complexity: O(N), N = size of the array.

Space Complexity: O(1) as we are not using any extra space to solve this problem.