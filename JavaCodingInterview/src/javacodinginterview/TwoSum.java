/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 * 
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */
public class TwoSum {
    
    private int[] result = new int[2];
    
    public int[] solution (int[] nums, int target) {
        
        
        for(int i=0;i<nums.length;i++){
            System.out.println(" nums: "+nums[i]);
        }
        System.out.println("target"+target);
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            
                if (nums[i]!=nums[j]){
                if (nums[i]+nums[j]==target){
                    result[0]=nums[i];
                    result[1]=nums[j];
                    break;
                }
                }
            }
        }
      
        if (result[0]==0){
             System.out.println(" no result ");
        } else{
        System.out.println(result[0]+":"+result[1]);
        }
        return result;
    }
    
}
