/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author barcz
 */
public class The4Sum {

    private int[] myintlist;
    private ArrayList<Integer> result = new ArrayList<Integer>();
    List<Integer> intList;

    public void solution(int[] nums, int target) {
        System.out.println("\n target:" + target);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }

        //a + b + c + d = target
        myintlist = new int[4];
        System.out.println("\n ");
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int x = j + 1; x < nums.length - 1; x++) {
                    for (int y = x + 1; y < nums.length; y++) {
                        myintlist[0] = nums[i];
                        myintlist[1] = nums[j];
                        myintlist[2] = nums[x];
                        myintlist[3] = nums[y];
                        //kiir();
                        if ((myintlist[0] + myintlist[1] + myintlist[2] + myintlist[3]) == target) {
                            //System.out.println("\n Talalat");
                            result.add(myintlist[0]);
                            result.add(myintlist[1]);
                            result.add(myintlist[2]);
                            result.add(myintlist[3]);
                            /*
                            intList = new ArrayList<Integer>(myintlist.length);
                            System.out.println("\n hi "+myintlist.length);
                            for (int s=0;s<intList.size();s++) {
                                intList.add(myintlist[s]);
                             */   
                            }
                        }
                    }
                }
            }
        
        System.out.println("\n hi there"+result.size());
        int count = 0;
        for (int i = 0; i < result.size(); i++) {
            System.out.print(" " + result.get(i));
            count++;
            if(count == 4){
                System.out.println("\n ");
                count =0;
            }
            
            
        }
    
        }
        
         //int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         //int[] number2 = {11, 22, 33, 44};
         //List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
         //list = Arrays.stream(number2).boxed().collect(Collectors.toList());
        //System.out.println("list : " + list);
    
    /*
    private void kiir(){
        System.out.println("\n ");
        for (int i = 0; i < myintlist.length; i++) {
            System.out.print(" " + myintlist[i]);
        }
    }
    */
    

}
