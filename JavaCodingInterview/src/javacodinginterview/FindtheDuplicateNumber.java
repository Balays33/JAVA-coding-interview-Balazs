/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;

/**
 *
 * @author barcz
 */
public class FindtheDuplicateNumber {
    
    private int result;
    private int help;
    private ArrayList<Integer> mylist =  new ArrayList<Integer>();
    
    
    public int solution(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        for(int i=0;i<nums.length-1;i++){
            help=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(help == nums[j]){
                    result= help;
                    mylist.add(help);
                    break;
                }
            }
        }
        System.out.println("\n result: "+result);
        for(int i=0;i<mylist.size();i++){
            System.out.print(" "+mylist.get(i));
        }
        
        return result;
    }
    
}
