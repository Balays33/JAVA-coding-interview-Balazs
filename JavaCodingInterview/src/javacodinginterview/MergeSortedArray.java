/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author barcz
 */
public class MergeSortedArray {
    
    private int[] result;
    private ArrayList<Integer> newList = new ArrayList<Integer>();
    
    
    public int[] solution(int[] m,int[] n){
        
        for(int i=0;i<m.length;i++){
            System.out.print(" "+m[i]);
        }
        System.out.println("\n ");
        for(int i=0;i<n.length;i++){
            System.out.print(" "+n[i]);
        }
        System.out.println("\n new ArrayList: ");
        for(int i=0;i<m.length;i++){
            newList.add(m[i]);
        }
        for(int i=0;i<n.length;i++){
            newList.add(n[i]);
        }
        Collections.sort(newList);
        for(int i=0;i<newList.size();i++){
            System.out.print(" "+newList.get(i));
        }
        result = new int[newList.size()];
        
        for(int i=0;i<newList.size();i++){
            result[i] += newList.get(i);
        }
        
        
        
       
    return result;
    }
    
}
