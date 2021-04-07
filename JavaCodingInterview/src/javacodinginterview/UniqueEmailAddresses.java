/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodinginterview;

import java.util.Arrays;

/**
 *
 * @author barcz
 */
public class UniqueEmailAddresses {
    
    private int output;
    private String[] newEmail;
    private String help;
    private String help2;
    public int numUniqueEmails(String[] emails) {
        
        newEmail = new String[emails.length];
        char c;
        
        
        //System.out.println(emails[1]);
        //System.out.println("emails : "+Arrays.toString(emails));
        for(int i=0;i<emails.length;i++){
            //System.out.println(emails[i]);
            help = emails[i];
            for(int j=0;j<help.length();j++){
                c=help.charAt(j);
                Character c2 = new Character('Z');
                //boolean res = c.equals(c2);
            }
            System.out.println(help2);
            //newEmail[i] = emails[i];
            //for(int j=0;j<)
        }
        
        return output;
    }
    
}
