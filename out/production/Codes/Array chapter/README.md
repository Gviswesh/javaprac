# Array Series
## Move Zeros
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

In this code, we use a two-pointer approach to move non-zero elements to the front of the array. The k index keeps track of the position for the next non-zero element. We iterate through the array, and if we encounter a non-zero element, we update the nums[k] value with the current element and increment k. This process ensures that all non-zero elements are moved to the front.

After moving the non-zero elements, we fill the remaining elements with zeros by iterating from k to the end of the array.

The main method demonstrates the usage by calling the moveZeros method with an example array. It prints the array before and after moving the zeros.
## Parity Sort
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

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
