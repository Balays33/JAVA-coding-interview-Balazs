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
 * Jewels and Stone
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */
public class JewelsandStones {
    
    private int result;
    StringBuilder strBuilder = new StringBuilder("Core");
    StringBuilder strBuilderJ;
    StringBuilder strBuilderS;
    
    public int solution(String J, String S){
        System.out.println("\n J :  "+J);
        System.out.println("\n S :  "+S);
        
        strBuilderJ = new StringBuilder(J);
        strBuilderS = new StringBuilder(S);
    
        //System.out.println("\n S :  "+strBuilderJ);
        
        for(int i=0;i<strBuilderJ.length();i++){
            //System.out.println("\n S :  "+strBuilderS.charAt(i));
            for(int j=0;j<strBuilderS.length();j++){
                if (strBuilderJ.charAt(i) == strBuilderS.charAt(j) ){
                    result++;
                }
            }
            
        }
        
        
        System.out.println("\n "+result);
        return result;
    }
    
}
