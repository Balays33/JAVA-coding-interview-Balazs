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
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.
 */
public class MonotonicArray {
    
    private boolean result = false;
    private boolean increasing = true;
    private int help = 0;
    
     public boolean isMonotonic(int[] A) {
         
         for(int i=0;i<A.length;i++){
             System.out.print(" "+A[i]);
         }
         
         for(int i=0;i<A.length-1;i++){
             if(A[i]==A[i+1]){
                 help=0;
                 result = true;
             }
             if(A[i]<A[i+1]){
                 System.out.println("increasing");
                 if(help == 0 || help ==1){
                     help = 1;
                     result = true;
                 } else result = false;
                 
             }
             if(A[i]>A[i+1]){
                 System.out.println("decreasing");
                 if(help == 0 || help ==2){
                     help = 2;
                     result = true;
                 } result = false;
                 
             }
         }
        
         
         System.out.println("result : "+result);
         return result;
        
    }
    
}
