/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 * Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:

B.length >= 3
There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
(Note that B could be any subarray of A, including the entire array A.)

Given an array A of integers, return the length of the longest mountain. 

Return 0 if there is no mountain.

Example 1:

Input: [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
Example 2:

Input: [2,2,2]
Output: 0
Explanation: There is no mountain.
 */
public class LongestMountaininArray {
    
    private int result;
    private int left =0;
    private int right =0;
    private int kozer;
    
     public int solution(int[] A) {
         // this is wrong concept
         if (A.length<3){
             result = 0;
             System.out.println("\n result: "+result);
             return result;
         }
        int help = A[0];
        boolean isItFlate = false;
        for(int i=1;i<A.length;i++){
             if( help == A[i]){
                 isItFlate = true;
             } else {
                 isItFlate = false;
             }
         }
        if(isItFlate == true){
            result = 0;
            System.out.println("\n There is no mountain ");
            return result;
        }
         
         for(int i=0;i<A.length;i++){
             System.out.print(" "+A[i]);
         }
         System.out.println("\n ");
         kozer = A.length/2; 
         System.out.println("\n kozep ertek "+kozer);
         
         for (int i = 1; i < A.length - 1; i++) {
             System.out.println(" " + A[i]);
             left = A[i-1];
             right = A[i+1];
             System.out.println(" left " + left+" right "+right);
             if (left == right ){
                 System.out.println("mountain");
             }
             
             
         }
         return result;
    }
     
    public int longestMountain(int[] A) {
        int N = A.length;
        int ans = 0, base = 0;
        while (base < N) {
            int end = base;
            // if base is a left-boundary
            if (end + 1 < N && A[end] < A[end + 1]) {
                // set end to the peak of this potential mountain
                while (end + 1 < N && A[end] < A[end + 1]) end++;

                // if end is really a peak..
                if (end + 1 < N && A[end] > A[end + 1]) {
                    // set end to the right-boundary of mountain
                    while (end + 1 < N && A[end] > A[end + 1]) end++;
                    // record candidate answer
                    ans = Math.max(ans, end - base + 1);
                }
            }

            base = Math.max(end, base + 1);
        }
        System.out.println("ans :"+ans);
        return ans;
    }
    
    public int MountainLongest(int[] A){
        
        int startpoint;
        int finishpoint;
        int countersize =0;
        int localresult = 0;
    
        for(int i=0;i<A.length-1;i++){
            countersize = 0;
            startpoint = A[i];
            for(int j=i+1;j<A.length;j++){
                //finishpoint = A[j];
                if (A[j] >= startpoint){
                    countersize++;
                    }
            }
            if (localresult< countersize){
                localresult = countersize;
            }
        }
        
        
        System.out.println("localresult :"+localresult);
    return localresult;
    }
}
