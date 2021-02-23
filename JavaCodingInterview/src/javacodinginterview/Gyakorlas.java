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
public class Gyakorlas {
    
    private int kir;
    private String kirS;
    
    public void kiir(){
        System.out.println("Long time ago I did not program so I am back");
        System.out.println("give me a string: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()){
            kir = input.nextInt();
            System.out.println(kir);
            System.out.println("This is is number");
        } else {
            kirS = input.nextLine();
            System.out.println(kirS);
            System.out.println("This is NOT number");
        }
        
    }
    
    public void longR(){
        int maxlength=0;
        int help =0;
        String input =  "abcabcbb";
        String tempstring ="";
        System.out.println(input);
        System.out.println(tempstring);
        /*
        for (int i =0;i<input.length();i++){
            System.out.println(input.charAt(i));
        }
        */
        /*
        for(int i=0;i<input.length()-1;i++){
            help=1;
            for(int j =i+1;j<input.length();j++){
                if(input.charAt(i)!=input.charAt(j)){
                    help++;
                }else {
                    System.out.println(help);
                    break;
                }
            }
            //System.out.println(help);
            if(maxlength<help){
                maxlength=help;
            }
        }
        */
        for(int i=0;i<input.length()-1;i++){
            tempstring += input.charAt(i);
            for(int j=i+1;j<input.length();j++){
                tempstring += input.charAt(j);
                for(int x=0;x<tempstring.length()-1;x++){
                    for(int y=x+1;y<tempstring.length();y++){
                        if(tempstring.charAt(x)!=tempstring.charAt(y)){}
                    }
                }
            }
        }
        //System.out.println(maxlength);
    }
    
}
