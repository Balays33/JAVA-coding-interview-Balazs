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
public class JavaCodingInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int menuNumber;
         TwoSum twoSum = new TwoSum();
         MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
         NumberComplement numberComplement = new NumberComplement();
         HammingDistance hammingDistance = new HammingDistance();
         PalindromeNumber palindromeNumber = new PalindromeNumber();
         
         
          do {
            System.out.println("\n Please choose which program would you like to run :");
            System.out.println("666: Help test menu");
            System.out.println("1: Two Sum"); 
            System.out.println("2: Max Consecutive Ones");
            System.out.println("3: Number Complement");
            System.out.println("4: Hamming Distance");
            System.out.println("5: Palindrome Number");
            
            
             
            System.out.println("0: EXIT");
                Scanner input =  new Scanner(System.in);
                if (input.hasNextInt()) {
                    menuNumber = input.nextInt();
                   
                    
                    
                    switch (menuNumber){
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            int[] twoSumNums = {2, 7, 11, 15};
                            int twoSumtarget = 9;
                            twoSum.solution(twoSumNums, twoSumtarget);
                            break;
                        case 2:
                            //int[] maxConsecutiveOnesInput = {1,1,0,1,1,1};
                            int[] maxConsecutiveOnesInput = {1,1,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1};
                            maxConsecutiveOnes.solution(maxConsecutiveOnesInput);
                            break;
                        case 3:
                            int numberComplementNumber = 5;
                            numberComplement.solution(numberComplementNumber);
                            break;
                        case 4:
                            int hammingInput = 11;
                            int hammingInput2 = 23;
                            hammingDistance.solution(hammingInput, hammingInput2);
                            break;
                        case 5:
                            int palindromeNumberN = 121;
                            palindromeNumber.solution(palindromeNumberN);
                            break;
                        default:
                            System.exit(0);
                    }
                        
                    
                    
                }else {
                            break;
                            }
          
                }while(menuNumber!=0);
                
                    
    }
    
}
