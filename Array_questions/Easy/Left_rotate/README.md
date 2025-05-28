# Left Rotate the Array by One

Problem Statement: Given an array of N integers, left rotate the array by one place.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.

### Approach: 
Here, in the given array :

n = 5,
arr[] = {1,2,3,4,5}
At first, we have to shift the array towards the left so, we store the value of the first index in a variable (let it be x).

Then we iterate the array from the 0th index to the n-1th index(why n-1 i will explain it below)

And then store the value present in the next index to the current index like this :

arr[i] = arr[i+1]
And to prevent its segmentation fault we will iterate it till n-1.

At last, put the value of variable x in the last index of the array.

### Complexity Analysis

Time Complexity: O(n), as we iterate through the array only once.

Space Complexity: O(1) as no extra space is used