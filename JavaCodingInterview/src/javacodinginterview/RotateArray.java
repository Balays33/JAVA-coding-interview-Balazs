/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.rotate;

/**
 *
 * @author barcz
 */
public class RotateArray {
    
    int[] helpnums;
    ArrayList<Integer>  help = new ArrayList<Integer>();
    
    public void Solution(int[] nums, int k) {
        
        
        System.out.println("\n rotate:"+k);
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        helpnums = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            help.add(nums[i]);
        }
        /*
        System.out.println("\n ");
        for(int i=0;i<help.size();i++){
            System.out.print(" "+help.get(i));
        }
        */
        
        
        
        Collections.rotate(help, k);
        System.out.println("\n Rotated List: " + help);
        
        
        System.out.println("\n " );
        for(int i=0;i<k;i++){
            for(int j=0;j<nums.length;j++){
                if (j==0){
                    helpnums[j] = nums[nums.length-1];
                } 
                if (j>0){
                    helpnums[j] = nums[j-1];
                }    
                 
            }
            for(int x=0;x<nums.length;x++){
                nums[x] = helpnums[x];
            }
        }
        System.out.println("\n version 2:");
        /*
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    */
        runtest(nums);
        
    }
    
    public void runtest(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
    
}
