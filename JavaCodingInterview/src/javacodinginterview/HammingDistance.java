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
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance {
    
    private int result;
    private StringBuilder sb = new StringBuilder();
    
    public int solution(int x,int y){
        
        System.out.println("input x: "+x);
        System.out.println("input y: "+y);
        
        // converting to binary and representing it in a string
     
      String inputBinaryX = Integer.toBinaryString(x);
      System.out.println(inputBinaryX);
      int lengthX= inputBinaryX.length();
        
      String inputBinaryY = Integer.toBinaryString(y);
      System.out.println(inputBinaryY);
      int lengthY= inputBinaryY.length();
      
     
      makeE(lengthX,lengthY,inputBinaryX,inputBinaryY);
        
    System.out.println("Hamming Distance where the corresponding bits are different :"+result);
    return result;
    }
    
    private void makeE(int lengthX, int lengthY, String inputBinaryX, String inputBinaryY) {
        if (lengthX > lengthY) {
            int help = lengthX - lengthY;
            for (int i = 0; i < help; i++) {
                inputBinaryY = "0" + inputBinaryY;
                //System.out.println(inputBinaryY);
            }
        }
        if (lengthY > lengthX) {
            int help = lengthY - lengthX;
            for (int i = 0; i < help; i++) {
                inputBinaryX = "0" + inputBinaryX;
                //System.out.println(inputBinaryX);
            }
        }
        System.out.println(inputBinaryX + " " + inputBinaryY);
        hammingDistanceCounter(inputBinaryX,inputBinaryY);
    }
    
    private int hammingDistanceCounter(String inputBinaryX,String inputBinaryY){
        if (inputBinaryX.equals(inputBinaryY)){
            result =0;
        }
        if (!inputBinaryX.equals(inputBinaryY)){
            //result =6;
            for(int i=0;i<inputBinaryX.length();i++){
                if (inputBinaryX.charAt(i) != inputBinaryY.charAt(i)){
                    result++;
                }
            }
        }
    
    return result;
    }
}
