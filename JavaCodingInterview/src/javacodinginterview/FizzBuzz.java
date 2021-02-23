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
 */
public class FizzBuzz {
    
    private List<String> result = new ArrayList<String>();
    
    public List<String> fizzBuzz(int n) {
        System.out.println("passed number:"+n);
        for(int i=0;i<n;i++){
            //System.out.println(i+1);
            if(((i+1)%3==0) && ((i+1)%5==0)){
                result.add(i, "FizzBuzz");
            } 
            else if((i+1)%3==0){
                //System.out.println(i+1);
                result.add(i, "Fizz");
            } 
            else if((i+1)%5==0){
                result.add(i, "Buzz");
            }
            else{
               result.add(i, Integer.toString(i+1));
            }
        }
        
        for(int j=0;j<result.size();j++){
            System.out.println(result.get(j));
        }
        
        //System.out.println("\n" +result.get(0));
        return result;
    }
    
    
}
