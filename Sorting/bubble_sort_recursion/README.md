# Recursive Bubble Sort Algorithm

Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

Example 2:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5

### Solution:
We have already solved this problem using the iterative method. To learn that approach, refer to the article: Bubble Sort Algorithm. In this article, we will solve this problem using recursion instead of using the loop.

### Approach: 
In the iterative method, we usually select a range(using a loop), and for each range, we repeatedly swap(using another loop) the adjacent elements(if arr[i] > arr[i+1]) until the maximum element in that range reaches the end.

The flow of the algorithm goes like this: in the first iteration, we select the range 0 to n-1 and swap adjacent elements(if arr[i] > arr[i+1]) until the maximum element reaches the (n-1)th index. Similarly, in the second iteration, the second maximum element reaches the (n-2)th index. So, the sorting basically occurs in the backward direction.  After (n-1) such iterations we get the sorted array.

Now, in the recursive approach, we will just select the range recursively instead of using any loop. This is the only change we will do the recursive bubble sort algorithm and the rest of the part will be completely the same as it was in the case of iterative bubble sort.

The approach will be the following:

First, call the recursive function with the given array and the range of n(size of the array).
Inside that recursive function, repeatedly swap 2 adjacent elements if arr[j] > arr[j+1].
Here, the maximum element of the unsorted array reaches the end of the unsorted array after each recursive call.
Each time after step 2, call the recursion again decreasing the range by 1.
The recursion will continue until the range(i.e. the size) of the array is reduced to 1.
Base Case: if(n == 1) return;

### Optimized approach (Reducing time complexity for the best case):
The best case occurs if the given array is already sorted. We can reduce the time complexity to O(N) by just adding a small check inside the recursive function. 

We will check in the first recursion call if any swap is taking place. If the array is already sorted no swap will occur and we will return from the recursion call. 
Thus the number of recursions will be just 1. And our overall time complexity will be O(N).