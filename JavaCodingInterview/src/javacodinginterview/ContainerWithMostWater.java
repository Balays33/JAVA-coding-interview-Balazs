/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 * 
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 */
public class ContainerWithMostWater {
    
    private int result = 0;
    private int area =0;
    private int length;
    private int width;
    private int help;
    
     public int Solution(int[] height) {
         
         for(int i=0;i<height.length;i++){
             System.out.print(" "+height[i]);
             
         }
         
         //A=w*l
         //length
         //width
         
         for(int i=0;i<height.length-1;i++){
             for(int j=i+1;j<height.length;j++){
                 //System.out.print(" "+height[i]);
                 if (height[i]>height[j]){
                     area =height[j]*(j-i);
                     help = height[j];
                 } else {
                     area =height[i]*(j-i);
                     help = height[i];
                 }
             System.out.println("\n area: "+area);
             if(result<area){
                 result = area;
                 length = j-1;
                 width =  help;
             }
             }
             
         }
        
         System.out.println("\n Result: "+result+ " length: "+length+" width: "+width);
         return result;
    }
    
}
