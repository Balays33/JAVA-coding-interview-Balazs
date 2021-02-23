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
public class LongestSubstringWithoutRepeatingCharacters {
    
    private int result;
    private char[] mystring;
    
      public int Solutin(String s) {
          
          System.out.println("\n String : "+s);
          mystring = new char[s.length()];
        
          System.out.println("\n mystring size : "+mystring.length);
          for(int i=0;i<mystring.length;i++){
              mystring[i] = s.charAt(i);
          }
          
          for(int i=0;i<mystring.length;i++){
              System.out.print(" "+mystring[i]);
          }
          //System.out.println("\n "+mystring[0]);
          
          return result;
    }
}
