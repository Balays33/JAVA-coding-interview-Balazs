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
public class LicenseKeyFormatting {
    
    String result ="";
    
    public String licenseKeyFormatting(String s, int k) {
        
        System.out.println("your String: "+s);
        System.out.println("license key divider number:"+k);
        
        String help;
        help = s.toUpperCase();
        
        for(int i=0;i<help.length();i++){
            if(help.charAt(i) != '-'){
                result +=help.charAt(i);
                }
            }
        divider(result,k);
        System.out.println("result: "+result);
        return result;
    }
    
    private String divider(String z,int k){
        System.out.println("divider result: "+z);
        /*
        for(int i=(result.length()-1);i>=0;i--){
            System.out.print(" "+);
        }
        */
        int maradek = z.length() % k; 
        System.out.println("maradek: "+maradek);
         
        for(int i=(z.length()-1);i>=0;i--){
            
        }
        
    return result;
    }
    
     public String licenseKeyFormattingVERSION2(String s, int k) {
        if (s == null || s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        int count = k;
        int i = s.length()-1;
        while (i >= 0) {
            char c = s.charAt(i);
            if (c != '-') {
                c = Character.toUpperCase(c);
                if (count == 0) {
                    count = k;
                    sb.append('-');
                }
                sb.append(c);
                count--;
            }
            i--;
        }
        System.out.println("vesion 2 result:"+sb.reverse().toString());
        return sb.reverse().toString();
    }
    
    
}


