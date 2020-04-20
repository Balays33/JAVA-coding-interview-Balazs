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
 * In a given integer array nums, there is always exactly one largest element.

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
 */
public class LargestNumberAtLeastTwiceofOthers {
    
    private int result;
    private int bigN = 0;
    private int secondBN =0;
    private int indexofbigN;
    
    public int dominantIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(bigN<nums[i]){
                bigN= nums[i];
                indexofbigN = i;
            } 
        }
         
        for(int i=0;i<nums.length;i++){
            if (secondBN<nums[i] && nums[i]!=bigN){
                secondBN = nums[i];
            }   
        }
        if ((secondBN*2)<=bigN ){
            result =  indexofbigN;
        } else {
            result= -1;
        }
        
        System.out.println("\n the biggest number :"+bigN+" and the second biggest number:"+secondBN);
        System.out.println("\n index of the biggest number: "+result);
        return result;
    }
}
    

