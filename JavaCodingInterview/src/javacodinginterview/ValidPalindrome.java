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
public class ValidPalindrome {
    
    public boolean result;
    private String newString = "";
    
    
    public boolean isPalindrome(String s) {
        
        System.out.println("Input : "+s);
        
        newString = s.replaceAll("[^A-Za-z]+", "").toLowerCase();
        System.out.println("New String : "+newString);

        
        
        for(int i=0;i<newString.length()/2;i++){
            if (newString.charAt(i) == newString.charAt(newString.length()-1-i)){
                result = true;
            
            }
        
        }
        
        
        System.out.println("\n Result : "+result);
        return result;
    }
    
}
