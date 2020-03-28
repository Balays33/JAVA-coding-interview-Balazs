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
 * Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 * 
 */
public class MaxConsecutiveOnes {
    
    private int result=0;
    private int counter=1;
    
    public int solution (int[] input) {
        
        for(int i=0;i<input.length;i++){
            System.out.println("input "+i+" :"+input[i]);
        }
        
        for(int i=0;i<input.length-1;i++){
            if (input[i]==1){
                counter =1;
                for(int j=i+1;j<input.length;j++){
                //System.out.println(j);
                if(input[j]==1){
                  counter++;  
                } else {
                    break;
                }
            }
                if(counter > result){
                    result = counter;
                }
            } 
        }
    
        System.out.println("output"+result);
    return result;
    }
    
}
