/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.coding.interview.balazs;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class JAVACodingInterviewBalazs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menuNumber;
        
        
        //TwoSum twoSum = new TwoSum();
        
        do{
        System.out.println("\n Please choose which program would you like to run :");
        System.out.println("666: Help test menu");
        System.out.println("1: TwoSum");  
        
        
        
        System.out.println("0: EXIT");
        
        Scanner input =  new Scanner(System.in);
        if (input.hasNextInt()) {
                    menuNumber = input.nextInt();
                    
                    switch (menuNumber) {
                        case 0:
                            
                            break;
                        case 1:
                            break;
                            
                        default:
                            System.exit(0);
                     }
                     
                     
                } else {
                    break;
                }
                
        } while (menuNumber!=0);
        
    }     
}
