# Introduction
This folder contains all the Java sample questions attempted in the journey through leetcode and the file name is the sub heading. The description under the subheadings will be the description of the problem statement and the logic behind solving them. In some files the problem statement and the logic will be commented
## Consecutive ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.
## Mountain Array
Given an array of integers arr, return true if and only if it is a valid mountain array.
 
Recall that arr is a mountain array if and only if:
- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
- arr[0] < arr[1] < ... < arr[i - 1] < arr[i]z
- arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
## Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.
## Merge Sorted Array
ou are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
## Find Numbers
Given an array nums of integers, return how many of them contain an even number of digits.
## Zero Index 
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
## Square Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
## Reverse Array
Given a sorted array must be printed in it's reverse order.
## Greater Elements
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. 

In this code, we start iterating the array from the end (i = length - 1) and maintain a __max__ variable to store the maximum value encountered so far. We replace each element with the current __max__ value and update __max__ if we encounter a larger value while traversing the array from right to left. 
## Palindrome 
Given an integer x, return true if x is a palindrome and false otherwise.

We begin by performing an initial check. If the input number x is negative, it cannot be a palindrome since palindromes are typically defined for positive numbers. In such cases, we immediately return false.

__We initialize two variables:__

__reversed:__ This variable will store the reversed value of the number x.

__temp:__ This variable is a temporary placeholder to manipulate the input number without modifying the original value.
We enter a loop that continues until temp becomes zero:

1. Inside the loop, we extract the last digit of temp using the modulo operator % and store it in the digit variable.
2. To reverse the number, we multiply the current value of reversed by 10 and add the extracted digit.
3. We then divide temp by 10 to remove the last digit and move on to the next iteration.
4. Once the loop is completed, we have reversed the entire number. Now, we compare the reversed value reversed with the original input value x.

If they are equal, it means the number is a palindrome, so we return true.
If they are not equal, it means the number is not a palindrome, so we return false.
## Largest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
### Approach
This code is used to find the longest common prefix of an array of strings, which is defined as the longest string that is a prefix of all the strings in the array. By sorting the array and then comparing the first and last elements, the code is able to find the common prefix that would be shared by all strings in the array.

1. Sort the elements of an array of strings called "strs" in lexicographic (alphabetical) order using the Arrays.sort(strs) method.
2. Assign the first element of the sorted array (the lexicographically smallest string) to a string variable s1.
3. Assign the last element of the sorted array (the lexicographically largest string) to a string variable s2.
4. Initialize an integer variable idx to 0.
5. Start a while loop that continues while idx is less than the length of s1 and s2.
6. Within the while loop, check if the character at the current index in s1 is equal to the character at the same index in s2. If the characters are equal, increment the value of idx by 1.
7. If the characters are not equal, exit the while loop.
8. Return the substring of s1 that starts from the first character and ends at the idxth character (exclusive).
## Parantheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.
## Waveform Sort
In this program sort the given array normally and then implement waveform sort

__For Ex:__  10, 5, 1, 2, 11, 22

1, 2, 5, 10, 11, 22

2, 1, 10, 5, 22, 11
## Print Distinct Element
## Leaders of an array
The element which is greater than the elements on it's right is called Leader of an array

Find how many leaders are there in the user given array

In this code, we start from the rightmost element of the array (arr[arr.length - 1]) and initialize it as the current maximum. We add this element to the leaders list since it is always a leader.

Then, we iterate from the second-to-last element (arr.length - 2) to the first element (index 0). If we encounter an element that is greater than the current maximum, we update the current maximum and add it to the leaders list.
## Pair Finder
Given a sorted array and a number x find the pair in array whose sum is closest to x

In this code, we use two pointers, __left__ and __right__, starting from the beginning and end of the array, respectively. We calculate the sum of the current pair and compare it with the target. If the absolute difference between the current sum and the target is smaller than the absolute difference between the closest sum found so far and the target, we update the closest sum and store the pair.

We then move the pointers based on the sum. If the sum is less than the target, we increment the left pointer to consider a larger element. If the sum is greater than or equal to the target, we decrement the right pointer to consider a smaller element.
## Single list
Sample code for Singly Linked List in Java
## Merge 2 Linked List
You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
## First Occurence
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

If we observe a bit the number of substrings of size needle length is length of haystack minus length of needle+1 so using two pointer we just used a for loop till (length of haystack-length of needle) and then checked if the character in needle is equal to character of haystack. If its equal we just kept on incrementing j. If the j is equal to needle length then we found our first substring that is equal to needle and we return the index of first character of that substring. If we dont find the substring in the haystack then we simply return -1.
## IP Address
Write a program to check whether the given IP address is valid or not (IPv4 version)
## IPv6 
Same question but for IPv6 IP address
## Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the i th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.

In the modified code, the plusOne method handles the carry-over case correctly. It starts from the last digit and checks if it is less than 9. If it is, it increments the digit by 1 and returns the updated array. If the digit is 9, it sets it to 0 and continues to the preceding digit. This process continues until a non-9 digit is found or the loop ends. If the loop ends without returning, it means there is a carry-over to the first digit, so a new array with an additional digit is created, with the first digit set to 1.
## Selection Sort   
Well does this need explanation
## Merge Sort
Well of course this doesn't need any explanation
## Quick Sort
This is the most important thing for placement
 ## Unique Elements
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

1. Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
2. Return k.

In this code, we use a two-pointer approach to remove duplicates in-place. The k index keeps track of the position for the next unique element. We start the loop from the second element (i = 1) and compare it with the element at index k-1. If they are different, it means we have found a new unique element. We update the nums[k] value with the current element and increment k. This process continues for the remaining elements in the array.

The main method demonstrates the usage by calling the removeDuplicates method with an example array. It prints the number of unique elements (k) and the modified array after removing duplicates.
## Frequency of elements
Given a non empty array of integers find the elements in the array which have the frequent value greater than or equal to the n value and print them in the order of decreasing frequency. If 2 or more elements have the same frequency print them in descending order based on their numberical value. If none of the elements match the condition print invalid using java 14

__Input:__ First line represents the number of elements in the array followed by the array elements in the second line. Third line consists of an integer representing the n value
__Output:__ The set of elements in the list that have frequency greater than or equal to n in the decreasing order

__Ex:__

__Input:__

10
1 2 2 3 4 5 5 5 6 7
2

__Output:__

5 2
## Cookies Problem
Jesse loves cookies and wants the sweetness of some cookies to be greater than value . To do this, two cookies with the least sweetness are repeatedly mixed. This creates a special combined cookie with:

sweetness  =(1 X Least sweet cookie + 2 X 2nd least sweet cookie).

This occurs until all the cookies have a sweetness >k.

Given the sweetness of a number of cookies, determine the minimum number of operations required. If it is not possible, return -1.

 ## Pattern Generation
 analyze the output given for an input N. Write a program that gives the similar pattern

Input 
1

OUtput:
1
1

Input :
2

OUtput:
1
2*2
2*2
1

