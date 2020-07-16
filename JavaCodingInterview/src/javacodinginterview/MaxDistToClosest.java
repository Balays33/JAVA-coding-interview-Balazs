/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcza
 * 
 * Maximize Distance to Closest Person
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.

Example 1:

Input: [1,0,0,0,1,0,1]
Output: 2
Explanation: 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
Example 2:

Input: [1,0,0,0]
Output: 3
Explanation: 
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
 */
public class MaxDistToClosest {
    private int result;
    private int counter;
    
    public int solution(int[] seats) {
        
        for(int i=0;i<seats.length;i++){
            System.out.print(" "+seats[i]);
        }
        System.out.println("\n");
        /*
        for(int i=0;i<seats.length;i++){
            if(seats[i] == 0){
                counter++;
            }
            if( seats[i] == 1){
                System.out.println("\n counter :"+ counter);
                counter = 0;
            }
            if( i == seats.length-1){
                System.out.println("\n counter :"+ counter);
            }
        }
        */
        for(int i=0;i<seats.length;i++){ 
            if(seats[i] == 1){
                counter =0;
                for(int j=i+1;j<seats.length;j++){
                    if(seats[j] != 1){
                        counter++;
                    } 
                    if( seats[j] == 1){
                        System.out.println("\n counter :"+ counter);
                        counter = 0;
                    }
                }
            }
            
        }
        
        return result;
    }
    
}
