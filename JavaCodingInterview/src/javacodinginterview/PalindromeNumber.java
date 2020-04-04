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
 * Palindrome Number
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

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
 */
public class PalindromeNumber {
    
    private boolean result;
    private int helpNumber;
    private String newString = "";
    
    
     public boolean solution(int x) {
         
         System.out.println("input number: "+x);
         
         String sb = Integer.toString(x);
        
         //System.out.println("String "+sb.charAt(i));
         
         for(int i=sb.length();i>0;i--){
             System.out.println("String "+sb.charAt(i-1));
             newString = newString+sb.charAt(i-1);
            //System.out.println("i: "+i);
         }
         //helpNumber = Integer.parseInt(newString);
         
         System.out.println("input : "+sb+" output : "+newString);
         if (sb.equals(newString)){
             result = true;
         } else {
            result = false;
         }
        System.out.println("palindrome : "+result);
         return result;
    }
    
}
