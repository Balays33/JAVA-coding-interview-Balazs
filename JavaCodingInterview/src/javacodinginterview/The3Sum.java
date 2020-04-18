/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author barcz
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class The3Sum {
    
    
    private List<Integer> result = new ArrayList<>();
    
    
    public List<Integer> solution(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        System.out.println("\n ");
        
         for(int i=0;i<nums.length-2;i++){
            //System.out.print(" "+nums[i]);
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                    }
                }
            }
        }
        
         for(int i=0;i<result.size();i++){
            System.out.print(" "+result.get(i));
        }
        return result;
    }
    
}
