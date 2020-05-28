/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author barcz
 * 
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
public class SortColors {
    
    private ArrayList<Integer> sortcolor = new ArrayList<Integer>();
    private int help;
    public void solution(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
            //sortcolor.add(nums[i]);
        }   
        
        
        
        System.out.println("\n");
        /*
        Collections.sort(sortcolor);
        for(int i=0;i<sortcolor.size();i++){
            System.out.print(" "+sortcolor.get(i));
        }
        */
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    help = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = help;
                }
            }  
        }
         
         for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
    }
    
}
