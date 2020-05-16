/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 * Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based. You may assume that each input would have exactly one solution and you may not use the same element twice. Example:

Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {
    
    private int[] result = new int[2];
    private int help;
    
    public int[] solution(int[] numbers, int target) {
        
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        
        // sort out the array
        
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-1;j++){
                if (numbers[j] > numbers[j+1]){
                    help = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1]= help;
                }
            
        }
        }
        System.out.println("\n Sorted array");
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println("\n target:"+target);
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (numbers[i]+numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
        
        }
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
        return result;
    }
    
}
