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
public class ReverseString {
    
    char help[] = {};
    
     public void reverseString(char[] s) {
         
         
         
         for(int i=0;i<s.length;i++){
             System.out.print(" "+s[i]);
         }
         
         System.out.println("\n ");
         for(int i=(s.length)-1;i>=0;i--){
             System.out.print(" "+s[i]);
         
         }
        
    }
    
}
