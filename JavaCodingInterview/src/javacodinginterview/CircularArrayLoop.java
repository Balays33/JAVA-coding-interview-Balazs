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
public class CircularArrayLoop {
    
    boolean result = false;
    private int mainstep =0;
    private boolean progpro = true;
    
    public boolean solution(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
       
        System.out.println("\n ");
        
        int index = 0;
        int step = 0;
         while (progpro){
           step = nums[index];   
           //System.out.println(" "+step);
           if (step == 0){
               System.out.println("  it is not a cycle, because the cycle's step = 0");
               progpro = false;
           }
           if (step>0){
               index += step;
               if (index == nums.length){
                   System.out.println("  It is  cycle ");
                   break;
               }
               if (index > nums.length){
                   System.out.println("  It is not a cycle, because the cycle's step did not reach the start");
                   break;
               }
               step = nums[index];
               System.out.println("\t index: "+index+"\t step: "+step);
           }
           if (step<0){
               if (index-Math.abs(step) == 0){
                   index = 0;
               }
               else if (index-Math.abs(step)<0){
                   index = nums.length-Math.abs(step);
                   step = nums[index];
               }
               else if (index-Math.abs(step)>0){
                   index -=  Math.abs(step);
                   step = nums[index];
               }
               
               
               System.out.println("\t index: "+index+"\t step: "+step);
           } 
           mainstep++;
           if (mainstep > nums.length){
                System.out.println("  it is not a cycle, because the cycle's step infinity");
                progpro = false;
           }
         }
        
        return result;
    }
    
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            int dir = nums[i] > 0 ? 1 : -1;
            int move = nums[i];
            int rnd = 0;
            while (rnd < n) {
                int p = (move + i) % n;
                if (move + i < 0) p = (n + p) % n;
                if (dir * nums[p] <= 0) break;
                if (p == i && rnd > 0) return true;
                else if (p == i) break;
                move += nums[p];
                rnd++;
            }
        }
        return false;
    }
    
}
