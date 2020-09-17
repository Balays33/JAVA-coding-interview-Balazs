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
public class ToeplitzMatrix {
    
    private boolean result = true;
    private int help;
    
    public boolean Solution(int[][] matrix) {
        
        
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix.length;y++){
                System.out.print(" "+matrix[x][y]);
            }
            System.out.println("\n");
        }
        for(int x=0;x<matrix.length-1;x++){
            if (result == false){
                break;
            }
            for(int y=0;y<matrix.length-1;y++){
               // if (x == y) {
               //     System.out.print(" "+matrix[x][y]);}
               if (matrix[x][y] == matrix[x+1][y+1]){
                   result = true;
               } else {
                   //System.out.println("\n false");
                   result = false;
                   break;
               }
                
            }
            System.out.println("\n");
        }
        
        //System.out.println(" matrix "+matrix[1][1]);
        
        System.out.println(" result: "+result);
        return result;
        
    }
}
