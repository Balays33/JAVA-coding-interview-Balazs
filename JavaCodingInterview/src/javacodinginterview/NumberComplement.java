/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

/**
 *
 * @author barcz
 */
public class NumberComplement {

    private int result;
    private int binalyNumber;
    private int newbinalyNumber;
    private String lengthofNumber;
    private int position;
    private String test;
   
    StringBuilder sb = new StringBuilder();

    public int solution (int input) {

        System.out.println(" input number:" +input);
        lengthofNumber = Integer.toBinaryString(input);
        System.out.println("input number binary : "+Integer.toBinaryString(input));
        binalyNumber = Integer.parseInt(Integer.toBinaryString(input));
        //System.out.println(binalyNumber);

        for(int i=0;i<lengthofNumber.length();i++){
            position = Character.getNumericValue(lengthofNumber.charAt(i));
            //System.out.println(position);
            if (position == 0){
                position =1;
                sb.append(position);
            } else {
                position =0;
                sb.append(position);
            }
            //System.out.println(position);
            //test = position.
        }
            System.out.println(" new binary number: "+sb);
            //newbinalyNumber = Integer.parseInt(sb.toString());
            //System.out.println(newbinalyNumber);
            String singleString = sb.toString();
            result = Integer.parseInt(singleString);
            int result=Integer.parseInt(singleString,2);  
            System.out.println(result);  
            
        //String myString = "12345";
        //int foo = Character.getNumericValue(myString.charAt(2));
        //System.out.println(foo);
    return result;
    }

}
