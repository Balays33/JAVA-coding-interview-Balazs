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
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

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
 */
public class PlusOne {
    
    private int[] result;
    
    private int nextn;
    public int[] plusOne(int[] digits) {
        
        for(int i=0;i<digits.length;i++){
            System.out.print(" "+digits[i]);
            
        }
        result = new int[digits.length];
        //System.out.println("\n size of result"+result.length);
        

        StringBuilder strNum = new StringBuilder();

        for (int num : digits) {
            strNum.append(num);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        System.out.println("\n "+finalInt);
        nextn = finalInt+1;
        System.out.println(nextn);
        
        String str = String.valueOf(nextn);
	System.out.println("String is: "+str);
        
        
        for(int i=0;i<result.length;i++){
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println("test "+str.charAt(i));
            
        }
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
            
        }
        return result;
    }
    
}
