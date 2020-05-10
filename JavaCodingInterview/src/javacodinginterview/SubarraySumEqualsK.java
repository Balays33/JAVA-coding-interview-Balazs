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
public class SubarraySumEqualsK {
    
    
    private int result;
    private int help;
    private boolean esc = false;
    
    public int solution(int[] nums,int k){
    
        System.out.println("\n K:"+k);
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            
            //System.out.print(" "+nums[i]);
            if (nums[i]>k){
                continue;
            }
            if (nums[i] == k){
               result = 1;
               break;
            }
            if  (nums[i] < k){
                result = 1;
                help =0;
                for(int j=i+1;j<nums.length;j++){
                    help = help + nums[j];
                    System.out.println("\n num: "+ nums[i]+" help:"+help);
                    if (nums[i]+ help  == k){
                        result ++;
                        esc = true;
                        
                    }
                    if (nums[i]+ help  < k){
                        result ++;
                    }
                    if (nums[i]+ help  > k){
                        break;
                    }
                }
                
            }
            if(esc == true){
                break;
            }
            
        }
    System.out.println("\n result: "+result);
    return result;
    }
    
}
