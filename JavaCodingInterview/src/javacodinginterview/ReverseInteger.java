/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcza
 */
public class ReverseInteger {
    int result;
    
     public int solution(int x) {
        result = 0;
        System.out.println("input number : "+ x);
        /*-231 <= x <= 231 - 1
         Math.pow(i, 3)
        double test = -Math.pow(2, 31);
        double test2 = Math.pow(2, 31)-1;
        System.out.println("test number : "+ test+"test2"+test2);
        double test3 = Math.pow(2, 64);
        System.out.println("test3 number : "+ test3);
        
        if ((x >= -Math.pow(2, 31)) && (x <= Math.pow(2, 31)-1)){
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
        */
          if ((x >= -2147483648) && (x <= 2147483647)){
            System.out.println("OK");
            while(x != 0) {
                int digit = x % 10;
                result = result * 10 + digit;
                x /= 10;
             }
            
        } else {
            System.out.println("ERROR");
        }
        System.out.println("result : "+result);  
        return result;
    }
    
}
