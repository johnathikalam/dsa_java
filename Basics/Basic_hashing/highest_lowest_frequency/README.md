# Find the highest/lowest frequency element

Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:

Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.

### Approch

We can use a map of value and frequency pair, in which we can easily update the frequency of an element if it is already present in the map, if it is not present in the map then insert it in the map with frequency as 1. After completing all the iterations, we will find the element with the highest frequency and the element with the lowest frequency.

The steps are as follows:

- Take a unordered_map<int, int> / HashMap of <Integer, Integer> pair.
- Use a for loop to iterate the array.
- If the element is not present in the map then insert it with frequency 1, otherwise increase the existing frequency by 1.
- After visiting the whole array, we will find the element with the highest frequency and the element with the lowest frequency by iterating the map.