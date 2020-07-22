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
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.
(Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)

We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.

Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)

 

Example 1:

Input: cells = [0,1,0,1,1,0,0,1], N = 7
Output: [0,0,1,1,0,0,0,0]
Explanation: 
The following table summarizes the state of the prison on each day:
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]
* 1,0,0,1,0,0,1,0
* 0,0,1,1,1,1,1,0
 */
public class PrisonCellsAfterNDays {
    
    private int[] result;
    
    
     public int[] solution(int[] cells, int N) {
         
         System.out.println("\n prison will run day :"+N);
         
         System.out.println("\n day : 0");
         for(int i=0;i<cells.length;i++){
             System.out.print(" "+cells[i]);
         }
         
         
         
         result = new int[cells.length];
         result[0] = 0;
         //result[cells.length-1] = cells[cells.length-1];
         result[cells.length-1] = 0;
         
         
         for (int i = 1; i <= N; i++) {
             System.out.println("\n day :" + i);
             for(int j = 1; j < cells.length - 1; j++) {
                 //System.out.print(" " + cells[j]);
                 if (cells[j-1] == cells[j+1]){
                     result[j] =1;
                 } else {
                     result[j] =0;
                 }  
             }
             for(int x=0;x<result.length;x++){
             System.out.print(" "+result[x]);
             cells[x] = result[x];
         }
             
         }
        
         return result;
    }
    
}
