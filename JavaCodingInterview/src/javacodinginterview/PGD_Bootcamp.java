/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class PGD_Bootcamp {
    
    private int x;
    
    public void kiirname(String name){
        String Name = name;
        Scanner input = new Scanner(System.in);
        System.out.println("Please give the x number: ");
        if (input.hasNextInt()){
            x = input.nextInt();
        }
        else {
            System.out.println("ERROR");
        };
        for(int i=0;i<x;i++){
            System.out.println("Hello "+Name);
        }
        
    
    }
}
