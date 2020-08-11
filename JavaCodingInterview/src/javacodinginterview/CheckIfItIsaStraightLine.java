/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.Arrays;

/**
 *
 * @author barcz
 */
public class CheckIfItIsaStraightLine {
    
    private boolean result;
    
     public boolean solution(int[][] coordinates) {
         
         
         for(int i=0;i<3;i++){
             System.out.print(coordinates[i][1]);
         }
        
         
         System.out.println("\n "+coordinates[1][1]);
         
         String[][] phones = {{"Apple", "iPhone"}, {"Samsung", "Galaxy"}, {"Sony", "Xperia"}}; 
         System.out.println("Hot phones .. " + phones); 
         System.out.println("Not hot? See again.." + Arrays.deepToString(phones));
         System.out.println("Not hot? See again.." + Arrays.toString(phones));

         int rows = 5;
         int columns = 3;

         int[][] array = new int[rows][columns];

         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 array[i][j] = 0;
             }
         }

         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 System.out.print(array[i][j]);
             }
             System.out.println();
         }

         return result;
    }
    
}
