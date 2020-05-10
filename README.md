JAVA-coding-interview-Balazs

help from : https://github.com/partho-maple/coding-interview-gym






<h4 align="center">This repo contains around 300 Leetcode.com and 85 Algoexpert.io problems with solutions using Swift and Python</h4>

<p align="center">
  This repo contains my solutions to algorithmic problems in <a href="https://leetcode.com/parthobiswas007/">leetcode.com</a> and <a href="https://www.algoexpert.io/questions">algoexpert.io</a> written in <b>Java</b> and <b>Python</b>.
 

<p align="center">
  <a href="#About">About</a> •
  <a href="#Topics">Topics</a> •
  <a href="#Tips">Tips</a> •
  <a href="#LeetCode">LeetCode.com</a> •
  <a href="#AlgoExpert">AlgoExpert.io</a> •
  <a href="#References">References</a>
</p>

---

---

## About

I have solved quite a number of problems from several topics. See the below table for further details.

## Topics
- Binary Search
- Binary Search Tree
- Binary Tree(Segment Tree)
- N-aray Tree(Trie, Binary Indexed Tree)
- Graph(Dijkstra, Union Find, Kruskal, Prim's, Minimum Spanning Tree, Topological Ordering...etc)
- Stack
- Queue
- Array
- Sorting
- Hash Table
- Heap
- Linked list
- Bit Operation
- Dynamic programming
- Backtracking(Permutations & Combinations & Subsets...etc)
- Math
- and more...

## Questions from

- [Leetcode](https://leetcode.com)
- [Algoexpert.io](Algoexpert.io)
- Glassdoor
- Interviews
- ...



## Tips

- Check this **[Golden](https://tinyurl.com/uboo399)** post first.
- Whenever you solve a new question with some new techniques/algorithms, try to solve atleast 2 similar problem in a row. This way, your understanding to the new techniques/algorithms will be better.
- Solve all [leetcode cards](https://leetcode.com/explore/learn/)
- ...


---

1. Two Sum

    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1]

2. Max Consecutive Ones

    Given a binary array, find the maximum number of consecutive 1s in this array.

    Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3. Note:

    The input array will only contain 0 and 1. The length of input array is a positive integer and will not exceed 10,000
    
3.  Number Complement

    Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
    Example 1:

    Input: 5
    Output: 2
    Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

    Example 2:

    Input: 1
    Output: 0
    Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

    Note:

    The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.
    This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
    
4.   Hamming Distance

      The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

      Given two integers x and y, calculate the Hamming distance.

      Note:
      0 ≤ x, y < 231.

      Example:

      Input: x = 1, y = 4

      Output: 2

      Explanation:
      1   (0 0 0 1)
      4   (0 1 0 0)
             ↑   ↑

      The above arrows point to positions where the corresponding bits are different.
      
 5. Palindrome Number
 
     Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    Example 1:

    Input: 121
    Output: true
    Example 2:

    Input: -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    
6.  Merge Sorted Array

      Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

      Note:

      The number of elements initialized in nums1 and nums2 are m and n respectively.
      You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
      Example:

      Input:
      nums1 = [1,2,3,0,0,0], m = 3
      nums2 = [2,5,6],       n = 3

      Output: [1,2,2,3,5,6]
      
7. Jewels and Stones

      You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

      The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

      Example 1:

      Input: J = "aA", S = "aAAbbbb"
      Output: 3
      Example 2:

      Input: J = "z", S = "ZZ"
      Output: 0
      Note:

      S and J will consist of letters and have length at most 50.
      The characters in J are distinct.
      
8. 3Sum

    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    Note:

    The solution set must not contain duplicate triplets.

    Example:

    Given array nums = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]
9. Pascal's Triangle

      Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


      In Pascal's triangle, each number is the sum of the two numbers directly above it.

      Example:

      Input: 5
      Output:
      [
           [1],
          [1,1],
         [1,2,1],
        [1,3,3,1],
       [1,4,6,4,1]
      ]
10. Product of Array Except Self

    Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

    Example:

    Input:  [1,2,3,4]
    Output: [24,12,8,6]
    Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

    Note: Please solve it without division and in O(n).

    Follow up:
    Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
    
11. Largest Number At Least Twice of Others

    In a given integer array nums, there is always exactly one largest element.

    Find whether the largest element in the array is at least twice as much as every other number in the array.

    If it is, return the index of the largest element, otherwise return -1.

    Example 1:

    Input: nums = [3, 6, 1, 0]
    Output: 1
    Explanation: 6 is the largest integer, and for every other number in the array x,
    6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.


    Example 2:

    Input: nums = [1, 2, 3, 4]
    Output: -1
    Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


    Note:

    nums will have a length in the range [1, 50].
    Every nums[i] will be an integer in the range [0, 99].
    
12.  Sort an Array

      Given an array of integers nums, sort the array in ascending order.
      Example 1:

      Input: nums = [5,2,3,1]
      Output: [1,2,3,5]
      Example 2:

      Input: nums = [5,1,1,2,0,0]
      Output: [0,0,1,1,2,5]


      Constraints:

      1 <= nums.length <= 50000
      -50000 <= nums[i] <= 50000
     
13. Subarray Sum Equals K

    Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

    Example 1:

    Input:nums = [1,1,1], k = 2
    Output: 2


    Constraints:

    The length of the array is in range [1, 20,000].
    The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
