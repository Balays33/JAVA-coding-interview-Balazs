/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 */

import java.util.Arrays;

public class SortanArray {
    private int[] result;
    private int help;
    
    public int[] solution(int[] nums){
        
        result = new int[nums.length];
        
        for (int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        /*
            for (int i = 0; i < nums.length; i++) {
                help = 0;
                for (int j = 0; j < nums.length-1; j++) {
                    if (nums[j] > nums[j+1]) {
                        help = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = help;
                    }
                }
                //System.out.println(" "+nums[i]);
            }
        */
        Arrays.sort(nums);
            
        System.out.println("\n ");
        for (int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
            result[i] = nums[i];
        }
    return result;
    }
    
}
