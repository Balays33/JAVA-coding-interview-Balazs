/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author barcz
 */
public class FirstMissingPositive {
    
    private int result;
    private ArrayList<Integer> mylist= new ArrayList<Integer>();
    private int maxhelp;
    private int help;
    private boolean igen = true;
    
    public int Solution(int[] nums){
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
            mylist.add(nums[i]);
        }
        Collections.sort(mylist);  
        System.out.println("\n ");
        for(int i=0;i<mylist.size();i++){
            System.out.print(" "+mylist.get(i));
        }
        //maxhelp = mylist.get(mylist.size()-1);
        //result = maxhelp+1;
       
        for(int i=0;i<mylist.size();i++){
            igen = false;
           for(int j=0;j<mylist.size();j++){
               if(i == mylist.get(j)){
                   igen = true;
                   break;
               }
               
           }
           if(!igen){
               result = i;
               break;
           }
           if(i>mylist.get(mylist.size()-1)){
               result = i;
               break;
           }
        }
        
        System.out.println("\n result:"+result);
        return result;
    }
    
}
