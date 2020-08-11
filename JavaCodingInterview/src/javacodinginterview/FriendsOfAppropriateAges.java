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
 * 
 * Some people will make friend requests. The list of their ages is given and ages[i] is the age of the ith person. 

Person A will NOT friend request person B (B != A) if any of the following conditions are true:

            age[B] <= 0.5 * age[A] + 7
            age[B] > age[A]
            age[B] > 100 && age[A] < 100
Otherwise, A will friend request B.

Note that if A requests B, B does not necessarily request A.  Also, people will not friend request themselves.

How many total friend requests are made?
 */
public class FriendsOfAppropriateAges {
    
    
    private int result =0;
    private boolean friendAB;
    private boolean friendBA;
    public int Solution(int[] ages) {
        
        for(int i=0;i<ages.length;i++){
            System.out.print(" "+ages[i]);
        }
        
        System.out.println("\n");
        /*
        for(int i=0;i<ages.length-1;i++){
            friendAB = true;
            friendBA = false;
            for(int j=i+1;j<ages.length;j++){
                if(ages[j]>ages[i] || (ages[j] > 100 && ages[i] < 100) || ages[j]>ages[i]){
               
                    System.out.print("ages[i] "+ages[i]+" ages[j]"+ages[j]);
                    friendAB = false;
                    friendBA = true;
                }
                
                if(friendAB){
                    result++;
                }
                if(friendBA){
                    result++;
                }
            }
        }
        */
        
        int[] count = new int[121];
        for (int age: ages) count[age]++;

        
        for (int ageA = 0; ageA <= 120; ageA++) {
            int countA = count[ageA];
            for (int ageB = 0; ageB <= 120; ageB++) {
                int countB = count[ageB];
                if (ageA * 0.5 + 7 >= ageB) continue;
                if (ageA < ageB) continue;
                if (ageA < 100 && 100 < ageB) continue;
                result += countA * countB;
                if (ageA == ageB) result -= countA;
            }
        }
        
        System.out.println("\n"+result);
        return result;
    }
    
}
