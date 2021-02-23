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

14. Two Sum II - Input array is sorted

    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

    Note:

    Your returned answers (both index1 and index2) are not zero-based.
    You may assume that each input would have exactly one solution and you may not use the same element twice.
    Example:

    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
  
15. Sort Colors

    Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

    Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

    Note: You are not suppose to use the library's sort function for this problem.

    Example:

    Input: [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
    Follow up:

    A rather straight forward solution is a two-pass algorithm using counting sort.
    First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
    Could you come up with a one-pass algorithm using only constant space?
   
16.  4Sum

      Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

      Note:

      The solution set must not contain duplicate quadruplets.

      Example:

      Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

      A solution set is:
      [
        [-1,  0, 0, 1],
        [-2, -1, 1, 2],
        [-2,  0, 0, 2]
      ]
17.Container With Most Water

    Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

    Note: You may not slant the container and n is at least 2.

    The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

    Example:

    Input: [1,8,6,2,5,4,8,3,7]
    Output: 49
18. Container With Most Water

      Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

      Note: You may not slant the container and n is at least 2.

      The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

      Example:

      Input: [1,8,6,2,5,4,8,3,7]
      Output: 49

19.Find the Duplicate Number

    Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

    Example 1:

    Input: [1,3,4,2,2]
    Output: 2
    Example 2:

    Input: [3,1,3,4,2]
    Output: 3
    Note:

    You must not modify the array (assume the array is read only).
    You must use only constant, O(1) extra space.
    Your runtime complexity should be less than O(n2).
    There is only one duplicate number in the array, but it could be repeated more than once.
  
  
22. Longest Mountain in Array

      Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:

      B.length >= 3
      There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
      (Note that B could be any subarray of A, including the entire array A.)

      Given an array A of integers, return the length of the longest mountain. 

      Return 0 if there is no mountain.

      Example 1:

      Input: [2,1,4,7,3,2,5]
      Output: 5
      Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
      Example 2:

      Input: [2,2,2]
      Output: 0
      Explanation: There is no mountain.
      Note:

      0 <= A.length <= 10000
      0 <= A[i] <= 10000
      Follow up:

      Can you solve it using only one pass?
      Can you solve it in O(1) space?
      
23. Plus One

      Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

      The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

      You may assume the integer does not contain any leading zero, except the number 0 itself.

      Example 1:

      Input: [1,2,3]
      Output: [1,2,4]
      Explanation: The array represents the integer 123.
      Example 2:

      Input: [4,3,2,1]
      Output: [4,3,2,2]
      Explanation: The array represents the integer 4321.
     
24. Prison Cells After N Days

      There are 8 prison cells in a row, and each cell is either occupied or vacant.

      Each day, whether the cell is occupied or vacant changes according to the following rules:

      If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
      Otherwise, it becomes vacant.
      (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)

      We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.

      Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)



      Example 1:

      Input: cells = [0,1,0,1,1,0,0,1], N = 7
      Output: [0,0,1,1,0,0,0,0]
      Explanation: 
      The following table summarizes the state of the prison on each day:
      Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
      Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
      Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
      Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
      Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
      Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
      Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
      Day 7: [0, 0, 1, 1, 0, 0, 0, 0]

      Example 2:

      Input: cells = [1,0,0,1,0,0,1,0], N = 1000000000
      Output: [0,0,1,1,1,1,1,0]
     
25. Check If It Is a Straight Line

      https://gist.github.com/SuryaPratapK/472fe9638529ecfb03d15bc6cb818cf6

      You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

      Example 1:

      Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
      Output: true
      Example 2:

      Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
      Output: false

      Constraints:

      2 <= coordinates.length <= 1000
      coordinates[i].length == 2
      -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
      coordinates contains no duplicate point.
26. Friends Of Appropriate Ages

          Some people will make friend requests. The list of their ages is given and ages[i] is the age of the ith person. 

          Person A will NOT friend request person B (B != A) if any of the following conditions are true:

          age[B] <= 0.5 * age[A] + 7
          age[B] > age[A]
          age[B] > 100 && age[A] < 100
          Otherwise, A will friend request B.

          Note that if A requests B, B does not necessarily request A.  Also, people will not friend request themselves.

          How many total friend requests are made?

          Example 1:

          Input: [16,16]
          Output: 2
          Explanation: 2 people friend request each other.
          Example 2:

          Input: [16,17,18]
          Output: 2
          Explanation: Friend requests are made 17 -> 16, 18 -> 17.
          Example 3:

          Input: [20,30,100,110,120]
          Output: 3
          Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
 27. Monotonic Array

        An array is monotonic if it is either monotone increasing or monotone decreasing.

        An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

        Return true if and only if the given array A is monotonic.



        Example 1:

        Input: [1,2,2,3]
        Output: true
        Example 2:

        Input: [6,5,4,4]
        Output: true
        Example 3:

        Input: [1,3,2]
        Output: false
        Example 4:

        Input: [1,2,4,5]
        Output: true
        Example 5:

        Input: [1,1,1]
        Output: true

28.  Toeplitz Matrix

      A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

      Now given an M x N matrix, return True if and only if the matrix is Toeplitz.


      Example 1:

      Input:
      matrix = [
        [1,2,3,4],
        [5,1,2,3],
        [9,5,1,2]
      ]
      Output: True
      Explanation:
      In the above grid, the diagonals are:
      "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
      In each diagonal all elements are the same, so the answer is True.
      Example 2:

      Input:
      matrix = [
        [1,2],
        [2,2]
      ]
      Output: False
      Explanation:
      The diagonal "[1, 2]" has different elements.

      Note:

      matrix will be a 2D array of integers.
      matrix will have a number of rows and columns in range [1, 20].
      matrix[i][j] will be integers in range [0, 99].

      Follow up:

      What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
      What if the matrix is so large that you can only load up a partial row into the memory at once?
   
29.  Rotate Array

      Given an array, rotate the array to the right by k steps, where k is non-negative.

      Follow up:

      Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
      Could you do it in-place with O(1) extra space?


      Example 1:

      Input: nums = [1,2,3,4,5,6,7], k = 3
      Output: [5,6,7,1,2,3,4]
      Explanation:
      rotate 1 steps to the right: [7,1,2,3,4,5,6]
      rotate 2 steps to the right: [6,7,1,2,3,4,5]
      rotate 3 steps to the right: [5,6,7,1,2,3,4]
      Example 2:

      Input: nums = [-1,-100,3,99], k = 2
      Output: [3,99,-1,-100]
      Explanation: 
      rotate 1 steps to the right: [99,-1,-100,3]
      rotate 2 steps to the right: [3,99,-1,-100]


      Constraints:

      1 <= nums.length <= 2 * 10^4
      It's guaranteed that nums[i] fits in a 32 bit-signed integer.
      k >= 0
33. Fizz Buzz

      Write a program that outputs the string representation of numbers from 1 to n.

      But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
      For numbers which are multiples of both three and five output “FizzBuzz”.

      Example:

      n = 15,

      Return:
      [
          "1",
          "2",
          "Fizz",
          "4",
          "Buzz",
          "Fizz",
          "7",
          "8",  
          "Fizz",
          "Buzz",
          "11",
          "Fizz",
          "13",
          "14",
          "FizzBuzz"
      ]
