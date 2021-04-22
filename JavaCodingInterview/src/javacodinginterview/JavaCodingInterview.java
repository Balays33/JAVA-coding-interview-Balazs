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
         MergeSortedArray mergeSortedArray = new MergeSortedArray();
         JewelsandStones jewelsandStones = new JewelsandStones();
         The3Sum the3Sum = new The3Sum();
         PascalsTriangle pascalsTriangle = new PascalsTriangle();
         ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
         LargestNumberAtLeastTwiceofOthers  largestNumberAtLeastTwiceofOthers = new LargestNumberAtLeastTwiceofOthers();
         SortanArray sortanArray = new SortanArray();
         SubarraySumEqualsK subarraySumEquals = new SubarraySumEqualsK();
         TwoSumII twoSumII = new TwoSumII();
         SortColors sortColors = new SortColors();
         The4Sum the4Sum = new The4Sum(); 
         ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
         CircularArrayLoop  circularArrayLoop = new CircularArrayLoop();
         FindtheDuplicateNumber findtheDuplicateNumber = new FindtheDuplicateNumber();
         FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
         MaxDistToClosest maxDistToClosest = new MaxDistToClosest();
         LongestMountaininArray longestMountaininArray = new LongestMountaininArray();
         PlusOne plusOne = new PlusOne();
         PrisonCellsAfterNDays prisonCellsAfterNDays = new PrisonCellsAfterNDays();
         CheckIfItIsaStraightLine checkIfItIsaStraightLine = new CheckIfItIsaStraightLine();
         FriendsOfAppropriateAges friendsOfAppropriateAges = new FriendsOfAppropriateAges();
         MonotonicArray monotonicArray = new MonotonicArray();
         ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
         RotateArray rotateArray = new RotateArray();
         LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
         PGD_Bootcamp pgd_Bootcamp = new PGD_Bootcamp(); 
         Gyakorlas gyak = new Gyakorlas();
         FizzBuzz fizzBuzz = new FizzBuzz();
         UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
         ReverseInteger reverseInteger = new ReverseInteger();
         RomantoInteger romantoInteger = new RomantoInteger();
         ValidPalindrome validPalindrome = new ValidPalindrome();
         
         
          do {
            System.out.println("\n Please choose which program would you like to run :");
            System.out.println("666: Help test menu");
            System.out.println("1: Two Sum"); 
            System.out.println("2: Max Consecutive Ones");
            System.out.println("3: Number Complement");
            System.out.println("4: Hamming Distance");
            System.out.println("5: Palindrome Number");
            System.out.println("6: Merge Sorted Array");
            System.out.println("7: Jewels and Stones");
            System.out.println("8: 3Sum");
            System.out.println("9: Pascal`s Triangle");
            System.out.println("10: Product of Array Except Self");
            System.out.println("11: Largest Number At Least Twice of Others");
            System.out.println("12: Sort an Array");
            System.out.println("13: Subarray Sum Equals K");
            System.out.println("14: Two Sum II - Input array is not sorted");
            System.out.println("15: Sort Colors");
            System.out.println("16: 4Sum");
            System.out.println("17: ContainerWithMostWater");
            System.out.println("18: Circular Array Loop");
            System.out.println("19: Find the Duplicate Number");
            System.out.println("20: First Missing Positive");
            System.out.println("21: First Missing Positive");
            System.out.println("22: Longest Mountain in Array");
            System.out.println("23: Plus One");
            System.out.println("24: Prison Cells After N Days");
            System.out.println("25: Check If It Is a Straight Line");
            System.out.println("26: Friends Of Appropriate Ages");
            System.out.println("27: MonotonicArray");
            System.out.println("28: Toeplitz Matrix");
            System.out.println("29: Rotate Array");
            System.out.println("30: LongestSubstringWithoutRepeatingCharacters");
            System.out.println("31: PGD_Bootcamp");
            System.out.println("32: TESZT Gyakorlas");
            System.out.println("33: Fizz Buzz");
            System.out.println("34: Unique Email Addresses");
            System.out.println("35: Reverse Integer");
            System.out.println("36: Roman to Integer");
            System.out.println("37: Valid Palindrome");
            
            
            
           
             
            
            
            
            
             
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
                        case 6:
                            int[] mergeSortedArrayM = {1,2,3};
                            int[] mergeSortedArrayN = {2,5,6};
                            mergeSortedArray.solution(mergeSortedArrayM,mergeSortedArrayN);
                        case 7:
                            String jewelsandStonesJ = "aA";
                            String jewelsandStonesS =  "aAAbbbb";  
                            jewelsandStones.solution(jewelsandStonesJ,jewelsandStonesS);
                        case 8:
                            int[] the3Sumnums = {-1, 0, 1, 2, -1, -4};
                            the3Sum.solution(the3Sumnums);
                            break;
                        case 9:
                            int pascalsTriangleN = 5;
                            pascalsTriangle.generate(pascalsTriangleN);
                            break;
                        case 10:
                            //int[] productofArrayExceptSelfN = {1,2,3,4};
                            int[] productofArrayExceptSelfN = {4,5,1,8,2};
                            productofArrayExceptSelf.productExceptSelf(productofArrayExceptSelfN);
                            productofArrayExceptSelf.productExceptSelf2(productofArrayExceptSelfN);
                            break;
                        case 11:
                            //int[] largestNumberAtLeastTwiceofOthersN = {3, 6, 1, 0};
                            int[] largestNumberAtLeastTwiceofOthersN = {1, 2, 3, 4};
                            largestNumberAtLeastTwiceofOthers.dominantIndex(largestNumberAtLeastTwiceofOthersN);
                            break;
                        case 12:
                            int[] sortanArrayN = {5,2,3,1};
                            //sortanArrayN = {5,1,1,2,0,0};
                            sortanArray.solution(sortanArrayN);
                            break;
                        case 13:
                            //int[] subarraySumEqualsN = {1,1,1};
                            //int subarraySumEqualsK = 2;
                            int[] subarraySumEqualsN = {4,9,8,1,2,4};
                            int subarraySumEqualsK = 7;
                            subarraySumEquals.solution(subarraySumEqualsN,subarraySumEqualsK);
                            break;
                        case 14:
                            int[] twoSumNumsX = {15,7,11,2};
                            int twoSumtargetX = 9;
                            twoSumII.solution(twoSumNumsX, twoSumtargetX);
                            break;
                        case 15:
                            int[] sortColorsN = {2,0,2,1,1,0};
                            sortColors.solution(sortColorsN);
                            break;
                        case 16:
                            int[] the4SumN = {1, 0, -1, 0, -2, 2};
                            int the4SumT =0;
                            the4Sum.solution(the4SumN,the4SumT);
                            break;
                        case 17:
                            int[] containerWithMostWaterN = {1,8,6,2,5,4,8,3,7};
                            containerWithMostWater.Solution(containerWithMostWaterN);
                            break;
                        case 18:
                            //int[] circularArraycLoopN = {2,-1,1,2,2};
                            int[] circularArraycLoopN = {-2,1,-1,-2,-2};
                            //int[] circularArraycLoopN = {4,1,3,1,2};
                            circularArrayLoop.solution(circularArraycLoopN);
                            circularArrayLoop.circularArrayLoop(circularArraycLoopN);
                            break;
                        case 19:
                            //int[] findtheDuplicateNumberN = {1,3,4,2,2};
                            //int[] findtheDuplicateNumberN = {3,1,3,4,2};
                            int[] findtheDuplicateNumberN = {3,1,3,4,2,4,4,2,1,6,7};
                            findtheDuplicateNumber.solution(findtheDuplicateNumberN);
                            break;
                        case 20:
                            int[] firstMissingPositiveN = {1,2,0};
                            //int[] firstMissingPositiveN = {3,4,-1,1};
                            //int[] firstMissingPositiveN = {7,8,9,11,12};
                            firstMissingPositive.Solution(firstMissingPositiveN);
                            break;
                        case 21:
                            //int[] maxDistToClosestN= {1,0,0,0,1,0,1};
                            int[] maxDistToClosestN= {1,0,0,0};
                            maxDistToClosest.solution(maxDistToClosestN);
                            break;
                        case 22:
                            //int[] longestMountaininArrayN = {2,1,4,7,3,2,5};
                            //int[] longestMountaininArrayN = {2,2,2};
                            int[] longestMountaininArrayN = {2,2,2,3,6,7,1,2,3,4,4,3,2,1};
                            //longestMountaininArray.solution(longestMountaininArrayN);
                            longestMountaininArray.MountainLongest(longestMountaininArrayN);
                            longestMountaininArray.longestMountain(longestMountaininArrayN);
                            break;
                        case 23:
                            //int[] plusOneN = {1,2,3};
                            int[] plusOneN = {4,3,2,1};
                            plusOne.plusOne(plusOneN);
                            break;
                        case 24:
                            //int[] PrisonCellsAfterNDaysN = {0,1,0,1,1,0,0,1};
                            int[] PrisonCellsAfterNDaysN = {1,0,0,1,0,0,1,0};
                            //int PrisonCellsAfterNDaysSZ = 7;
                            int PrisonCellsAfterNDaysSZ = 1000000000;
                            prisonCellsAfterNDays.solution(PrisonCellsAfterNDaysN, PrisonCellsAfterNDaysSZ);
                            break;
                        case 25:
                            int[][] checkIfItIsaStraightLineN = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
                            //int[][] checkIfItIsaStraightLineN = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
                            checkIfItIsaStraightLine.solution(checkIfItIsaStraightLineN);
                            break;
                        case 26:
                            //int[] friendsOfAppropriateAgesN = {16,16};
                            int[] friendsOfAppropriateAgesN = {16,17,18};
                            friendsOfAppropriateAges.Solution(friendsOfAppropriateAgesN);
                            break;
                        case 27:
                            //int[] monotonicArrayN = {1,2,2,3};
                            //int[] monotonicArrayN = {6,5,4,4};
                            //int[] monotonicArrayN = {1,3,2};
                            //int[] monotonicArrayN = {1,2,3,4,5};
                            int[] monotonicArrayN = {1,1,1};
                            monotonicArray.isMonotonic(monotonicArrayN);
                            break;
                        case 28:
                            /*
                            int[][] toeplitzMatrixN = {
                                {1,2,3,4},
                                {5,1,4,3},
                                {9,5,1,2}
                            };
                            */
                            /*
                            int[][] toeplitzMatrixN = {
                                {1,2,3,4},
                                {5,1,2,3},
                                {9,5,1,2}
                            };
                            */
                            /*
                            int[][] toeplitzMatrixN = {
                                {1,2},
                                {1,2}
                            };
                            */
                            int[][] toeplitzMatrixN = {
                                {1,1,1,1},
                                {1,1,4,1},
                                {1,1,1,1}
                            };
                            toeplitzMatrix.Solution(toeplitzMatrixN);
                            break;
                        case 29:
                            int[] rotateArrayN = {1,2,3,4,5,6,7};
                            int rotateArrayS = 3;
                            rotateArray.Solution(rotateArrayN, rotateArrayS);
                            break;
                            
                        case 30:
                            String s = "abcabcbb";
                            longestSubstringWithoutRepeatingCharacters.Solutin(s);
                            break;
                        case 31:
                           //pgd_Bootcamp.
                            break;
                        case 32:
                            //gyak.kiir();
                            gyak.longR();
                            break;
                        case 33:
                            int fizzBuzzN = 15;
                            fizzBuzz.fizzBuzz(fizzBuzzN);
                            break;
                        case 34:
                            String[] inputemail = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
                            uniqueEmailAddresses.numUniqueEmails(inputemail);
                            break;
                        case 35:
                            int reverseIntegerN =0;
                            System.out.println("Please give me a integer : ");
                            Scanner reverseI = new Scanner(System.in);
                            if (reverseI.hasNextInt()) {
                                reverseIntegerN = reverseI.nextInt();
                            } else {
                                System.out.println("It is not integer");
                            }
                            //int reverseIntegerN = reverseI.nextInt();
                            //int reverseIntegerN = 123;
                            reverseInteger.solution(reverseIntegerN);
                            break;
                        case 36:
                            String romantoIntegerS = "LVIII";
                            //String romantoIntegerS = "IIIi";
                            //romantoInteger.romanToInt(romantoIntegerS);
                            romantoInteger.romanToInt(romantoIntegerS);
                            break;
                        case 37:
                            //String validPalindromeS =  "A man, a plan, a canal: Panama";
                            String validPalindromeS =  "Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era";
                            validPalindrome.isPalindrome(validPalindromeS);
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
