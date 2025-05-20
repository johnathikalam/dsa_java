# Recursive Insertion Sort Algorithm

Problem Statement: Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.

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
We have already solved this problem using the iterative method. To learn that approach, refer to the article: Insertion Sort Algorithm. In this article, we will solve this problem using recursion instead of using the loop.

### Approach: 
In the iterative method, we did the following:

- Take an element from the unsorted array(using an outer loop).
- Place it in its corresponding position in the sorted part(using an inner loop).
- Shift the remaining elements accordingly.
Now, in the recursive approach, we will just select the element recursively instead of using any loop. - This is the only change we will do the recursive insertion sort algorithm and the rest of the part will be completely the same as it was in the case of iterative insertion sort.

The approach will be the following:

- First, call the recursive function with the given array, the size of the array, and the index of the selected element(let's say i).
- Inside that recursive function, take the element at index i from the unsorted array.
- Then, place the element in its corresponding position in the sorted part(using swapping).
- After that, Shift the remaining elements accordingly.
- Finally, call the recursion increasing the index(i) by 1.
- The recursion will continue until the index reaches n(i.e. All the elements are covered).
Base Case: if(i == n) return;

- Note: Inside the recursion, the inner loop j will go back up to 1 not up to 0. Because, if the j becomes 0, we will try to access the element arr[j-1] i.e. arr[-1] while swapping. And so, it will give a runtime error.

### Best Case Time Complexity: 

The best case occurs if the given array is already sorted. And if the given array is already sorted, the recursion calls will only occur and inside the recursive function, the loop will run for 0 times(as each element is already present in its correct position). So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.