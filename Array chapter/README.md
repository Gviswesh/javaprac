# Array Series
This is a series from the LeetCode Array Chapter. This subfolder consists of the question and the solution provided me in Java. This series givesn an in-depth understanding in the concept of arrays which I think is very important before attempting DSA and Dynamic Programming/
## Move Zeros
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

In this code, we use a two-pointer approach to move non-zero elements to the front of the array. The k index keeps track of the position for the next non-zero element. We iterate through the array, and if we encounter a non-zero element, we update the nums[k] value with the current element and increment k. This process ensures that all non-zero elements are moved to the front.

After moving the non-zero elements, we fill the remaining elements with zeros by iterating from k to the end of the array.

The main method demonstrates the usage by calling the moveZeros method with an example array. It prints the array before and after moving the zeros.
## Parity Sort
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array tv  hat satisfies this condition.

## Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

1. Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
2. Return k.

In this code, we use a two-pointer approach to remove elements equal to val in-place. The k index keeps track of the position for the next element not equal to val. We iterate through the array, and if we encounter an element not equal to val, we update the nums[k] value with the current element and increment k. This process ensures that all elements not equal to val are moved to the front of the array.

The main method demonstrates the usage by calling the removeElement method with an example array and value. It prints the array before and after removing val, along with the count of elements not equal to val.
## Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

__Ex 1__:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

In this code, we maintain three variables (max1, max2, and max3) to keep track of the first, second, and third distinct maximum numbers found so far. We iterate through the array, skipping duplicates. If a number is larger than any of the existing maximums or if the maximums are not yet set, we update the variables accordingly.

In the end, if the third maximum exists (i.e., max3 is not null), we return max3. Otherwise, we return max1 as the maximum number.

The main method demonstrates the usage by calling the thirdMax method with an example array. It prints the third distinct maximum number or the maximum number if the third maximum does not exist.
## Height
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

You are given two arrays, heights and expected, representing the current order of students and the expected order of students, respectively.

heights[i] represents the height of the ith student in the current order.
expected[i] represents the expected height of the ith student in the desired order.
The task is to find the number of indices (students) where their height in the current order is different from their expected height in the desired order.

For example, let's say heights = [165, 170, 155, 180, 160] and expected = [155, 160, 165, 170, 180]. To find the mismatched indices:

- heights[0] = 165, expected[0] = 155 (mismatch)
- heights[1] = 170, expected[1] = 160 (mismatch)
- heights[2] = 155, expected[2] = 165 (mismatch)
- heights[3] = 180, expected[3] = 170 (mismatch)
- heights[4] = 160, expected[4] = 180 (mismatch)
## Sorted Square Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

__Input:__ nums = [-4,-1,0,3,10]
__Output:__ [0,1,9,16,100]
__Explanation:__ After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
## Disappear
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

* for (int num : nums) { numSet.add(num); }

This loop iterates over each element num in the input array nums. It adds each element num to the numSet, effectively creating a set of unique elements from the input array.
* for (int i = 1; i <= n; i++) 

This loop iterates over the numbers in the range [1, n], where n is the length of the input array. It starts from 1 and goes up to n.
* if (!numSet.contains(i)) 

This if condition checks whether the current number i is present in the numSet (the set containing all unique elements from the input array). If i is not found in the set, it means it is missing from the input array.
* result.add(i);

If the number i is missing (not found in the set), it is added to the result list, as it is one of the missing numbers in the range [1, n].