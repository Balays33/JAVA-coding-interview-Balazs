/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcza
 * 
 * 
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
public class RomantoInteger {
    public int result;
    private String[] romanNumbers = {"I","V","X","L","C","D","M","IV","IX"};
    private char[] romanNumbersChar = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};  
    private int[] value =           {1,  5, 10,  50, 100,500,1000};
    private char[] negyKilenc = {'I'};
    
     public int romanToInt(String s) {
         
         System.out.println("the passed String: "+s );
         
         //System.out.println(romanNumbers[0]);
         
         for(int i=0;i<s.length();i++){
             boolean isInclude = false;
             //System.out.println(Character.toUpperCase(s.charAt(i)));
             for(int j=0;j<romanNumbersChar.length;j++){
                 //char c = Character.toUpperCase(s.charAt(i));
                 if (Character.toUpperCase(s.charAt(i)) == romanNumbersChar[j]){   
                     isInclude = true;
                 }
             if (isInclude == false){
                  System.out.println("ERROR It is not roman numbers");
                  break;
             }
             }
             
            }
            /*
        I can be placed before V (5) and X (10) to make 4 and 9. 
        X can be placed before L (50) and C (100) to make 40 and 90. 
        C can be placed before D (500) and M (1000) to make 400 and 900.
         */
       
            for(int i=0;i<s.length()-1;i++){
                for(int j=i+1;j<s.length();j++){
                
                }
            }
            
         return result;
    }
    
}
